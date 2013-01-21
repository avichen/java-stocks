Java Stocks 
============

A super simple library to help you retrieve stock data using the Yahoo Finance hidden API. 

## How it works 

Yahoo Finance allows stock data to be downloaded in CSV format. All we have to do is take that CSV file and parse it to get our data. Easy. 

## Usage 

`Stock facebook; 
StockHelper sh; 

sh = new StockHelper(); 

facebook = sh.getStock("FB")` 

## Methods 

The library currently supports the following methods: 
`//Get Stock Price 
getPrice(); 

//Get Stock Change 
getChange();
 
//Get Volume 
getVolume(); 

//Get PE Ratio 
getPe(); 

//Get Earnings per Share 
getEps(); 

//Get 52 Week High 
getWeek52high(); 

//Get 52 Week Low 
getWeek52low(); 

//Get Day Low 
getDaylow(); 

//Get Day High 
getDayhigh(); 

//Get 50 Day Moving Average 
getMovingav50day(); 

//Get Market Cap 
getMarketcap();`
