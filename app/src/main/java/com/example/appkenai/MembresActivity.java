package com.example.appkenai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MembresActivity extends AppCompatActivity {
Intent intent;
    private String choixMembre;
    private Button buttonAllerSurClemence;
    private Button buttonAllerSurMarie;
    String personneChoisie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membres);

        Bundle b = new Bundle();

        buttonAllerSurClemence = findViewById(R.id.bouton_Clemence);
        buttonAllerSurClemence.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personneChoisie = "Clemence";
                intent = new Intent(getApplication(), PresentationMembresX.class);
                b.putString("personneChoisie",personneChoisie);
                intent.putExtras(b);
                setContentView(R.layout.activity_presentation_membres_x);
            }
        });

        buttonAllerSurMarie = findViewById(R.id.bouton_Marie);
        buttonAllerSurMarie.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personneChoisie = "Marie";
                intent = new Intent(getApplication(), PresentationMembresX.class);
                b.putString("personneChoisie",personneChoisie);
                intent.putExtras(b);
                setContentView(R.layout.activity_presentation_membres_x);
            }
        });



    }



























    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menu_accueil:
                intent = new Intent(getApplication(), Accueil.class);
                startActivity(intent);
                return true;

            case R.id.menu_referentsSports:
                intent = new Intent(getApplication(), ReferentsSports.class);
                startActivity(intent);
                return true;

            case R.id.menu_Event:
                Toast.makeText(this,"viendra au prochain commit", Toast.LENGTH_LONG).show();
                return true;

            case R.id.menu_PlanningDesSports:
                intent = new Intent(getApplication(), PlanningDesSports.class);
                startActivity(intent);
                return true;

            case R.id.menu_FAQ:
                intent = new Intent(getApplication(), FAQ.class);
                startActivity(intent);
                return true;

            case R.id.menu_Bonus:
                Intent intent = new Intent(getApplication(), Bonus.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}