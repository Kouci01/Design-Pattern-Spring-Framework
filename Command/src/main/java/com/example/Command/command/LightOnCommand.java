package com.example.Command.command;

import com.example.Command.receiver.Light;

public class LightOnCommand implements Command{
    private final Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }
}
