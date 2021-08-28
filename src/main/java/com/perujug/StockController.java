package com.perujug;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;

@Controller("/")
public class StockController {
    private StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @Get("{ticker}")
    public Stock getStock(String ticker){
        System.out.println("ticker:" + ticker);
        if(Math.random() > 0.8){
            System.out.println("simulando una falla...");
            throw new RuntimeException("oops algo fallo");

        }
        return stockService.getStocks().stream()
                .filter(stock -> stock.getTicker().equals(ticker))
                .findFirst()
                .orElse(null);
    }

    @Get
    public List<Stock> getStock(){
        return stockService.getStocks();
    }
}
