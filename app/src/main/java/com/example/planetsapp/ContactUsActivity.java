package com.example.planetsapp;

// ContactUsActivity.java
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ContactUsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactus);

        TextView mainText = findViewById(R.id.titleContactUs);
        TextView details = findViewById(R.id.details);

        mainText.setText("Contact us!");
        details.setText("You can contact us by email or by phone.\nEmail: adoptacat@kittyme.com\nPhone: 0 535 438 13 33");

        getSupportActionBar().setTitle("Get In Contact");
    }
}
