package com.build.stockdataapplication.controller;

import com.build.stockdataapplication.model.StockWrapper;
import com.build.stockdataapplication.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class StockController {

    @Autowired
    private StockService stockService;



    /*
    public String index() throws IOException {
        final StockWrapper dollarTl = stockService.findStock("TRY=X");

        final BigDecimal priceDollarTl = stockService.findPrice(dollarTl);
        System.out.println("----------$/TL----------");
        System.out.println("Price: " + priceDollarTl);
     */

    private List<StockWrapper> listStocks;

    @PostConstruct
    private void multiple() {

        String[] stockList = {"AGNC","ARR","ORC","APLE"};
        listStocks = stockService.findStocks(Arrays.asList(stockList));
        ArrayList<String> stockNamesX = new ArrayList<>();
        ArrayList<BigDecimal> stockPricesX= new ArrayList<>();
        ArrayList<BigDecimal> stockYieldsX= new ArrayList<>();

        for(int stock=0; stock<listStocks.size(); stock++){
                stockNamesX.add(listStocks.get(stock).getStock().getSymbol());
            try {
                stockPricesX.add(stockService.findPrice(listStocks.get(stock)));
                stockYieldsX.add(stockService.findAnnualYieldDividend(listStocks.get(stock)));
            } catch (IOException e) {

            }


            System.out.println(stockNamesX.get(stock));
            System.out.println(stockPricesX.get(stock));
            System.out.println(stockYieldsX.get(stock));
        }

        StockWrapper stocks1 = new StockWrapper(stockNamesX, stockPricesX, stockYieldsX);
        listStocks = new ArrayList<>();
        listStocks.add(stocks1);




/*
        ArrayList<String> nameX = new ArrayList<>(Arrays.asList("Abdullah", "Fatih", "Muhsin"));
        ArrayList<BigDecimal> priceX = new ArrayList<>(Arrays.asList(BigDecimal.valueOf(1.2), BigDecimal.valueOf(1.7), BigDecimal.valueOf(1.8)));
        ArrayList<BigDecimal> yieldX = new ArrayList<>(Arrays.asList(BigDecimal.valueOf(2.2), BigDecimal.valueOf(2.7), BigDecimal.valueOf(2.8)));
        StockWrapper stocks3 = new StockWrapper(nameX, priceX, yieldX);

        listStocks = new ArrayList<>();
        listStocks.add(stocks3);
*/

        //Thread.sleep(16000);

    }

    @GetMapping("/list")
    public String showStocks(Model model){

        model.addAttribute("stocks", listStocks);
        return "index";
    }

}
