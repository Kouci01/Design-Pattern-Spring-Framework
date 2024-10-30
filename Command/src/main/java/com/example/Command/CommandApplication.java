package com.example.Command;

import com.example.Command.command.FanOffCommand;
import com.example.Command.command.FanOnCommand;
import com.example.Command.command.LightOffCommand;
import com.example.Command.command.LightOnCommand;
import com.example.Command.invoker.RemoteControl;
import com.example.Command.receiver.Fan;
import com.example.Command.receiver.Light;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CommandApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(ApplicationContext context){
        return args -> {
            Light light = context.getBean(Light.class);
            Fan fan = context.getBean(Fan.class);
            RemoteControl remoteControl = context.getBean(RemoteControl.class);

            remoteControl.setCommand(new LightOnCommand(light));
            remoteControl.pressButton();

            remoteControl.setCommand(new LightOffCommand(light));
            remoteControl.pressButton();

            remoteControl.setCommand(new FanOnCommand(fan));
            remoteControl.pressButton();

            remoteControl.setCommand(new FanOffCommand(fan));
            remoteControl.pressButton();
        };
    }
}
