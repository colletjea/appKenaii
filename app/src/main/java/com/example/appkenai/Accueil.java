package com.example.appkenai;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Accueil extends AppCompatActivity {

    ImageView membres;
    private Button buttonAllerSurMembres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        buttonAllerSurMembres = findViewById(R.id.boutonMembres);

        buttonAllerSurMembres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, MembresActivity.class);
                //startActivity(intent);
                setContentView(R.layout.activity_main);

            }
        });



        /*membres= findViewById(R.id.bouton_membres);
        membres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Accueil.this, MembresActivity.class);
                startActivity(intent);
            }
        });*/
    }
}