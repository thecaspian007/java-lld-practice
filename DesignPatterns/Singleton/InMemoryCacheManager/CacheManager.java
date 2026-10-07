package DesignPatterns.Singleton.InMemoryCacheManager;
import java.time.Instant;
import java.util.concurrent.ConcurrentHashMap;

public enum CacheManager {
    INSTANCE;

    private record cacheEntry(String value, Instant expiry){
        boolean isExpired(){
            return expiry != null && Instant.now().isAfter(expiry);
        }
    }

    private final ConcurrentHashMap<String, cacheEntry> cache = new ConcurrentHashMap<>();

    public void put(String key, String value, long ttlSeconds){
        Instant expiry = ttlSeconds > 0 ? Instant.now().plusSeconds(ttlSeconds) : null;
        cache.put(key, new cacheEntry(value, expiry));
    }

    public void put(String key, String value) {
        put(key, value, 0);
    }

    public String get(String key) {
        cacheEntry entry = cache.get(key);
        if(entry == null){
            return null;
        }
        if(entry.isExpired()){
            cache.remove(key);
            return null;
        }
        return entry.value();
    }

    public void remove(String key){
        cache.remove(key);
    }

    public int size(){
        cache.entrySet().removeIf(e -> e.getValue().isExpired());
        return cache.size();
    }

    
}
