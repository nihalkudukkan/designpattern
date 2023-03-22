package com.example.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Chain add = new AddNumber();
        Chain sub = new SubstractNumber();
        Chain mult = new MultNumber();
        Chain div = new DivideNumber();

        add.setNextChain(sub);
        sub.setNextChain(mult);
        mult.setNextChain(div);

        Numbers req = new Numbers(4,8,"sub");

        add.calculate(req);
    }
}
