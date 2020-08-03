package com.example.first_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView nametext,emailtext, countrytext,gendertext;

    String name, email, gender, country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        //initializing all components
        nametext=findViewById(R.id.nametext);
        emailtext=findViewById(R.id.emailtext);
        gendertext=findViewById(R.id.gendertext);
        countrytext=findViewById(R.id.countrytext);

        //Calling method getData()
        getData();

        //setting values of textviews
        nametext.setText(name);
        emailtext.setText(email);
        gendertext.setText(gender);
        countrytext.setText(country);
    }

    //Get all data from bundle object passed from previous activity
    public void getData()
    {
        Bundle bundle=getIntent().getExtras();
        name=bundle.getString("Name");
        email=bundle.getString("Email");
        gender=bundle.getString("Gender");
        country=bundle.getString("Country");


    }
}