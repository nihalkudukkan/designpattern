package com.example.command;

import java.util.List;

public class TurnOnAll implements Command {
    List<Device> devices;

    public TurnOnAll(List<Device> devices) {
        this.devices = devices;
    }

    @Override
    public void execute() {
        for (Device x :
                devices) {
            x.on();
        }
    }
}
