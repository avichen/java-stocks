package com.nhefner.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Pattern;

public class StockHelper {  
	
	static String symbol = ""; 
	static double price = 0.0;
	
	/*
	* 
	* 
	*/
	public Stock getStock(String symbol) {  
		
		Stock stock = new Stock();
		
		try { 
			
			// Retrieve CSV File
			URL yahoo = new URL("http://finance.yahoo.com/d/quotes.csv?s="+ symbol + "&f=l1");
			URLConnection connection = yahoo.openConnection(); 
			InputStreamReader is = new InputStreamReader(connection.getInputStream());
			BufferedReader br = new BufferedReader(is);  
			
			// Parse CSV Into Array
			String line = br.readLine(); 
			String[] stockinfo = line.split(","); 
			
			// Check Our Data
			if (Pattern.matches("N/A", stockinfo[0])) {  
				price = 0.00;   
			} else { 
				price = Double.parseDouble(stockinfo[0]);  
			} 
			
			// Build Stock Object 
			stock = new Stock(symbol, price);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return stock;
		
	}
	
}
