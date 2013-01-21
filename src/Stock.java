
public class Stock {

	private String symbol; 
	private double price; 
	private double change; 
	private int volume; 
	private double pe; 
	private double eps;  
	private double week52low; 
	private double week52high;
	private double daylow;  
	private double dayhigh; 
	private double movingav50day; 
	private double marketcap; 

	
	public Stock() { 
		
	} 
	
	public Stock(String symbol) { 
		
		this.symbol = symbol;   
		
	}  
	
	public Stock(String symbol, double price, double change, int volume, double pe, double eps, double week52low, 
					double week52high, double daylow, double dayhigh, double movingav50day, double marketcap) { 
		
		this.symbol = symbol; 
		this.price = price; 
		this.change = change; 
		this.volume = volume; 
		this.pe = pe; 
		this.eps = eps; 
		this.week52low = week52low; 
		this.week52high = week52high; 
		this.daylow = daylow; 
		this.dayhigh = dayhigh; 
		this.movingav50day = movingav50day; 
		this.marketcap = marketcap;
		
	} 
	
	public String getSymbol() { 
		
		return this.symbol;
		
	}
	
	public double getPrice() { 
		
		return this.price; 
		
	} 
	
	public void setPrice(double price) { 
		
		this.price = price; 
		
	} 
	
	public double getChange() { 
		
		return this.change;
		
	} 
	
	public void setChange(double change) { 
		
		this.change = change;
		
	}  
	
	public int getVolume() { 
		
		return this.volume; 
		
	} 
	
	public void setVolume(int volume) { 
		
		this.volume = volume; 
		
	}
	
	public double getPe() { 
		
		return this.pe; 
		
	} 
	
	public void setPe(double pe) { 
		
		this.pe = pe; 
		
	} 
	
	public double getEps() { 
		
		return this.eps; 
		
	} 
	
	public void setEps(double eps) { 
		
		this.eps = eps; 
		
	} 
	
	public double getWeek52low() { 
		
		return this.week52low;
		
	} 
	
	public void setWeek52low(double week52low) { 
		
		this.week52low = week52low;
		
	} 
	
	public double getWeek52high() { 
		
		return this.week52high; 
		
	} 
	
	public void setWeek52high(double week52high) {  
		
		this.week52high = week52high;
		
	} 
	
	public double getDaylow() { 
		
		return this.daylow;
		
	} 
	
	public void setDaylow(double daylow) { 
		
		this.daylow = daylow;
		
	}  
	
	public double getDayhigh() { 
		
		return this.dayhigh; 
		
	} 
	
	public void setDayhigh(double dayhigh) { 
		
		this.dayhigh = dayhigh;
		
	}
	
	public double getMovingav50day() { 
		
		return this.movingav50day;
		
	} 
	
	public void setMovingav50day(double movingav50day) { 
		
		this.movingav50day = movingav50day;
		
	} 
	
	public double getMarketcap() { 
		
		return this.marketcap;
		
	} 
	
	public void setMarketcap(double marketcap) { 
		
		this.marketcap = marketcap; 
		
	}
	
}
