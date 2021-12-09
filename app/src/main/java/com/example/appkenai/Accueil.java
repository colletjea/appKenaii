package com.example.appkenai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Accueil extends AppCompatActivity {

    ImageView membres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        findViewById(R.id.boutonMembres).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Accueil.this, MembresActivity.class));
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