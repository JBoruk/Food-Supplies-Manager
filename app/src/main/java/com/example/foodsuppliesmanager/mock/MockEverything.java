package com.example.foodsuppliesmanager.mock;

import com.example.foodsuppliesmanager.models.Ingredient;
import com.example.foodsuppliesmanager.models.Recipe;

import java.util.ArrayList;
import java.util.List;

public class MockEverything {

    public List<Recipe> getListOfRecipes() {
        final Recipe r1 = new Recipe("Pierwszy", "Bardzo prosty przepis numer 1", new ArrayList<Ingredient>() {{
            add(new Ingredient("Kalafior", 1, "główka"));
            add(new Ingredient("Ziemniaki", 2, "kg"));
            add(new Ingredient("Mleko", 250, "ml"));
            add(new Ingredient("Makaron", 500, "g"));
        }});

        final Recipe r2 = new Recipe("Pierwszy", "Bardzo prosty przepis numer 1", new ArrayList<Ingredient>() {{
            add(new Ingredient("Burak", 1, "główka"));
            add(new Ingredient("Parówki", 2, "kg"));
            add(new Ingredient("Woda", 250, "ml"));
            add(new Ingredient("Dupa", 500, "g"));
        }});

        final Recipe r3 = new Recipe("Pierwszy", "Bardzo prosty przepis numer 1", new ArrayList<Ingredient>() {{
            add(new Ingredient("Kalafior", 1, "główka"));
            add(new Ingredient("Ziemniaki", 2, "kg"));
            add(new Ingredient("Mleko", 250, "ml"));
            add(new Ingredient("Makaron", 500, "g"));
        }});

        final Recipe r4 = new Recipe("Pierwszy", "Bardzo prosty przepis numer 1", new ArrayList<Ingredient>() {{
            add(new Ingredient("Kalafior", 1, "główka"));
            add(new Ingredient("Ziemniaki", 2, "kg"));
            add(new Ingredient("Mleko", 250, "ml"));
            add(new Ingredient("Makaron", 500, "g"));
        }});

        List<Recipe> list = new ArrayList<Recipe>() {{
            add(r1);
            add(r2);
            add(r3);
            add(r4);
        }};

        return list;
    }
}
