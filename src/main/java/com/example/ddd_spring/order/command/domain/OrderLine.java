package com.example.ddd_spring.order.command.domain;

import com.example.ddd_spring.catalog.command.domain.product.ProductId;
import com.example.ddd_spring.common.jpa.MoneyConverter;
import com.example.ddd_spring.common.model.Money;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class OrderLine {

    @Embedded
    private ProductId productId;

    @Column(name = "quantity")
    private int quantity;

    @Convert(converter = MoneyConverter.class)
    @Column(name = "price")
    private Money price;

    @Convert(converter = MoneyConverter.class)
    @Column(name = "amounts")
    private Money amounts;

    protected OrderLine() {

    }

    public OrderLine(ProductId productId, Money price, int quantity) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.amounts = calculateAmounts();
    }

    private Money calculateAmounts(){
        return price.multiply(quantity);
    }
    public ProductId getProductId() {
        return productId;
    }

    public Money getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Money getAmounts() {
        return amounts;
    }






}
