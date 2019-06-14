import java.io.IOException;

import java.util.Map;
import java.sql.*;
//javac -cp sqlite-jdbc-3.23.1.jar; DatabaseExample.java

public class DatabaseExample {

    public static void main(String[] args) throws IOException {
		
		Database   db =  new  Database("jdbc:sqlite:chinook.db" );
		String query = "SELECT invoiceid, invoicedate FROM invoices" +
		               " WHERE customerid = 15;";
		String result = db.selectData(query);
		System.out.println( result );
		
		    
    }    

}