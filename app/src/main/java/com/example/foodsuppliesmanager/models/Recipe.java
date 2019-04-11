package com.example.foodsuppliesmanager.models;

import java.util.List;

public class Recipe {

    private String name;
    private String description;
    private List<Ingredient> ingredient;

    public Recipe() {

    }

    public Recipe(String name, String description, List<Ingredient> ingredient) {
        this.name = name;
        this.description = description;
        this.ingredient = ingredient;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Ingredient> getIngredient() {
        return ingredient;
    }
    public void setIngredient(List<Ingredient> ingredient) {
        this.ingredient = ingredient;
    }
}
