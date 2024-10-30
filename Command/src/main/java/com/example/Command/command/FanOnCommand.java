package com.example.Command.command;

import com.example.Command.receiver.Fan;

public class FanOnCommand implements Command{
    private final Fan fan;

    public FanOnCommand(Fan fan){
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOn();
    }
}
