package com.corejava.java9;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HTTP2Client {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		HttpRequest req =
		   HttpRequest.newBuilder(URI.create("http://www.google.com"))
		              .header("User-Agent", "Java")
		              .GET()
		              .build();

		// New HTTP 2 Client API to support HTTP/2 protocol and WebSocket features
		// It supports both Synchronous (Blocking Mode) and Asynchronous Modes.
		// It supports Asynchronous Mode using the WebSocket API.
		HttpClient client = HttpClient.newHttpClient();

		HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString());
	
		System.out.println("Response was " + resp.body());
		
	}

}
