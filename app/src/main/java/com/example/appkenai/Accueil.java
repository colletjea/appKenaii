package com.example.appkenai;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Accueil extends AppCompatActivity {

    ImageView membres;
    //private Button buttonAllerSurMembres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        //page membre
        Button buttonAllerSurMembres=findViewById(R.id.buttonMembres);
        buttonAllerSurMembres.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MembresActivity.class);
                startActivity(intent);
            }
        });

        //page référents sports
        Button buttonAllerSurReferentsSports=findViewById(R.id.buttonReferentsSports);
        buttonAllerSurReferentsSports.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), ReferentsSports.class);
                startActivity(intent);
            }
        });

        //page event
        Button buttonAllerSurEvent=findViewById(R.id.buttonVersEvent);
        buttonAllerSurEvent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MembresActivity.class);// A CHANGER
                startActivity(intent);
            }
        });

        //page planning des sports
        Button buttonAllerSurPlanning=findViewById(R.id.buttonVersPlanning);
        buttonAllerSurPlanning.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), PlanningDesSports.class);
                startActivity(intent);
            }
        });

        //page FAQ
        Button buttonAllerSurFAQ=findViewById(R.id.buttonVersFAQ);
        buttonAllerSurFAQ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), FAQ.class);
                startActivity(intent);
            }
        });


        //page bonus
        Button buttonAllerSurBonus=findViewById(R.id.buttonVersBonus);
        buttonAllerSurBonus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), Bonus.class);
                startActivity(intent);
            }
        });

    }
}