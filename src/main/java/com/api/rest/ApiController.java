package com.api.rest;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("/getData")
	public String getData() {
		System.out.println("getData is working now");
		URL url;
		try {
			url = new URL("https://api.publicapis.org/entries");

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int responsecode = conn.getResponseCode();
			if (responsecode != 200) {
				throw new RuntimeException("HttpResponseCode: " + responsecode);
			} else {
				System.out.println("success");
				
				Scanner sc = new Scanner(url.openStream());
				String inline = "";
				while(sc.hasNext())
				{
				inline+=sc.nextLine();
				}
				System.out.println("JSON data in string format");
				System.out.println(inline);
				sc.close();
				
				JSONParser parse = new JSONParser();
				JSONObject jobj = (JSONObject) parse.parse(inline);
				JSONArray jsonarr_1 = (JSONArray) jobj.get("entries");
				
				for(int i=0;i<jsonarr_1.size();i++)
				{
				//Store the JSON objects in an array
				//Get the index of the JSON object and print the values as per the index
				JSONObject jsonobj_1 = (JSONObject)jsonarr_1.get(i);
				System.out.println("parse ");
				}
				
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "getData";
	}

}
