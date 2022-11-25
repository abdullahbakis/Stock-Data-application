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
        //-----------------AGNC-----------------
        final StockWrapper stockAGNC = stockService.findStock("AGNC");
        final BigDecimal priceAGNC = stockService.findPrice(stockAGNC);
        final BigDecimal annualYieldAGNC = stockService.findAnnualYieldDividend(stockAGNC);
        BigDecimal dividendAGNC = BigDecimal.valueOf(1.44);
        final BigDecimal divEfficiencyAGNC = dividendAGNC.divide(priceAGNC, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of AGNC is: " + divEfficiencyAGNC);
        //-----------------APLE-----------------
        final StockWrapper stockAPLE = stockService.findStock("APLE");
        final BigDecimal priceAPLE = stockService.findPrice(stockAPLE);
        final BigDecimal annualYieldAPLE = stockService.findAnnualYieldDividend(stockAPLE);
        BigDecimal dividendAPLE = BigDecimal.valueOf(0.96);
        final BigDecimal divEfficiencyAPLE = dividendAPLE.divide(priceAPLE, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of APLE is: " + divEfficiencyAPLE);
        //-----------------ARR-----------------
        final StockWrapper stockARR = stockService.findStock("ARR");
        final BigDecimal priceARR = stockService.findPrice(stockARR);
        final BigDecimal annualYieldARR = stockService.findAnnualYieldDividend(stockARR);
        BigDecimal dividendARR = BigDecimal.valueOf(1.2);
        final BigDecimal divEfficiencyARR = dividendARR.divide(priceARR, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of ARR is: " + divEfficiencyARR);
        //-----------------BBD-----------------
        final StockWrapper stockBBD = stockService.findStock("BBD");
        final BigDecimal priceBBD = stockService.findPrice(stockBBD);
        final BigDecimal annualYieldBBD = stockService.findAnnualYieldDividend(stockBBD);
        BigDecimal dividendBBD = BigDecimal.valueOf(0.043152);
        final BigDecimal divEfficiencyBBD = dividendBBD.divide(priceBBD, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of BBD is: " + divEfficiencyBBD);
        //-----------------BBDO-----------------
        final StockWrapper stockBBDO = stockService.findStock("BBDO");
        final BigDecimal priceBBDO = stockService.findPrice(stockBBDO);
        final BigDecimal annualYieldBBDO = stockService.findAnnualYieldDividend(stockBBDO);
        BigDecimal dividendBBDO = BigDecimal.valueOf(0.039228);
        final BigDecimal divEfficiencyBBDO = dividendBBDO.divide(priceBBDO, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of BBDO is: " + divEfficiencyBBDO);
        //-----------------BCAT-----------------
        final StockWrapper stockBCAT = stockService.findStock("BCAT");
        final BigDecimal priceBCAT = stockService.findPrice(stockBCAT);
        final BigDecimal annualYieldBCAT = stockService.findAnnualYieldDividend(stockBCAT);
        BigDecimal dividendBCAT = BigDecimal.valueOf(1.2492);
        final BigDecimal divEfficiencyBCAT = dividendBCAT.divide(priceBCAT, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of BCAT is: " + divEfficiencyBCAT);
        //-----------------BKN-----------------
        final StockWrapper stockBKN = stockService.findStock("BKN");
        final BigDecimal priceBKN = stockService.findPrice(stockBKN);
        final BigDecimal annualYieldBKN = stockService.findAnnualYieldDividend(stockBKN);
        BigDecimal dividendBKN = BigDecimal.valueOf(0.648);
        final BigDecimal divEfficiencyBKN = dividendBKN.divide(priceBKN, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of BKN is: " + divEfficiencyBKN);
        //-----------------BKT-----------------
        final StockWrapper stockBKT = stockService.findStock("BKT");
        final BigDecimal priceBKT = stockService.findPrice(stockBKT);
        final BigDecimal annualYieldBKT = stockService.findAnnualYieldDividend(stockBKT);
        BigDecimal dividendBKT = BigDecimal.valueOf(1.0584);
        final BigDecimal divEfficiencyBKT = dividendBKT.divide(priceBKT, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of BKT is: " + divEfficiencyBKT);
        //-----------------BRMK-----------------
        final StockWrapper stockBRMK = stockService.findStock("BRMK");
        final BigDecimal priceBRMK = stockService.findPrice(stockBKT);
        final BigDecimal annualYieldBRMK = stockService.findAnnualYieldDividend(stockBRMK);
        BigDecimal dividendBRMK = BigDecimal.valueOf(0.84);
        final BigDecimal divEfficiencyBRMK = dividendBRMK.divide(priceBRMK, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of BRMK is: " + divEfficiencyBRMK);
        //-----------------CEV-----------------
        final StockWrapper stockCEV = stockService.findStock("CEV");
        final BigDecimal priceCEV = stockService.findPrice(stockCEV);
        final BigDecimal annualYieldCEV = stockService.findAnnualYieldDividend(stockCEV);
        BigDecimal dividendCEV = BigDecimal.valueOf(0.45);
        final BigDecimal divEfficiencyCEV = dividendCEV.divide(priceCEV, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of CEV is: " + divEfficiencyCEV);
        //-----------------CMU-----------------
        final StockWrapper stockCMU = stockService.findStock("CMU");
        final BigDecimal priceCMU = stockService.findPrice(stockCMU);
        final BigDecimal annualYieldCMU = stockService.findAnnualYieldDividend(stockCMU);
        BigDecimal dividendCMU = BigDecimal.valueOf(0.15);
        final BigDecimal divEfficiencyCMU = dividendCMU.divide(priceCMU, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of CMU is: " + divEfficiencyCMU);
        //-----------------CRT-----------------
        final StockWrapper stockCRT = stockService.findStock("CRT");
        final BigDecimal priceCRT = stockService.findPrice(stockCRT);
        final BigDecimal annualYieldCRT = stockService.findAnnualYieldDividend(stockCRT);
        BigDecimal dividendCRT = BigDecimal.valueOf(1.789788);
        final BigDecimal divEfficiencyCRT = dividendCRT.divide(priceCRT, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of CRT is: " + divEfficiencyCRT);
        //-----------------CXE-----------------
        final StockWrapper stockCXE = stockService.findStock("CXE");
        final BigDecimal priceCXE = stockService.findPrice(stockCXE);
        final BigDecimal annualYieldCXE = stockService.findAnnualYieldDividend(stockCXE);
        BigDecimal dividendCXE = BigDecimal.valueOf(0.174);
        final BigDecimal divEfficiencyCXE = dividendCXE.divide(priceCXE, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of CXE is: " + divEfficiencyCXE);
        //-----------------CXH-----------------
        final StockWrapper stockCXH = stockService.findStock("CXH");
        final BigDecimal priceCXH = stockService.findPrice(stockCXH);
        final BigDecimal annualYieldCXH = stockService.findAnnualYieldDividend(stockCXH);
        BigDecimal dividendCXH = BigDecimal.valueOf(0.294);
        final BigDecimal divEfficiencyCXH = dividendCXH.divide(priceCXH, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of CXH is: " + divEfficiencyCXH);
        //-----------------DMF-----------------
        final StockWrapper stockDMF = stockService.findStock("DMF");
        final BigDecimal priceDMF = stockService.findPrice(stockDMF);
        final BigDecimal annualYieldDMF = stockService.findAnnualYieldDividend(stockDMF);
        BigDecimal dividendDMF = BigDecimal.valueOf(0.25);
        final BigDecimal divEfficiencyDMF = dividendDMF.divide(priceDMF, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of DMF is: " + divEfficiencyDMF);
        //-----------------DX-----------------
        final StockWrapper stockDX = stockService.findStock("DX");
        final BigDecimal priceDX = stockService.findPrice(stockDX);
        final BigDecimal annualYieldDX = stockService.findAnnualYieldDividend(stockDX);
        BigDecimal dividendDX = BigDecimal.valueOf(1.56);
        final BigDecimal divEfficiencyDX = dividendDX.divide(priceDX, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of DX is: " + divEfficiencyDX);
        //-----------------EARN-----------------
        final StockWrapper stockEARN = stockService.findStock("EARN");
        final BigDecimal priceEARN = stockService.findPrice(stockEARN);
        final BigDecimal annualYieldEARN = stockService.findAnnualYieldDividend(stockEARN);
        BigDecimal dividendEARN = BigDecimal.valueOf(0.96);
        final BigDecimal divEfficiencyEARN = dividendEARN.divide(priceEARN, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of EARN is: " + divEfficiencyEARN);
        //-----------------ECC-----------------
        final StockWrapper stockECC = stockService.findStock("ECC");
        final BigDecimal priceECC = stockService.findPrice(stockECC);
        final BigDecimal annualYieldECC = stockService.findAnnualYieldDividend(stockECC);
        BigDecimal dividendECC = BigDecimal.valueOf(1.68);
        final BigDecimal divEfficiencyECC = dividendECC.divide(priceECC, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of ECC is: " + divEfficiencyECC);
        //-----------------EFC-----------------
        final StockWrapper stockEFC = stockService.findStock("EFC");
        final BigDecimal priceEFC = stockService.findPrice(stockEFC);
        final BigDecimal annualYieldEFC = stockService.findAnnualYieldDividend(stockEFC);
        BigDecimal dividendEFC = BigDecimal.valueOf(1.80);
        final BigDecimal divEfficiencyEFC = dividendEFC.divide(priceEFC, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of EFC is: " + divEfficiencyEFC);
        //-----------------EPR-----------------
        final StockWrapper stockEPR = stockService.findStock("EPR");
        final BigDecimal priceEPR = stockService.findPrice(stockEPR);
        final BigDecimal annualYieldEPR = stockService.findAnnualYieldDividend(stockEPR);
        BigDecimal dividendEPR = BigDecimal.valueOf(4.59);
        final BigDecimal divEfficiencyEPR = dividendEPR.divide(priceEPR, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of EPR is: " + divEfficiencyEPR);
        //-----------------EVN-----------------
        final StockWrapper stockEVN = stockService.findStock("EVN");
        final BigDecimal priceEVN = stockService.findPrice(stockEVN);
        final BigDecimal annualYieldEVN = stockService.findAnnualYieldDividend(stockEVN);
        BigDecimal dividendEVN = BigDecimal.valueOf(0.492);
        final BigDecimal divEfficiencyEVN = dividendEVN.divide(priceEVN, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of EVN is: " + divEfficiencyEVN);
        //-----------------FT-----------------
        final StockWrapper stockFT = stockService.findStock("FT");
        final BigDecimal priceFT = stockService.findPrice(stockFT);
        final BigDecimal annualYieldFT = stockService.findAnnualYieldDividend(stockFT);
        BigDecimal dividendFT = BigDecimal.valueOf(0.51);
        final BigDecimal divEfficiencyFT = dividendFT.divide(priceFT, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of FT is: " + divEfficiencyFT);
        //-----------------GAIN-----------------
        final StockWrapper stockGAIN = stockService.findStock("GAIN");
        final BigDecimal priceGAIN = stockService.findPrice(stockGAIN);
        final BigDecimal annualYieldGAIN = stockService.findAnnualYieldDividend(stockGAIN);
        BigDecimal dividendGAIN = BigDecimal.valueOf(0.96);
        final BigDecimal divEfficiencyGAIN = dividendGAIN.divide(priceGAIN, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of GAIN is: " + divEfficiencyGAIN);
        //-----------------GLAD-----------------
        final StockWrapper stockGLAD = stockService.findStock("GLAD");
        final BigDecimal priceGLAD = stockService.findPrice(stockGLAD);
        final BigDecimal annualYieldGLAD = stockService.findAnnualYieldDividend(stockGLAD);
        BigDecimal dividendGLAD = BigDecimal.valueOf(0.84);
        final BigDecimal divEfficiencyGLAD = dividendGLAD.divide(priceGLAD, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of GLAD is: " + divEfficiencyGLAD);
        //-----------------GLDI-----------------
        final StockWrapper stockGLDI = stockService.findStock("GLDI");
        final BigDecimal priceGLDI = stockService.findPrice(stockGLDI);
        final BigDecimal annualYieldGLDI = stockService.findAnnualYieldDividend(stockGLDI);
        BigDecimal dividendGLDI = BigDecimal.valueOf(15.1776);
        final BigDecimal divEfficiencyGLDI = dividendGLDI.divide(priceGLDI, 4, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
        System.out.println("Efficiency of GLDI is: " + divEfficiencyGLDI);

    }
    /*
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

     */



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

/*
    private void findPrices(List<StockWrapper> stocks){
        stocks.forEach(stock ->{
            try{
                System.out.println("The name of the stock is: " + stock.getStock().getSymbol());
                System.out.println("The price for " + stock.getStock().getSymbol() + " is: " + stockService.findPrice(stock));
                System.out.println("Trailing annual dividend yield " + stock.getStock().getSymbol() + " is: " + stockService.findAnnualYieldDividend(stock));
            }catch (IOException e){
                // Ignore
            }
        });
    }

 */


    /*
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
*/
}