package org.example;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception
    {
        var url ="https://api.chucknorris.io/jokes/random";
        var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        var httpClient=HttpClient.newBuilder().build();
        var httpResponse =httpClient.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());
    }
}