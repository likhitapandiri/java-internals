package org.example;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listener2 {
    @EventListener
    public void handle(EventRecord eventRecord){
        System.out.println(
                "Payment event Listener 2 "+ eventRecord.name()
        );
    }
}
