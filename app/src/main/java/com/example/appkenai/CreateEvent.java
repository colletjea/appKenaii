package com.example.appkenai;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateEvent extends AppCompatActivity {

    private Button varCreateEvent;
    private Button varMajEvent;
    private Button varSuppressionEvent;
    private Button varAfficherEvent;
    private EditText varNameEvent;
    private EditText varDescriptionEvent;
    private EditText varDateEvent;
    DBHelper DB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        varCreateEvent = findViewById(R.id.createEvent);
        varMajEvent = findViewById(R.id.majEvent);
        varSuppressionEvent = findViewById(R.id.suppressionEvent);
        varAfficherEvent = findViewById(R.id.afficherEvent);
        //nameEvent = findViewById(R.id.nameEvent);
        //descriptionEvent = findViewById(R.id.descriptionEvent);
        varNameEvent = findViewById(R.id.nameEvent);
        varDescriptionEvent = findViewById(R.id.descriptionEvent);
        varDateEvent = findViewById(R.id.dateEvent);
        DB = new DBHelper(this);



        varCreateEvent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //CreateEvent.this.saveData(view);
                //Intent intent = new Intent(CreateEvent.this, ListingEvent.class);
                //Intent intent = new Intent(CreateEvent.this, ListingEvent.class);
                //Bundle b = new Bundle();
                varNameEvent = findViewById(R.id.nameEvent);
                varDescriptionEvent = findViewById(R.id.descriptionEvent);
                varDateEvent = findViewById(R.id.dateEvent);

                String name = varNameEvent.getText().toString();
                String description = varDescriptionEvent.getText().toString();
                String date = varDateEvent.getText().toString();
                Boolean checkinsertdata = DB.insertuserdata(name, description, date);
                if(checkinsertdata==true){
                    Toast.makeText(CreateEvent.this, "Nouvel évent accepté !", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplication(), ListingEvent.class);
                startActivity(intent);}
                else
                    Toast.makeText(CreateEvent.this, "Nouvel évent non accepté", Toast.LENGTH_SHORT).show();
            }
        });

        varMajEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = varNameEvent.getText().toString();
                String description = varDescriptionEvent.getText().toString();
                String date = varDateEvent.getText().toString();

                Boolean checkupdatedata = DB.updateuserdata(name, description, date);
                if(checkupdatedata==true)
                    Toast.makeText(CreateEvent.this, "Event mis à jour", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(CreateEvent.this, "Event non mis à jour", Toast.LENGTH_SHORT).show();
            }        });

        varSuppressionEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = varNameEvent.getText().toString();
                Boolean checkudeletedata = DB.deletedata(name);
                if(checkudeletedata==true)
                    Toast.makeText(CreateEvent.this, "Event supprimé", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(CreateEvent.this, "Event non supprimé", Toast.LENGTH_SHORT).show();
            }        });

        varAfficherEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        Cursor res = DB.getdata();
        if(res.getCount()==0){
            Toast.makeText(CreateEvent.this, "Aucun évent n'existe avec ce nom...", Toast.LENGTH_SHORT).show();
            return;
        }
        StringBuffer buffer = new StringBuffer();
        while(res.moveToNext()){
            buffer.append("Name :"+res.getString(0)+"\n");
            buffer.append("descrption :"+res.getString(1)+"\n");
            buffer.append("Date de l'évent :"+res.getString(2)+"\n\n");
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(CreateEvent.this);
        builder.setCancelable(true);
        builder.setTitle("Entrées utilisateurs");
        builder.setMessage(buffer.toString());
        builder.show();
            }
        });

    }


    //private void saveData(View view){
    //    SharedPreferences sharedPreferences= this.getSharedPreferences("tabEvent", Context.MODE_PRIVATE);
    //    SharedPreferences.Editor editor = sharedPreferences.edit();
    //
    //    editor.putString("nameEvent", this.nameEvent.getText().toString());
    //    editor.putString("descEvent", "descriptionEvent");
    //    editor.apply();
    //    Toast.makeText(this,"Event ok",Toast.LENGTH_LONG).show();
    //}


}