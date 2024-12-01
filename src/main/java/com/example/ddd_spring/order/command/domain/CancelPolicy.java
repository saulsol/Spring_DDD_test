package com.example.ddd_spring.order.command.domain;

public interface CancelPolicy {
    boolean hasCancellationPermission(Order order);
}
