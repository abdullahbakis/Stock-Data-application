package com.build.stockdataapplication.controller;

import com.build.stockdataapplication.model.StockWrapper;
import com.build.stockdataapplication.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class StockController {

    @Autowired
    private StockService stockService;

    private List<StockWrapper> listStocks;

    @PostConstruct
    private void multiple() {

        ArrayList<String> stockList = new ArrayList<>(Arrays.asList("TRY=X", "ADC", "AGNC", "APLE", "ARR", "BBD",
                "BBDO", "BKN", "BKT", "BRMK", "CEV", "CMU", "CRT", "CXE", "CXH", "DX",
                "EARN", "ECC", "EFC", "EPR", "EVN", "FT", "GAIN", "GLAD", "GOOD", "GROW", "GWRS",
                "HRZN", "IIM", "IQI", "ITUB", "KSM", "KTF", "LAND", "LEO", "LTC", "MAIN", "MFM", "MFV", "MGF",
                "MIN", "MMT", "MTR", "NXC", "NXN", "NXP", "O", "OIA", "ORC", "OXLC", "OXSQ", "PBA", "PBT",
                "PMM", "PMO", "PPT", "PSEC", "PVL", "SBR", "SCM", "SJT", "SLG", "SLRC", "SOR",
                "STAG", "VCV", "VET", "VGM", "VKQ", "VLT", "VMO", "VPV", "VTN", "WSR"));
        listStocks = stockService.findStocks(stockList);
        ArrayList<String> stockNamesX = new ArrayList<>();
        ArrayList<BigDecimal> stockPricesX = new ArrayList<>();
        ArrayList<BigDecimal> stockYieldsX = new ArrayList<>();
        BigDecimal divisionValue = BigDecimal.valueOf(12.0); //Division value represents months. To get the monthly gross dividend we divide annual dividend to 12.
        MathContext mc4 = new MathContext(4); //Presicion methot for bigdecimals
        MathContext mc2 = new MathContext(2); //Presicion methot for bigdecimals

        int stock;


        for (stock = 0; stock < listStocks.size(); stock++) {
            stockNamesX.add(listStocks.get(stock).getStock().getSymbol());
            try {
                stockPricesX.add(stockService.findPrice(listStocks.get(stock)));
                stockYieldsX.add(stockService.findAnnualYieldDividend(listStocks.get(stock)));
            } catch (IOException e) {
            }
        }

        StockWrapper stocks0 = new StockWrapper("Dollar/TL", stockPricesX.get(0), stockYieldsX.get(0), stockYieldsX.get(0), stockYieldsX.get(0), stockYieldsX.get(0));
        StockWrapper stocks1 = new StockWrapper(stockNamesX.get(1), stockPricesX.get(1), stockYieldsX.get(1).divide(divisionValue, mc2), stockYieldsX.get(1).divide(stockPricesX.get(1), mc2), stockYieldsX.get(1).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(1).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks2 = new StockWrapper(stockNamesX.get(2), stockPricesX.get(2), stockYieldsX.get(2).divide(divisionValue, mc2), stockYieldsX.get(2).divide(stockPricesX.get(2), mc2), stockYieldsX.get(2).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(2).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks3 = new StockWrapper(stockNamesX.get(3), stockPricesX.get(3), stockYieldsX.get(3).divide(divisionValue, mc2), stockYieldsX.get(3).divide(stockPricesX.get(3), mc2), stockYieldsX.get(3).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(3).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks4 = new StockWrapper(stockNamesX.get(4), stockPricesX.get(4), stockYieldsX.get(4).divide(divisionValue, mc2), stockYieldsX.get(4).divide(stockPricesX.get(4), mc2), stockYieldsX.get(4).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(4).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks5 = new StockWrapper(stockNamesX.get(5), stockPricesX.get(5), stockYieldsX.get(5).divide(divisionValue, mc2), stockYieldsX.get(5).divide(stockPricesX.get(5), mc2), stockYieldsX.get(5).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(5).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks6 = new StockWrapper(stockNamesX.get(6), stockPricesX.get(6), stockYieldsX.get(6).divide(divisionValue, mc2), stockYieldsX.get(6).divide(stockPricesX.get(6), mc2), stockYieldsX.get(6).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(6).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks7 = new StockWrapper(stockNamesX.get(7), stockPricesX.get(7), stockYieldsX.get(7).divide(divisionValue, mc2), stockYieldsX.get(7).divide(stockPricesX.get(7), mc2), stockYieldsX.get(7).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(7).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks8 = new StockWrapper(stockNamesX.get(8), stockPricesX.get(8), stockYieldsX.get(8).divide(divisionValue, mc2), stockYieldsX.get(8).divide(stockPricesX.get(8), mc2), stockYieldsX.get(8).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(8).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks9 = new StockWrapper(stockNamesX.get(9), stockPricesX.get(9), stockYieldsX.get(9).divide(divisionValue, mc2), stockYieldsX.get(9).divide(stockPricesX.get(9), mc2), stockYieldsX.get(9).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(9).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks10 = new StockWrapper(stockNamesX.get(10), stockPricesX.get(10), stockYieldsX.get(10).divide(divisionValue, mc2), stockYieldsX.get(10).divide(stockPricesX.get(10), mc2), stockYieldsX.get(10).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(10).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks11 = new StockWrapper(stockNamesX.get(11), stockPricesX.get(11), stockYieldsX.get(11).divide(divisionValue, mc2), stockYieldsX.get(11).divide(stockPricesX.get(11), mc2), stockYieldsX.get(11).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(11).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks12 = new StockWrapper(stockNamesX.get(12), stockPricesX.get(12), stockYieldsX.get(12).divide(divisionValue, mc2), stockYieldsX.get(12).divide(stockPricesX.get(12), mc2), stockYieldsX.get(12).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(12).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks13 = new StockWrapper(stockNamesX.get(13), stockPricesX.get(13), stockYieldsX.get(13).divide(divisionValue, mc2), stockYieldsX.get(13).divide(stockPricesX.get(13), mc2), stockYieldsX.get(13).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(13).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks14 = new StockWrapper(stockNamesX.get(14), stockPricesX.get(14), stockYieldsX.get(14).divide(divisionValue, mc2), stockYieldsX.get(14).divide(stockPricesX.get(14), mc2), stockYieldsX.get(14).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(14).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks15 = new StockWrapper(stockNamesX.get(15), stockPricesX.get(15), stockYieldsX.get(15).divide(divisionValue, mc2), stockYieldsX.get(15).divide(stockPricesX.get(15), mc2), stockYieldsX.get(15).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(15).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks16 = new StockWrapper(stockNamesX.get(16), stockPricesX.get(16), stockYieldsX.get(16).divide(divisionValue, mc2), stockYieldsX.get(16).divide(stockPricesX.get(16), mc2), stockYieldsX.get(16).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(16).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks17 = new StockWrapper(stockNamesX.get(17), stockPricesX.get(17), stockYieldsX.get(17).divide(divisionValue, mc2), stockYieldsX.get(17).divide(stockPricesX.get(17), mc2), stockYieldsX.get(17).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(17).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks18 = new StockWrapper(stockNamesX.get(18), stockPricesX.get(18), stockYieldsX.get(18).divide(divisionValue, mc2), stockYieldsX.get(18).divide(stockPricesX.get(18), mc2), stockYieldsX.get(18).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(18).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks19 = new StockWrapper(stockNamesX.get(19), stockPricesX.get(19), stockYieldsX.get(19).divide(divisionValue, mc2), stockYieldsX.get(19).divide(stockPricesX.get(19), mc2), stockYieldsX.get(19).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(19).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks20 = new StockWrapper(stockNamesX.get(20), stockPricesX.get(20), stockYieldsX.get(20).divide(divisionValue, mc2), stockYieldsX.get(20).divide(stockPricesX.get(20), mc2), stockYieldsX.get(20).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(20).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks21 = new StockWrapper(stockNamesX.get(21), stockPricesX.get(21), stockYieldsX.get(21).divide(divisionValue, mc2), stockYieldsX.get(21).divide(stockPricesX.get(21), mc2), stockYieldsX.get(21).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(21).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks22 = new StockWrapper(stockNamesX.get(22), stockPricesX.get(22), stockYieldsX.get(22).divide(divisionValue, mc2), stockYieldsX.get(22).divide(stockPricesX.get(22), mc2), stockYieldsX.get(22).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(22).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks23 = new StockWrapper(stockNamesX.get(23), stockPricesX.get(23), stockYieldsX.get(23).divide(divisionValue, mc2), stockYieldsX.get(23).divide(stockPricesX.get(23), mc2), stockYieldsX.get(23).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(23).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks24 = new StockWrapper(stockNamesX.get(24), stockPricesX.get(24), stockYieldsX.get(24).divide(divisionValue, mc2), stockYieldsX.get(24).divide(stockPricesX.get(24), mc2), stockYieldsX.get(24).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(24).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks25 = new StockWrapper(stockNamesX.get(25), stockPricesX.get(25), stockYieldsX.get(25).divide(divisionValue, mc2), stockYieldsX.get(25).divide(stockPricesX.get(25), mc2), stockYieldsX.get(25).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(25).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks26 = new StockWrapper(stockNamesX.get(26), stockPricesX.get(26), stockYieldsX.get(26).divide(divisionValue, mc2), stockYieldsX.get(26).divide(stockPricesX.get(26), mc2), stockYieldsX.get(26).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(26).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks27 = new StockWrapper(stockNamesX.get(27), stockPricesX.get(27), stockYieldsX.get(27).divide(divisionValue, mc2), stockYieldsX.get(27).divide(stockPricesX.get(27), mc2), stockYieldsX.get(27).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(27).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks28 = new StockWrapper(stockNamesX.get(28), stockPricesX.get(28), stockYieldsX.get(28).divide(divisionValue, mc2), stockYieldsX.get(28).divide(stockPricesX.get(28), mc2), stockYieldsX.get(28).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(28).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks29 = new StockWrapper(stockNamesX.get(29), stockPricesX.get(29), stockYieldsX.get(29).divide(divisionValue, mc2), stockYieldsX.get(29).divide(stockPricesX.get(29), mc2), stockYieldsX.get(29).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(29).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks30 = new StockWrapper(stockNamesX.get(30), stockPricesX.get(30), stockYieldsX.get(30).divide(divisionValue, mc2), stockYieldsX.get(30).divide(stockPricesX.get(30), mc2), stockYieldsX.get(30).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(30).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks31 = new StockWrapper(stockNamesX.get(31), stockPricesX.get(31), stockYieldsX.get(31).divide(divisionValue, mc2), stockYieldsX.get(31).divide(stockPricesX.get(31), mc2), stockYieldsX.get(31).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(31).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks32 = new StockWrapper(stockNamesX.get(32), stockPricesX.get(32), stockYieldsX.get(32).divide(divisionValue, mc2), stockYieldsX.get(32).divide(stockPricesX.get(32), mc2), stockYieldsX.get(32).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(32).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks33 = new StockWrapper(stockNamesX.get(33), stockPricesX.get(33), stockYieldsX.get(33).divide(divisionValue, mc2), stockYieldsX.get(33).divide(stockPricesX.get(33), mc2), stockYieldsX.get(33).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(33).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks34 = new StockWrapper(stockNamesX.get(34), stockPricesX.get(34), stockYieldsX.get(34).divide(divisionValue, mc2), stockYieldsX.get(34).divide(stockPricesX.get(34), mc2), stockYieldsX.get(34).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(34).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks35 = new StockWrapper(stockNamesX.get(35), stockPricesX.get(35), stockYieldsX.get(35).divide(divisionValue, mc2), stockYieldsX.get(35).divide(stockPricesX.get(35), mc2), stockYieldsX.get(35).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(35).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks36 = new StockWrapper(stockNamesX.get(36), stockPricesX.get(36), stockYieldsX.get(36).divide(divisionValue, mc2), stockYieldsX.get(36).divide(stockPricesX.get(36), mc2), stockYieldsX.get(36).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(36).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks37 = new StockWrapper(stockNamesX.get(37), stockPricesX.get(37), stockYieldsX.get(37).divide(divisionValue, mc2), stockYieldsX.get(37).divide(stockPricesX.get(37), mc2), stockYieldsX.get(37).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(37).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks38 = new StockWrapper(stockNamesX.get(38), stockPricesX.get(38), stockYieldsX.get(38).divide(divisionValue, mc2), stockYieldsX.get(38).divide(stockPricesX.get(38), mc2), stockYieldsX.get(38).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(38).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks39 = new StockWrapper(stockNamesX.get(39), stockPricesX.get(39), stockYieldsX.get(39).divide(divisionValue, mc2), stockYieldsX.get(39).divide(stockPricesX.get(39), mc2), stockYieldsX.get(39).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(39).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks40 = new StockWrapper(stockNamesX.get(40), stockPricesX.get(40), stockYieldsX.get(40).divide(divisionValue, mc2), stockYieldsX.get(40).divide(stockPricesX.get(40), mc2), stockYieldsX.get(40).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(40).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks41 = new StockWrapper(stockNamesX.get(41), stockPricesX.get(41), stockYieldsX.get(41).divide(divisionValue, mc2), stockYieldsX.get(41).divide(stockPricesX.get(41), mc2), stockYieldsX.get(41).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(41).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks42 = new StockWrapper(stockNamesX.get(42), stockPricesX.get(42), stockYieldsX.get(42).divide(divisionValue, mc2), stockYieldsX.get(42).divide(stockPricesX.get(42), mc2), stockYieldsX.get(42).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(42).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks43 = new StockWrapper(stockNamesX.get(43), stockPricesX.get(43), stockYieldsX.get(43).divide(divisionValue, mc2), stockYieldsX.get(43).divide(stockPricesX.get(43), mc2), stockYieldsX.get(43).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(43).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks44 = new StockWrapper(stockNamesX.get(44), stockPricesX.get(44), stockYieldsX.get(44).divide(divisionValue, mc2), stockYieldsX.get(44).divide(stockPricesX.get(44), mc2), stockYieldsX.get(44).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(44).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks45 = new StockWrapper(stockNamesX.get(45), stockPricesX.get(45), stockYieldsX.get(45).divide(divisionValue, mc2), stockYieldsX.get(45).divide(stockPricesX.get(45), mc2), stockYieldsX.get(45).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(45).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks46 = new StockWrapper(stockNamesX.get(46), stockPricesX.get(46), stockYieldsX.get(46).divide(divisionValue, mc2), stockYieldsX.get(46).divide(stockPricesX.get(46), mc2), stockYieldsX.get(46).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(46).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks47 = new StockWrapper(stockNamesX.get(47), stockPricesX.get(47), stockYieldsX.get(47).divide(divisionValue, mc2), stockYieldsX.get(47).divide(stockPricesX.get(47), mc2), stockYieldsX.get(47).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(47).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks48 = new StockWrapper(stockNamesX.get(48), stockPricesX.get(48), stockYieldsX.get(48).divide(divisionValue, mc2), stockYieldsX.get(48).divide(stockPricesX.get(48), mc2), stockYieldsX.get(48).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(48).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks49 = new StockWrapper(stockNamesX.get(49), stockPricesX.get(49), stockYieldsX.get(49).divide(divisionValue, mc2), stockYieldsX.get(49).divide(stockPricesX.get(49), mc2), stockYieldsX.get(49).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(49).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks50 = new StockWrapper(stockNamesX.get(50), stockPricesX.get(50), stockYieldsX.get(50).divide(divisionValue, mc2), stockYieldsX.get(50).divide(stockPricesX.get(50), mc2), stockYieldsX.get(50).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(50).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks51 = new StockWrapper(stockNamesX.get(51), stockPricesX.get(51), stockYieldsX.get(51).divide(divisionValue, mc2), stockYieldsX.get(51).divide(stockPricesX.get(51), mc2), stockYieldsX.get(51).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(51).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks52 = new StockWrapper(stockNamesX.get(52), stockPricesX.get(52), stockYieldsX.get(52).divide(divisionValue, mc2), stockYieldsX.get(52).divide(stockPricesX.get(52), mc2), stockYieldsX.get(52).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(52).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks53 = new StockWrapper(stockNamesX.get(53), stockPricesX.get(53), stockYieldsX.get(53).divide(divisionValue, mc2), stockYieldsX.get(53).divide(stockPricesX.get(53), mc2), stockYieldsX.get(53).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(53).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks54 = new StockWrapper(stockNamesX.get(54), stockPricesX.get(54), stockYieldsX.get(54).divide(divisionValue, mc2), stockYieldsX.get(54).divide(stockPricesX.get(54), mc2), stockYieldsX.get(54).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(54).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks55 = new StockWrapper(stockNamesX.get(55), stockPricesX.get(55), stockYieldsX.get(55).divide(divisionValue, mc2), stockYieldsX.get(55).divide(stockPricesX.get(55), mc2), stockYieldsX.get(55).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(55).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks56 = new StockWrapper(stockNamesX.get(56), stockPricesX.get(56), stockYieldsX.get(56).divide(divisionValue, mc2), stockYieldsX.get(56).divide(stockPricesX.get(56), mc2), stockYieldsX.get(56).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(56).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks57 = new StockWrapper(stockNamesX.get(57), stockPricesX.get(57), stockYieldsX.get(57).divide(divisionValue, mc2), stockYieldsX.get(57).divide(stockPricesX.get(57), mc2), stockYieldsX.get(57).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(57).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks58 = new StockWrapper(stockNamesX.get(58), stockPricesX.get(58), stockYieldsX.get(58).divide(divisionValue, mc2), stockYieldsX.get(58).divide(stockPricesX.get(58), mc2), stockYieldsX.get(58).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(58).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks59 = new StockWrapper(stockNamesX.get(59), stockPricesX.get(59), stockYieldsX.get(59).divide(divisionValue, mc2), stockYieldsX.get(59).divide(stockPricesX.get(59), mc2), stockYieldsX.get(59).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(59).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks60 = new StockWrapper(stockNamesX.get(60), stockPricesX.get(60), stockYieldsX.get(60).divide(divisionValue, mc2), stockYieldsX.get(60).divide(stockPricesX.get(60), mc2), stockYieldsX.get(60).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(60).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks61 = new StockWrapper(stockNamesX.get(61), stockPricesX.get(61), stockYieldsX.get(61).divide(divisionValue, mc2), stockYieldsX.get(61).divide(stockPricesX.get(61), mc2), stockYieldsX.get(61).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(61).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks62 = new StockWrapper(stockNamesX.get(62), stockPricesX.get(62), stockYieldsX.get(62).divide(divisionValue, mc2), stockYieldsX.get(62).divide(stockPricesX.get(62), mc2), stockYieldsX.get(62).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(62).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks63 = new StockWrapper(stockNamesX.get(63), stockPricesX.get(63), stockYieldsX.get(63).divide(divisionValue, mc2), stockYieldsX.get(63).divide(stockPricesX.get(63), mc2), stockYieldsX.get(63).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(63).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks64 = new StockWrapper(stockNamesX.get(64), stockPricesX.get(64), stockYieldsX.get(64).divide(divisionValue, mc2), stockYieldsX.get(64).divide(stockPricesX.get(64), mc2), stockYieldsX.get(64).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(64).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks65 = new StockWrapper(stockNamesX.get(65), stockPricesX.get(65), stockYieldsX.get(65).divide(divisionValue, mc2), stockYieldsX.get(65).divide(stockPricesX.get(65), mc2), stockYieldsX.get(65).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(65).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks66 = new StockWrapper(stockNamesX.get(66), stockPricesX.get(66), stockYieldsX.get(66).divide(divisionValue, mc2), stockYieldsX.get(66).divide(stockPricesX.get(66), mc2), stockYieldsX.get(66).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(66).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks67 = new StockWrapper(stockNamesX.get(67), stockPricesX.get(67), stockYieldsX.get(67).divide(divisionValue, mc2), stockYieldsX.get(67).divide(stockPricesX.get(67), mc2), stockYieldsX.get(67).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(67).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks68 = new StockWrapper(stockNamesX.get(68), stockPricesX.get(68), stockYieldsX.get(68).divide(divisionValue, mc2), stockYieldsX.get(68).divide(stockPricesX.get(68), mc2), stockYieldsX.get(68).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(68).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks69 = new StockWrapper(stockNamesX.get(69), stockPricesX.get(69), stockYieldsX.get(69).divide(divisionValue, mc2), stockYieldsX.get(69).divide(stockPricesX.get(69), mc2), stockYieldsX.get(69).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(69).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks70 = new StockWrapper(stockNamesX.get(70), stockPricesX.get(70), stockYieldsX.get(70).divide(divisionValue, mc2), stockYieldsX.get(70).divide(stockPricesX.get(70), mc2), stockYieldsX.get(70).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(70).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks71 = new StockWrapper(stockNamesX.get(71), stockPricesX.get(71), stockYieldsX.get(71).divide(divisionValue, mc2), stockYieldsX.get(71).divide(stockPricesX.get(71), mc2), stockYieldsX.get(71).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(71).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks72 = new StockWrapper(stockNamesX.get(72), stockPricesX.get(72), stockYieldsX.get(72).divide(divisionValue, mc2), stockYieldsX.get(72).divide(stockPricesX.get(72), mc2), stockYieldsX.get(72).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(72).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));
        StockWrapper stocks73 = new StockWrapper(stockNamesX.get(73), stockPricesX.get(73), stockYieldsX.get(73).divide(divisionValue, mc2), stockYieldsX.get(73).divide(stockPricesX.get(73), mc2), stockYieldsX.get(73).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0)), stockYieldsX.get(73).divide(divisionValue, mc2).multiply(BigDecimal.valueOf(100.0).multiply(stockPricesX.get(0)), mc4));


        listStocks = new ArrayList<>();


        listStocks.add(stocks0);
        listStocks.add(stocks1);
        listStocks.add(stocks2);
        listStocks.add(stocks3);
        listStocks.add(stocks4);
        listStocks.add(stocks5);
        listStocks.add(stocks6);
        listStocks.add(stocks7);
        listStocks.add(stocks8);
        listStocks.add(stocks9);
        listStocks.add(stocks10);
        listStocks.add(stocks11);
        listStocks.add(stocks12);
        listStocks.add(stocks13);
        listStocks.add(stocks14);
        listStocks.add(stocks15);
        listStocks.add(stocks16);
        listStocks.add(stocks17);
        listStocks.add(stocks18);
        listStocks.add(stocks19);
        listStocks.add(stocks20);
        listStocks.add(stocks21);
        listStocks.add(stocks22);
        listStocks.add(stocks23);
        listStocks.add(stocks24);
        listStocks.add(stocks25);
        listStocks.add(stocks26);
        listStocks.add(stocks27);
        listStocks.add(stocks28);
        listStocks.add(stocks29);
        listStocks.add(stocks30);
        listStocks.add(stocks31);
        listStocks.add(stocks32);
        listStocks.add(stocks33);
        listStocks.add(stocks34);
        listStocks.add(stocks35);
        listStocks.add(stocks36);
        listStocks.add(stocks37);
        listStocks.add(stocks38);
        listStocks.add(stocks39);
        listStocks.add(stocks40);
        listStocks.add(stocks41);
        listStocks.add(stocks42);
        listStocks.add(stocks43);
        listStocks.add(stocks44);
        listStocks.add(stocks45);
        listStocks.add(stocks46);
        listStocks.add(stocks47);
        listStocks.add(stocks48);
        listStocks.add(stocks49);
        listStocks.add(stocks50);
        listStocks.add(stocks51);
        listStocks.add(stocks52);
        listStocks.add(stocks53);
        listStocks.add(stocks54);
        listStocks.add(stocks55);
        listStocks.add(stocks56);
        listStocks.add(stocks57);
        listStocks.add(stocks58);
        listStocks.add(stocks59);
        listStocks.add(stocks60);
        listStocks.add(stocks61);
        listStocks.add(stocks62);
        listStocks.add(stocks63);
        listStocks.add(stocks64);
        listStocks.add(stocks65);
        listStocks.add(stocks66);
        listStocks.add(stocks67);
        listStocks.add(stocks68);
        listStocks.add(stocks69);
        listStocks.add(stocks70);
        listStocks.add(stocks71);
        listStocks.add(stocks72);
        listStocks.add(stocks73);

        //Thread.sleep(16000);

    }

    @GetMapping("/list")
    public String showStocks(Model model) {

        model.addAttribute("stocks", listStocks);
        return "index";
    }

}
