package com.nhefner.main;

public class Stock { 
	
	String symbol; 
	double price;
	
	public Stock() { 
		
	}  
	
	public Stock(String symbol) { 
		
		this.symbol = symbol;
		
	}
	
	public Stock(String symbol, Double price) {
		
		this.symbol = symbol; 
		this.price = price;	
		
	} 
	
	public String getSymbol() { 
		
		return this.symbol;
		
	} 
	
	public Double getPrice() { 
		
		return this.price;
		
	} 
	
	public void setPrice(double price) { 
		
		this.price = price;
		
	}
	
}
