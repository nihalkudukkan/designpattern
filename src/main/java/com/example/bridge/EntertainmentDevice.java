package com.example.bridge;

public abstract class EntertainmentDevice {
    public int deviceState;
    public int maxSetting;
    public int volumeLevel = 0;

    public abstract void buttonFive();
    public abstract void buttonSix();

    public void deviceFeedBack() {
        if (deviceState>maxSetting || deviceState<0)
            deviceState = 0;
        System.out.println("On " + deviceState);
    }

    public void buttonSeven() {
        volumeLevel++;
        System.out.println("Volume at: " + volumeLevel);
    }

    public void buttonEight() {
        volumeLevel--;
        System.out.println("Volume at: " + volumeLevel);
    }
}
