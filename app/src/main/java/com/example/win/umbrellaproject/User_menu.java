package com.example.win.umbrellaproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class User_menu extends AppCompatActivity {
    Button child, vaccine, place;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_menu);
        child = (Button)findViewById(R.id.btnChild);
        vaccine = (Button)findViewById(R.id.btnVaccine);
        place = (Button)findViewById(R.id.btnPlace);
    }
}
