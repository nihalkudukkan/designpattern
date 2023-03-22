package com.example.chainofresponsibility;

public class SubstractNumber implements Chain {
    Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted().equalsIgnoreCase("sub")) {
            System.out.println(request.getN1() + " - " + request.getN2() + " = " + (request.getN1() - request.getN2()));
        } else {
            nextChain.calculate(request);
        }
    }
}
