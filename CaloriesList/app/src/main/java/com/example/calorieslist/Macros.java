package com.example.calorieslist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Macros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macros);
        Bundle b = getIntent().getExtras();
        Food fItems = (Food) b.getSerializable("food"); // casting is done after fixing the error

        // define all components
        ImageView img = findViewById(R.id.imageView2);
        TextView f = findViewById(R.id.fat);
        TextView cz = findViewById(R.id.carbz);
        TextView p = findViewById(R.id.pro);
        TextView n = findViewById(R.id.name);

        //set components
        img.setImageResource(fItems.getImg());

        f.setText(fItems.getFat()+"");
        cz.setText(fItems.getCarbohydrates()+"");
        p.setText(fItems.getProtein()+"");
        n.setText(fItems.getName());

    }

}