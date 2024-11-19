package com.example.ddd_spring.common.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Objects;


@Getter
@RequiredArgsConstructor
public class Money {

    private final int value;

    public Money multiply(int multiplier) {
        return new Money(value * multiplier);
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true; // Money 객체에 있는  value 값은 항상 같을 것
        if(o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;
        return value == money.getValue();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
