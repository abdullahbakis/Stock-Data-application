package com.build.stockdataapplication.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.With;
import yahoofinance.Stock;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Getter
@With
@AllArgsConstructor
public class StockWrapper {
    private Stock stock;
    private LocalDateTime lastAccessed;
    private ArrayList<String> stockName;
    private ArrayList<BigDecimal> stockPrice;
    private ArrayList<BigDecimal> stockAnnualYield;


    public StockWrapper() {
    }


    public StockWrapper(ArrayList<String> stockName, ArrayList<BigDecimal> stockPrice, ArrayList<BigDecimal> stockAnnualYield) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.stockAnnualYield = stockAnnualYield;
    }

    public StockWrapper(Stock stock) {
        this.stock = stock;
        lastAccessed = LocalDateTime.now();
    }


    public Stock getStock() {
        return stock;
    }

    public LocalDateTime getLastAccessed() {
        return lastAccessed;
    }

    public ArrayList<String> getStockName() {
        return stockName;
    }

    public void setStockName(ArrayList<String> stockName) {
        this.stockName = stockName;
    }

    public ArrayList<BigDecimal> getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(ArrayList<BigDecimal> stockPrice) {
        this.stockPrice = stockPrice;
    }

    public ArrayList<BigDecimal> getStockAnnualYield() {
        return stockAnnualYield;
    }

    public void setStockAnnualYield(ArrayList<BigDecimal> stockAnnualYield) {
        this.stockAnnualYield = stockAnnualYield;
    }

}
