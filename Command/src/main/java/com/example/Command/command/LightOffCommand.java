package com.example.Command.command;

import com.example.Command.receiver.Light;

public class LightOffCommand implements Command{
    private final Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOff();
    }
}
