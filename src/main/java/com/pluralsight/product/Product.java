package com.pluralsight.product;

import java.math.BigDecimal;

public abstract class Product implements Priceable{
    private String name;


    @Override
    public BigDecimal getPrice() {
        return null;
    }
}
