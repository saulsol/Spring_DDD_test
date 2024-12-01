package com.example.ddd_spring.eventStore.api;

public class PayloadConvertException extends RuntimeException {

    public PayloadConvertException(Exception e) {
        super(e);
    }

}
