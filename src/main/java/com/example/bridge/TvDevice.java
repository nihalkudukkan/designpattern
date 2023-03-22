package com.example.bridge;

public class TvDevice extends EntertainmentDevice {
    public TvDevice(int newDeviceState, int newMaxSetting) {
        this.deviceState = newDeviceState;
        this.maxSetting = newMaxSetting;
    }

    @Override
    public void buttonFive() {
        deviceState--;
        System.out.println("Channel down");
    }

    @Override
    public void buttonSix() {
        deviceState++;
        System.out.println("Channel up");
    }
}
