package com.example.appkenai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Bonus extends AppCompatActivity {
Intent intent;
private Button boutonDeLaSurprise;
private ImageView varImageSurfriise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Surfriiise");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bonus);


    boutonDeLaSurprise = findViewById(R.id.buttonSurfriiise);
        boutonDeLaSurprise.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                varImageSurfriise = findViewById(R.id.JPetClem);
               varImageSurfriise.getLayoutParams().height = 700;
                varImageSurfriise.getLayoutParams().width = 486;
                varImageSurfriise.requestLayout();
                Toast.makeText(Bonus.this, "SURFRIIISE !", Toast.LENGTH_SHORT).show();
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