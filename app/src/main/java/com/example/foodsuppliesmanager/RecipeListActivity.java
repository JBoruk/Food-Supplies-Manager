package com.example.foodsuppliesmanager;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.foodsuppliesmanager.mock.MockEverything;
import com.example.foodsuppliesmanager.models.Recipe;

import java.util.List;

public class RecipeListActivity extends AppCompatActivity {

    ListView recipeListView;
    List<Recipe> recipeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);

        Resources res = getResources();

        recipeListView = findViewById(R.id.recipeList);

        MockEverything mock = new MockEverything();
        recipeList = mock.getListOfRecipes();
    }
}
