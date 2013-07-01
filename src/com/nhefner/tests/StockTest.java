package com.nhefner.tests;

import org.junit.Test;

import com.nhefner.main.Stock;
import com.nhefner.main.StockHelper;

public class StockTest { 
	
	@Test
	public void testStock() { 
		
		StockHelper sh = new StockHelper(); 
		Stock facebook = sh.getStock("FB");
		System.out.println("Price: " + facebook.getPrice());
		
	}

}
