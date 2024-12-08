package com.example.ddd_spring.integration;

public interface OffsetStore {
    long get();
    void update(long nextOffset);
}
