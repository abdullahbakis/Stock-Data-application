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
    private String stockName;
    private BigDecimal stockPrice;
    private BigDecimal stockGrossDividend;
    private BigDecimal stockDividendYield;
    private BigDecimal stockEfficiency;
    private BigDecimal monthlyIncome;


    public StockWrapper() {
    }

    public StockWrapper(String stockName, BigDecimal stockPrice, BigDecimal stockGrossDividend, BigDecimal stockDividendYield, BigDecimal stockEfficiency, BigDecimal monthlyIncome) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.stockGrossDividend = stockGrossDividend;
        this.stockDividendYield = stockDividendYield;
        this.stockEfficiency = stockEfficiency;
        this.monthlyIncome = monthlyIncome;
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

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public BigDecimal getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(BigDecimal stockPrice) {
        this.stockPrice = stockPrice;
    }

    public BigDecimal getStockGrossDividend() {
        return stockGrossDividend;
    }

    public void setStockGrossDividend(BigDecimal stockGrossDividend) {
        this.stockGrossDividend = stockGrossDividend;
    }

    public BigDecimal getStockDividendYield() {
        return stockDividendYield;
    }

    public void setStockDividendYield(BigDecimal stockDividendYield) {
        this.stockDividendYield = stockDividendYield;
    }

    public BigDecimal getStockEfficiency() {
        return stockEfficiency;
    }

    public void setStockEfficiency(BigDecimal stockEfficiency) {
        this.stockEfficiency = stockEfficiency;
    }

    public BigDecimal getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(BigDecimal monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
}
