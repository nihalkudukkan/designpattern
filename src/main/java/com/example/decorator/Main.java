package com.example.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza mozzarellaWithTomatoPizza = new TomatoSauce(new Mozzarella(new BasePizza()));

        System.out.println(mozzarellaWithTomatoPizza.getDecorator() + ": " + mozzarellaWithTomatoPizza.getPrice());
    }
}
