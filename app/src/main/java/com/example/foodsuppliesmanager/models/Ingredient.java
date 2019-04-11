package com.example.foodsuppliesmanager.models;

public class Ingredient {

    String name;
    Integer amount;
    String unit;

    public Ingredient() {

    }

    public Ingredient(String name, Integer amount, String unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAmount() {
        return this.amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public String getUnit() {
        return this.unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
}
