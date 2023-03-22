package com.example.decorator;

public abstract class ToppingDecorator implements Pizza {
    Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDecorator() {
        return pizza.getDecorator();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }
}
