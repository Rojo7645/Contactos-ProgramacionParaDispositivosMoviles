package com.example.contactos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class contactos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uno_contactos);

        //icono en la barra
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }
}