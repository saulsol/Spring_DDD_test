package com.example.ddd_spring.integration;

import com.example.ddd_spring.eventStore.api.EventStore;
import org.springframework.stereotype.Component;

@Component
public class EventForwarder {

    private static final int DEFAULT_LIMIT_SIZE = 100;

    private EventStore eventStore;
    private OffsetStore offsetStore;
    private EventSender eventSender;
    private int limitSize = DEFAULT_LIMIT_SIZE;

//    public EventForwarder(EventStore eventStore,
//                          OffsetStore offsetStore,
//                          EventSender eventSender){
//        this.eventStore = eventStore;
//        this.offsetStore = offsetStore;
//        this.eventSender = eventSender;
//    }
}
