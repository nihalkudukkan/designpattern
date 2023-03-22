package com.example.decorator;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza pizza) {
        super(pizza);
        System.out.println("Adding dough");
        System.out.println("Adding Moz");
    }

    @Override
    public String getDecorator() {
        return pizza.getDecorator() + ", mozzarella";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 50;
    }
}
