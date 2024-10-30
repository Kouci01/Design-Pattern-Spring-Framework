package com.example.Command.invoker;

import com.example.Command.command.Command;
import org.springframework.stereotype.Component;

@Component
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        if(command!=null){
            command.execute();
        }
    }
}
