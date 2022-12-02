package com.build.stockdataapplication.service;

import com.build.stockdataapplication.model.StockWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class StockServiceTest {

    @Autowired
    private StockService stockService;

    @Test
    void invoke() throws IOException
    {
        //-----------------ADC-----------------
        final StockWrapper stockADC = stockService.findStock("ADC");
        final BigDecimal priceADC = stockService.findPrice(stockADC);
        final BigDecimal annualYieldADC = stockService.findAnnualYieldDividend(stockADC);
        BigDecimal dividendADC = BigDecimal.valueOf(2.88);
        final BigDecimal divEfficiencyADC = dividendADC.divide(priceADC, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of ADC is: " + divEfficiencyADC);

    }


    @Test
    void multiple() throws IOException, InterruptedException{
        String[] stockList = {"AGNC", "BRMK", "EFC", "ARR"};
        final List<StockWrapper> stocks = stockService.findStocks(Arrays.asList(stockList));
        //findPrices(stocks);
        stocks.forEach(stock->{
            try {
                stockService.findPrice(stock);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        Thread.sleep(16000);

    }

}
