package com.example.first_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView nametext,emailtext, countrytext,gendertext;

    String name, email, gender, country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //initializing all components
        nametext=findViewById(R.id.nametext);
        emailtext=findViewById(R.id.emailtext);
        gendertext=findViewById(R.id.gendertext);
        countrytext=findViewById(R.id.countrytext);

        //getting values from Intent
        name=getIntent().getStringExtra("Name");
        email=getIntent().getStringExtra("Email");
        gender=getIntent().getStringExtra("Gender");
        country=getIntent().getStringExtra("Country");

        //Setting values of all textviews
        nametext.setText(name);
        emailtext.setText(email);
        gendertext.setText(gender);
        countrytext.setText(country);
    }
}