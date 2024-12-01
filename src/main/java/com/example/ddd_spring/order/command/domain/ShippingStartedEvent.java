package com.example.ddd_spring.order.command.domain;

public class ShippingStartedEvent {

    private String orderNumber;

    public ShippingStartedEvent(String number){
        this.orderNumber = number;
    }

    public String getOrderNumber(){
        return orderNumber;
    }

}
