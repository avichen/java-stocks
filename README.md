Java Stocks 
============

A super simple library to help you retrieve stock data using the Yahoo Finance hidden API. 

## How it works 

Yahoo Finance allows stock data to be downloaded in CSV format. All we have to do is take that CSV file and parse it to get our data. Easy. 

## Usage 

    Stock facebook; 
    StockHelper sh; 

    sh = new StockHelper(); 

    facebook = sh.getStock("FB")` 

## Methods 

The library currently supports the following methods: 

    getPrice(); 
    getChange();
    getVolume(); 
    getPe(); 
    getEps(); 
    getWeek52high(); 
    getWeek52low(); 
    getDaylow(); 
    getDayhigh(); 
    getMovingav50day(); 
    getMarketcap();
