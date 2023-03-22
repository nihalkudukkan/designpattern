package com.example.command;

public class TurnOn implements Command {
    Device device;

    public TurnOn(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }
}
