package com.api.rest.database;
import java.io.*;
import java.sql.*;

import org.springframework.stereotype.Service;

@Service
public class Mysql2CSV{
	 public void exporttocsv() {
	        String jdbcURL = "jdbc:mysql://localhost:3306/employee";
	        String username = "root";
	        String password = "Ashok@8567";
	         
	        String csvFilePath = "Reviews-export.csv";
	         
	        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
	            String sql = "SELECT * FROM entries";
	             
	            Statement statement = connection.createStatement();
	             
	            ResultSet result = statement.executeQuery(sql);
	             
	            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(csvFilePath));
	             
	            // write header line containing column names       
	            fileWriter.write("api,auth,Https,cors,link,category,id,descripion,https");
	             
	            while (result.next()) {
	                String api = result.getString("api");
	                String auth = result.getString("auth");
	                String HTTPS = result.getString("Https");
	                String cors = result.getString("cors");
	                String link = result.getString("link");
	                String category = result.getString("category");
	                String description = result.getString("description");
	                Boolean http = result.getBoolean("http");
	                
	                
	                 
	                
	                    
	                
	        
	                 
	                String line = String.format("\"%s\",%s,%s,%s,%s,%s",
	                        api,auth,HTTPS,cors,link,category,description);
	                 
	                fileWriter.newLine();
	                fileWriter.write(line);            
	            }
	             
	            statement.close();
	            fileWriter.close();
	             
	        } catch (SQLException e) {
	            System.out.println("Datababse error:");
	            e.printStackTrace();
	        } catch (IOException e) {
	            System.out.println("File IO error:");
	            e.printStackTrace();
	        }
	         
	    }
	 
	

}
