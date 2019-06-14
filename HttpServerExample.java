import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;

import java.net.InetSocketAddress;
import java.util.Map;
import java.io.IOException;

import java.util.Map;
import java.sql.*;
//javac -cp sqlite-jdbc-3.23.1.jar; ServerExample.java
public class ServerExample {

    public static void main(String[] args) throws IOException {
		Database   db =  new  Database("jdbc:sqlite:Eric2.db" );		

        int port = 8500;	
        HttpServer server = HttpServer.create(new InetSocketAddress(port),0);

		//Server Webpage
		
		//String htmlFile = Input.readFile("myPage.html");
		//server.createContext("/myPage", new RouteHandler(htmlFile));
		
		String sql = "SELECT * FROM Alcohol";		
		server.createContext("/getname", new RouteHandler(db,sql));
		
        server.start(); 
		
        System.out.println("Server is listening on port " + port );
    }    
}
