package DesignPatterns.BuilderPattern;

import java.net.http.HttpRequest;

public class Main {
    public static void main(String[] args){
        HttpRequestDirector director = new HttpRequestDirector();
        HttpRequest get = director.buildGet("https://api.example.com/users");
        HttpRequest post = director.buildAuthenticatedPost("https://api.example.com/orders", "token123", "{\"item\":\"book\"}");
        HttpRequest internal = director.buildInternalServiceCall("https://internal.service/health");
        System.out.println(get);
        System.out.println(post);
        System.out.println(internal);
    }
}
