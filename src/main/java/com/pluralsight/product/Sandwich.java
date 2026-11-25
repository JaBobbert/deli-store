package com.pluralsight.product;

import com.pluralsight.toppings.Topping;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Sandwich extends Product{
    private String breadType;
    private String size;
    private boolean isToasted;
    private ArrayList<Topping> toppings;

    public Sandwich(String breadType, String size, boolean isToasted) {
        this.breadType = breadType;
        this.size = size;
        this.isToasted = isToasted;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public void addTopping(Topping topping){

    }

    public BigDecimal getPrice(){
        return BigDecimal.ZERO;
    }
}
