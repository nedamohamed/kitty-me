package com.example.planetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CatDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet_detail);

        Cat selected = (Cat)getIntent().getSerializableExtra("selectedplanet");
        String catName = selected.getCatName();
        String city = selected.getLocation().getCity();
        String phone = selected.getOwnerPhone();

        ImageView imgDetail = findViewById(R.id.imgPlanetDetail);
        TextView txtDesc = findViewById(R.id.txtPlanetDetail);
        TextView nameView = findViewById(R.id.textname);
        TextView address = findViewById(R.id.textview_location);
        TextView phoneNum = findViewById(R.id.textView3);

        nameView.setText(catName);
        imgDetail.setImageResource(selected.getImg());
        txtDesc.setText(selected.getDescription());
        address.setText(city);
        phoneNum.setText(phone);

        Button contactUsButton = findViewById(R.id.button);

        contactUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click, navigate to ContactUsActivity
                Intent intent = new Intent(CatDetailActivity.this, ContactUsActivity.class);
                startActivity(intent);
            }
        });




        getSupportActionBar().setTitle(selected.getCatName());






    }
}