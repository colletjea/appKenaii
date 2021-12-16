package com.example.appkenai;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.os.IResultReceiver;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PresentationMembresX extends AppCompatActivity {

    private ImageView varImage;
    private TextView varNom;
    private TextView varFiliere;
    private TextView varPoste;
    private TextView varSportsPratiques;
            Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentation_membres_x);

        ChoixPersonnes();

        System.out.println("test");System.out.println("test");System.out.println("test");System.out.println("test");System.out.println("test");System.out.println("test");System.out.println("test");System.out.println("test");

    }


    public boolean ChoixPersonnes(){
        varImage = findViewById(R.id.photo_membre);
        varNom = findViewById(R.id.textePrenom);
        varFiliere = findViewById(R.id.texteFiliere);
        varPoste = findViewById(R.id.textePoste);
        varSportsPratiques = findViewById(R.id.textSport);


        Intent  in  = getIntent();
        Bundle b = in.getExtras();
        String personneChoix = b.getString("personneChoisie");
        Log.i("appKenai", personneChoix);


        String baseFiliere = "Filière : ";
        String basePoste = "Poste : ";
        String baseSport = "Sports pratiqués : ";


        switch (personneChoix){
            case "Marie":
                varImage.setImageResource(R.drawable.photo_marie);
                varNom.setText("Marie");
                varFiliere.setText(baseFiliere + "E4");
                varPoste.setText(basePoste + "VP");
                varSportsPratiques.setText(baseSport + "saute mouton");
                return true;

            case "Clemence":
                varImage.setImageResource(R.drawable.photo_clem);
                varNom.setText("Clemence");
                varFiliere.setText(baseFiliere + "E4FE");
                varPoste.setText(basePoste + "Prez");
                varSportsPratiques.setText(baseSport + "danse");
                return true;



            default:
                varNom.setText("VIDE");
                varFiliere.setText(baseFiliere + "VIDE");
                varPoste.setText(basePoste + "VIDE");
                varSportsPratiques.setText(baseSport + "VIDE");
                return true;

        }
    }
}