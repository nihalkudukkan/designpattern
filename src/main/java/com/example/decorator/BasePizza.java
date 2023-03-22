package com.example.decorator;

public class BasePizza implements Pizza {
    @Override
    public String getDecorator() {
        return "Thin dough";
    }

    @Override
    public double getPrice() {
        return 150;
    }
}
