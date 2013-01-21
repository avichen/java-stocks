
public class Test { 
	
	public static void main(String args[]) { 
		
		Stock facebook; 
		StockHelper sh; 
		
		sh = new StockHelper();
		
		facebook = sh.getStock("FB"); 
		
		System.out.println(facebook.getPrice());  
		//System.out.println(facebook.getChange());
		System.out.println(facebook.getVolume()); 
		System.out.println(facebook.getPe()); 
		System.out.println(facebook.getEps()); 
		System.out.println(facebook.getWeek52high()); 
		System.out.println(facebook.getWeek52low()); 
		System.out.println(facebook.getDaylow()); 
		System.out.println(facebook.getDayhigh()); 
		System.out.println(facebook.getMovingav50day()); 
		System.out.println(facebook.getMarketcap());
		
		
	}

}
