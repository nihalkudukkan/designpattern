package com.example.chainofresponsibility;

public interface Chain {
    void setNextChain(Chain nextChain);
    void calculate(Numbers request);
}
