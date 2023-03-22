package com.example.mediator;

public class Main {
    public static void main(String[] args) {
        StockMediator nihal = new StockMediator();

        GomrmanSlacks broker1 = new GomrmanSlacks(nihal);
        JTPoorman broker2 = new JTPoorman(nihal);

        broker1.saleOffer("MSFT", 100);
        broker1.saleOffer("GOOG", 50);
        broker2.buyOffer("MSFT", 100);
        broker2.saleOffer("NRG", 10);
        broker1.buyOffer("NRG", 10);
        nihal.getStockOfferings();

    }
}
