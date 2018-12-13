package com.example.win.umbrellaproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    EditText innputname, inputpw, inputconfirm;
    Button registering;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        innputname = (EditText)findViewById(R.id.editRegistname);
        inputpw = (EditText)findViewById(R.id.editRegistpassword);
        inputconfirm = (EditText)findViewById(R.id.editRegistconfirm);
    }
}
