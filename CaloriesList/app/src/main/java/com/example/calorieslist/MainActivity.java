package com.example.calorieslist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // connect the RecyclerView to the activity
        RecyclerView foodCal = findViewById(R.id.rv);

        ArrayList<Food> foods = new ArrayList<>();
        // Items of the array list
        Food e = new Food("Egg",50,70,R.drawable.egg,5,1,6);
        Food r = new Food("White rice",100,171,R.drawable.rice,3.1,30.7,3.8);
        Food b = new Food("Beef bacon",100,272.7,R.drawable.bacon,11.4,9.1,31.8);
        Food c = new Food("Emmental cheese",100,366,R.drawable.cheese,27.8,5.4,26.9);
        Food bc = new Food("Butter croissant",67,272,R.drawable.croissant,14,31,5.5);
        Food wb = new Food("Whole wheat bread",32,82,R.drawable.bread,1.1,13.8,4);
        foods.add(e);  //0
        foods.add(r);  //1
        foods.add(b);  //2
        foods.add(c);  //3
        foods.add(bc); //4
        foods.add(wb); //5

//        align rv with linear layout
        foodCal.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        foodCal.setLayoutManager(lm);

        // add the adapter
        FoodAdapter fa = new FoodAdapter(foods,MainActivity.this); // fcontext can serve as "MainActivity" whenever a context that calls it is needed
        foodCal.setAdapter(fa);

    }
}