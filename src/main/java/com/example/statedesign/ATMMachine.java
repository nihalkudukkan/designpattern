package com.example.statedesign;

public class ATMMachine {
    ATMState hasCard, noCard, hasCorrectPin, atmOutOfMoney;
    ATMState atmState;
    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine() {
        this.hasCard = new HasCard(this);
        this.noCard = new NoCard(this);
        this.hasCorrectPin = new HasPin(this);
        this.atmOutOfMoney = new NoCash(this);

        atmState = noCard;

        if (cashInMachine<0) {
            atmState = atmOutOfMoney;
        }
    }

    public void setATMState(ATMState newATMState) {
        atmState = newATMState;
    }

    public void setCashInMachine(int newCashInMachine) {
        cashInMachine = newCashInMachine;
    }

    public void insertCard() {
        atmState.insertCard();
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    public void insertPin(int pinEntered) {
        atmState.insertPin(pinEntered);
    }

    public void requestCash(int withDraw) {
        atmState.requestCash(withDraw);
    }

    public ATMState getYesCardState() {return hasCard;}
    public ATMState getNoCardState() {return noCard;}
    public ATMState getHasPin() {return hasCorrectPin;}
    public ATMState getNoCashState() {return atmOutOfMoney;}
}
