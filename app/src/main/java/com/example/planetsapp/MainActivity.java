package com.example.planetsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Cat> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("KittyMe!");

        data = Cat.getallCat();


        RecyclerView recPlanet = findViewById(R.id.recPlanet);
        recPlanet.setLayoutManager(new LinearLayoutManager(this));

        CatViewAdapter planetAdp = new CatViewAdapter(this, data, new CatViewAdapter.CatAdapterListener() {
            @Override
            public void CatRowClicked(Cat cat) {
                //Snackbar.make(MainActivity.this,recPlanet,planet.getName(),Snackbar.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, CatDetailActivity.class);
                i.putExtra("selectedplanet",cat);
                startActivity(i);
            }



        });

        recPlanet.setAdapter(planetAdp);


    }
}