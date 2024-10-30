package com.example.PubSub.publisher;

import com.example.PubSub.event.CustomEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {
    private final ApplicationEventPublisher eventPublisher;

    public EventPublisher(ApplicationEventPublisher eventPublisher){
        this.eventPublisher = eventPublisher;
    }

    public void publishEvent(String message) {
        System.out.println("Publishing custom event with message: " + message);
        CustomEvent customEvent = new CustomEvent(this, message);
        eventPublisher.publishEvent(customEvent);
    }
}
