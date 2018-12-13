package com.example.win.umbrellaproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Admin_menu extends AppCompatActivity {
    Button account, vaccine, place;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu);
        account = (Button)findViewById(R.id.btnAccount);
        vaccine = (Button)findViewById(R.id.btnVaccineMan);
        place = (Button)findViewById(R.id.btnPlaceMan);
    }
}
