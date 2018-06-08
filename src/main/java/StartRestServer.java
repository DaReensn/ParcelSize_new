package main.java;

import java.io.IOException;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

@SuppressWarnings("restriction")
public class StartRestServer {


	public static void main(String[] args) throws IllegalArgumentException, IOException {
		HttpServer server = HttpServerFactory.create( "http://localhost:8443/parcel" );
		server.start();
		
	}

}