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
		System.out.println("Volume: " + facebook.getVolume()); 
		System.out.println("P/E: " + facebook.getPe());
		System.out.println("EPS: " + facebook.getEps());
		System.out.println("Year Low: " + facebook.getWeek52low());
		System.out.println("Year High: " + facebook.getWeek52high());
		System.out.println("Day Low: " + facebook.getDaylow());
		System.out.println("Day High: " + facebook.getDayhigh());
		System.out.println("50 Day Moving Av: " + facebook.getMovingav50day());
		System.out.println("Market Cap: " + facebook.getMarketcap());
	} 

}
