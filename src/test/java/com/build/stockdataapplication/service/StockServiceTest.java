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
        //-----------------ORC-----------------
        final StockWrapper stockORC = stockService.findStock("ORC");

        final BigDecimal priceORC = stockService.findPrice(stockORC);
        System.out.println("----------ORC----------");
        System.out.println("Price: " + priceORC);

        final BigDecimal changeORC = stockService.findLastChangePercent(stockORC);
        System.out.println("Change: " + changeORC);


        final BigDecimal annualYieldORC = stockService.findAnnualYieldDividend(stockORC);
        System.out.println("Trailing annual dividend yield: " + annualYieldORC);

        final BigDecimal dividendxORC = BigDecimal.valueOf(1.92);
        final BigDecimal divEfficiencyORC = dividendxORC.divide(priceORC, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));

        System.out.println("efficiemcy: " + divEfficiencyORC);
        //-----------------AGNC-----------------
        final StockWrapper stockAGNC = stockService.findStock("AGNC");

        final BigDecimal priceAGNC = stockService.findPrice(stockAGNC);
        System.out.println("----------AGNC----------");
        System.out.println("Price: " + priceAGNC);

        final BigDecimal changeAGNC = stockService.findLastChangePercent(stockAGNC);
        System.out.println("Change: " + changeAGNC);

    }


    @Test
    void multiple() throws IOException, InterruptedException{
        final List<StockWrapper> stocks=stockService.findStocks(Arrays.asList("AGNC", "BRMK", "EFC", "ARR"));
        findPrices(stocks);

        Thread.sleep(16000);

        final StockWrapper aa = stockService.findStock("ORC");
        stocks.add(aa);

        System.out.println(stockService.findPrice(aa));



        findPrices(stocks);

    }

    private void findPrices(List<StockWrapper> stocks){
        stocks.forEach(stock ->{
            try{
                System.out.println(stockService.findPrice(stock));
            }catch (IOException e){
                // Ignore
            }
        });
    }

}