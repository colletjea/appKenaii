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
import android.view.Menu;
import android.view.MenuItem;
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
        setTitle("Membres");
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
            case "Clemence":
                varImage.setImageResource(R.drawable.photo_clem);
                varNom.setText("Clemence");
                varFiliere.setText(baseFiliere + "E4-FE");
                varPoste.setText(basePoste + "Prez");
                varSportsPratiques.setText(baseSport + "danse");
                return true;

            case "Marie":
                varImage.setImageResource(R.drawable.photo_marie);
                varNom.setText("Marie");
                varFiliere.setText(baseFiliere + "E4-BIO");
                varPoste.setText(basePoste + "VP");
                varSportsPratiques.setText(baseSport + "course à pied et saute mouton");
                return true;

            case "Martin":
                varImage.setImageResource(R.drawable.photo_martin);
                varNom.setText("Martin");
                varFiliere.setText(baseFiliere + "E4-BIO");
                varPoste.setText(basePoste + "VP");
                varSportsPratiques.setText(baseSport + "streat workout et football");
                return true;

            case "Benjamin":
                varImage.setImageResource(R.drawable.photo_benj);
                varNom.setText("Benjamin");
                varFiliere.setText(baseFiliere + "E2");
                varPoste.setText(basePoste + "Trésorier");
                varSportsPratiques.setText(baseSport + "musculation et vélo");
                return true;

            case "Mona":
                varImage.setImageResource(R.drawable.photo_mona);
                varNom.setText("Mona");
                varFiliere.setText(baseFiliere + "E4-BIO");
                varPoste.setText(basePoste + "Secrétaire");
                varSportsPratiques.setText(baseSport + "volley et raclette");
                return true;

            case "Pauline":
                varImage.setImageResource(R.drawable.photo_pauline);
                varNom.setText("Pauline");
                varFiliere.setText(baseFiliere + "E4-IAC");
                varPoste.setText(basePoste + "Respo Com'");
                varSportsPratiques.setText(baseSport + "crossfit et sieste");
                return true;

            default:
                varNom.setText("VIDE");
                varFiliere.setText(baseFiliere + "VIDE");
                varPoste.setText(basePoste + "VIDE");
                varSportsPratiques.setText(baseSport + "VIDE");
                return true;

        }
    }
    public void onBackPressed(){ //onbackpressed = on a appuyé sur le bouton retour
        intent = new Intent(getApplication(), MembresActivity.class);//on crée un intent qui permet d'ouvri l'appli memebre activité
        startActivity(intent); //on lance cette action
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
                intent = new Intent(getApplication(), ListingEvent.class);
                startActivity(intent);
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

