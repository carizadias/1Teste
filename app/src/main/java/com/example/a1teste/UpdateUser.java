package com.example.a1teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.Date;

public class UpdateUser extends AppCompatActivity {

    EditText name;
    EditText number;
    EditText email;
    EditText date;
    RadioGroup gender;
    EditText pass;

    Button upDate;

    Button cancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_user);

        name = findViewById(R.id.name);
        number = findViewById(R.id.number);
        email = findViewById(R.id.email);
        date = findViewById(R.id.date);
        gender = findViewById(R.id.gender);
        pass = findViewById(R.id.pass);

        upDate = findViewById(R.id.updatebtn);
        cancel = findViewById(R.id.cancelbtn);
    }
}