package com.perujug;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;
import java.util.stream.Collectors;

@Controller("/")
public class StockController {
    private StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @Get("{ticker}")
    public Stock getStock(String ticker){
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
