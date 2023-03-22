package com.example.chainofresponsibility;

public class DivideNumber implements Chain {
    Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted().equalsIgnoreCase("div")) {
            System.out.println(request.getN1() + " / " + request.getN2() + " = " + (request.getN1() / request.getN2()));
        } else {
            System.out.println("only works on add, sub, mult and div");
        }
    }
}
