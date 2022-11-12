package com.build.stockdataapplication.controller;

import com.build.stockdataapplication.model.StockWrapper;
import com.build.stockdataapplication.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.math.BigDecimal;

@Controller
public class StockController {
    @Autowired
    private StockService stockService;

    @GetMapping("/")
    void invoke() throws IOException
    {
        //-----------------ORC-----------------
        final StockWrapper stockORC = stockService.findStock("ORC");

        final BigDecimal priceORC = stockService.findPrice(stockORC);
        System.out.println("----------ORC----------");
        System.out.println("Price: " + priceORC);

        final BigDecimal changeORC = stockService.findLastChangePercent(stockORC);
        System.out.println("Change: " + changeORC);

        final BigDecimal mean2000DayPercentORC = stockService.findChangeFrom200MeanPercent(stockORC);
        System.out.println("Mean 2000 Day Percent: " + mean2000DayPercentORC);



        //-----------------AGNC-----------------
        final StockWrapper stockAGNC = stockService.findStock("AGNC");

        final BigDecimal priceAGNC = stockService.findPrice(stockAGNC);
        System.out.println("----------AGNC----------");
        System.out.println("Price: " + priceAGNC);

        final BigDecimal changeAGNC = stockService.findLastChangePercent(stockAGNC);
        System.out.println("Change: " + changeAGNC);

        final BigDecimal mean2000DayPercentAGNC = stockService.findChangeFrom200MeanPercent(stockAGNC);
        System.out.println("Mean 2000 Day Percent: " + mean2000DayPercentAGNC);
    }


}
