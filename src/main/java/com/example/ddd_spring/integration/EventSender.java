package com.example.ddd_spring.integration;

import com.example.ddd_spring.eventStore.api.EventEntry;

public interface EventSender {
    void send(EventEntry eventEntry);
}
