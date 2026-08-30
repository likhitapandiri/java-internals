package org.example;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listener1 {

    @EventListener
    public void handle(EventRecord eventRecord){
        System.out.println(
                "Payment event Listener 1 "+ eventRecord.name()
        );
    }
}
