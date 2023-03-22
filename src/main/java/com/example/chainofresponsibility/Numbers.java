package com.example.chainofresponsibility;

public class Numbers {
    private int n1;
    private int n2;
    private String calculationWanted;

    public Numbers(int n1, int n2, String calculationWanted) {
        this.n1 = n1;
        this.n2 = n2;
        this.calculationWanted = calculationWanted;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public String getCalculationWanted() {
        return calculationWanted;
    }
}
