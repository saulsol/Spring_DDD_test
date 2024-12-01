package com.example.ddd_spring.common.event;

public abstract class Event {

    private long timeStamp;

    public Event() {
        this.timeStamp = System.currentTimeMillis();
    }

    public long getTimeStamp(){
        return timeStamp;
    }


}
