package com.example.bridge;

public abstract class RemoteButton {
    private EntertainmentDevice theDevice;

    public RemoteButton(EntertainmentDevice theDevice) {
        this.theDevice = theDevice;
    }

    public void buttonFive() {
        theDevice.buttonFive();
    }

    public void buttonSix() {
        theDevice.buttonSix();
    }

    public void deviceFeedBack() {
        theDevice.deviceFeedBack();
    }

    public abstract void buttonNine();
}
