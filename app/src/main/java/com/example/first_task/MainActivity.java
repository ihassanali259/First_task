package com.example.first_task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    //declaring all member Components
    EditText editTextname, editTextemail, editTextcountry,editTextpasword;
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button btnsubmit,btnsbmitforcombine;

    String name,email,password,country,gender=" ";
    int genderid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing all components
        editTextname=findViewById(R.id.Edittextname);
        editTextemail=findViewById(R.id.Edittextemail);
        editTextcountry=findViewById(R.id.EdittextCountry);
        editTextpasword=findViewById(R.id.Edittextpassword);
        btnsubmit=findViewById(R.id.submitbutton);
        btnsbmitforcombine=findViewById(R.id.submitbtnthird);

        radioGroup=findViewById(R.id.radiogroup);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Calling methods
                getData();
                SendDataOneByOne();
            }
        });

        //Button event for snding combine data
        btnsbmitforcombine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //calling methods
                getData();
                sendCombineData();
            }
        });
    }



    //This method will get data from all fields
    public  void getData()
    {
        name=editTextname.getText().toString();
        email=editTextemail.getText().toString();
        country=editTextcountry.getText().toString();
        password=editTextpasword.getText().toString();
        genderid=radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(genderid);
        gender=radioButton.getText().toString();

    }

    //method will start second activity
    public void SendDataOneByOne()
    {
        //Sending Values to another activity one by one
        Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
        intent.putExtra("Name",name);
        intent.putExtra("Email",email);
        intent.putExtra("Country",country);
        intent.putExtra("Password",password);
        intent.putExtra("Gender",gender);
        startActivity(intent);
    }

    //sending combine data
    public void sendCombineData()
    {

        Intent intent=new Intent(getApplicationContext(),ThirdActivity.class);
    //using bundle to bundle all the data
    Bundle bundle=new Bundle();
    bundle.putString("Name",name);
    bundle.putString("Email",email);
    bundle.putString("Gender",gender);
    bundle.putString("Country",country);

    intent.putExtras(bundle);
    startActivity(intent);
    }
}