package com.example.mediator;

import java.util.ArrayList;

public class StockMediator implements Mediator {
    private ArrayList<Colleague> colleagues;
    private ArrayList<StockOffer> stockBuyOffers;
    private ArrayList<StockOffer> stockSaleOffers;

    private int colleagueCode = 0;

    public StockMediator() {
        colleagues = new ArrayList<>();
        stockBuyOffers = new ArrayList<>();
        stockSaleOffers = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague newColleague) {
        colleagues.add(newColleague);
        colleagueCode++;
        newColleague.setColleagueCode(colleagueCode);
    }

    @Override
    public void saleOffer(String stock, int shares, int colleagueCode) {
        boolean stockSold = false;

        for (StockOffer offer:
                stockBuyOffers) {
            if ((offer.getStockSymbol().equalsIgnoreCase(stock)) || (offer.getStockShares() == shares)) {
                System.out.println(shares + " shares of " + " sold to colleague " + offer.getColleagueCode());
                stockBuyOffers.remove(offer);
                stockSold = true;
            }
            if (stockSold == true)
                break;
        }

        if (!stockSold) {
            System.out.println(shares + " shares of " + stock + " added to inventory");
            StockOffer stockOffer = new StockOffer(shares, stock, colleagueCode);
            stockSaleOffers.add(stockOffer);
        }
    }

    @Override
    public void buyOffer(String stock, int shares, int colleagueCode) {
        boolean stockBuy = false;

        for (StockOffer offer:
                stockSaleOffers) {
            if ((offer.getStockSymbol().equalsIgnoreCase(stock)) || (offer.getStockShares() == shares)) {
                System.out.println(shares + " shares of " + " bought by colleague code " + offer.getColleagueCode());
                stockSaleOffers.remove(offer);
                stockBuy = true;
            }
            if (stockBuy == true)
                break;
        }

        if (!stockBuy) {
            System.out.println(shares + " shares of " + stock + " added to inventory");
            StockOffer stockOffer = new StockOffer(shares, stock, colleagueCode);
            stockBuyOffers.add(stockOffer);
        }
    }

    public void getStockOfferings() {
        System.out.println("\nStocks for sale");

        for (StockOffer offer :
                stockSaleOffers) {
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
        }

        System.out.println("\nStock Buy Offers");
        for(StockOffer offer: stockBuyOffers){
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
        }

    }
}
