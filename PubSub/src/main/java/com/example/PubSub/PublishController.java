package com.example.PubSub;

import com.example.PubSub.publisher.EventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublishController {
    private final EventPublisher eventPublisher;

    public PublishController(EventPublisher eventPublisher){
        this.eventPublisher = eventPublisher;
    }

    @GetMapping("/publish")
    public String publishEvent(@RequestParam String message) {
        eventPublisher.publishEvent(message);
        return "Event published with message: " + message;
    }
}
