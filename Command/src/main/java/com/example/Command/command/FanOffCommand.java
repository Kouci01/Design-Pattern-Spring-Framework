package com.example.Command.command;

import com.example.Command.receiver.Fan;

public class FanOffCommand implements Command{
    private final Fan fan;

    public FanOffCommand(Fan fan){
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOff();
    }
}
