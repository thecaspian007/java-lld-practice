package DesignPatterns.BuilderPattern;
import java.net.URI;
import java.net.http.HttpRequest;
import java.time.Duration;

public class HttpRequestDirector {

    public HttpRequest buildGet(String url){
        System.out.println("Get: " + URI.create(url));
        return HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .timeout(Duration.ofSeconds(30))
                .build();
    }

    public HttpRequest buildAuthenticatedPost(String url, String token, String body) {
        System.out.println("Post: " + URI.create(url));
        return HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .timeout(Duration.ofSeconds(100))
                .build();
    }

    public HttpRequest buildInternalServiceCall(String url) {
        System.out.println("Internal: " + URI.create(url));
        return HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .header("X-Internal-Service", "true")
                .header("X-Trace-Id", java.util.UUID.randomUUID().toString())
                .timeout(Duration.ofSeconds(5))
                .build();
    }

}
