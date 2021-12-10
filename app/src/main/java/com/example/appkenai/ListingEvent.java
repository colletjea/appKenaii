package com.example.appkenai;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListingEvent extends AppCompatActivity {

    Intent intent;

    ArrayList<Event> data;
    private ArrayAdapter<Event> adapter;
    private ListView lv ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing_event);


        lv = (ListView) findViewById(R.id.ListViewEvent);
        ArrayList<Event> eventList = new ArrayList<>();

        Event event1 = new Event("dinner", "repas en famille", "30/11/2021");
        Event event2 = new Event("gateau", "cuisiner", "01/01/2022");
        //Event event3 = new Event(name, description, "05/01/2022");

        //Intent in = getIntent();
        //Bundle b = in.getExtras();
        //String name;


        //String description = b.getString("desc", "vide desc");
        //String date = b.getString("date", "01/01/1001");


        //event1.setNameEvent(name);
        //event1.setDescEvent(description);
        //event1.setDateEvent(date);

        eventList.add(event1);
        eventList.add(event2);

        EventListAdapter adapter = new EventListAdapter(this, R.layout.adapter_view_layout, eventList);
        lv.setAdapter(adapter);

        //Event[] listEvent = new Event[]{event1, event2};



        //adapter<Event> arrayAdapter = new ArrayAdapter<Event>(this, R.layout.activity_listing_event, listEvent);
        //adapter = new ArrayAdapter<Event>(this, android.R.layout.simple_list_item_1, data);
        //lv.setAdapter(adapter);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_event, menu);
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
                intent = new Intent(getApplication(), Bonus.class);
                startActivity(intent);
                return true;

            case R.id.menu_Ajout_Event:
                intent = new Intent(getApplication(), CreateEvent.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
//https://abhiandroid.com/ui/listview
//https://borntocode.fr/android-comment-utiliser-une-listview/