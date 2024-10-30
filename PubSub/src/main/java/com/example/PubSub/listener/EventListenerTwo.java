package com.example.PubSub.listener;

import com.example.PubSub.event.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerTwo {
    @EventListener
    public void handleCustomEvent(CustomEvent event) {
        System.out.println("ListenerTwo received event: " + event.getMessage());
    }
}
