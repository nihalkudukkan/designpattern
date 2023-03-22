package com.example.decorator;

public class TomatoSauce extends ToppingDecorator {
    public TomatoSauce(Pizza pizza) {
        super(pizza);
        System.out.println("Adding dough");
        System.out.println("Adding sauce");
    }

    @Override
    public String getDecorator() {
        return pizza.getDecorator() + ", tomato";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 20;
    }
}
