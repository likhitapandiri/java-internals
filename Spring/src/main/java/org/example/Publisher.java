package org.example;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class Publisher {
    private final ApplicationEventPublisher eventPublisher;

    public Publisher(
            ApplicationEventPublisher eventPublisher
    ) {
        this.eventPublisher = eventPublisher;
    }
    public void publisher(){
        System.out.println("publishing event");
        eventPublisher.publishEvent(new EventRecord("Likhita"));
    }
}
