package com.example.ddd_spring.catalog.command.domain.product;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Access(AccessType.FIELD)
public class ProductId implements Serializable {

    @Getter
    @Column(name = "product_id")
    private String id;

    protected ProductId(){

    }

    public ProductId(String id) {
        this.id = id;
    }

    public String getId() {
        return  id;
    }


    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        ProductId productId = (ProductId) o;
        return Objects.equals(id, productId.id);
    }


    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    public static ProductId of(String id){
        return new ProductId(id);
    }

}
