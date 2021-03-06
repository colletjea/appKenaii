package com.example.appkenai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class FAQ extends AppCompatActivity {
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("FAQ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
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

            case R.id.menu_Membres:
                intent = new Intent(getApplication(), MembresActivity.class);
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