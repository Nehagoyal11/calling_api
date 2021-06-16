package com.example;

/**
 * Hello world!
 *
 */
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

  
public class App 
{
    public static void main( String[] args ) throws IOException,InterruptedException
    {
        String url="https://api.wazirx.com/api/v2/tickers";
        HttpRequest request =  HttpRequest.newBuilder().GET().uri(URI.create(url)).header("Content-Type", "application/json").build();
        HttpClient client= HttpClient.newBuilder().build();
        HttpResponse <String> response= client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());




        
    }
}