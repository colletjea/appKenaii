package com.example.appkenai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateEvent extends AppCompatActivity {

    private Button createEvent;
    private EditText nameEvent;
    private EditText descriptionEvent;
    //private EditText dateEvent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        createEvent = findViewById(R.id.createEvent);
        //nameEvent = findViewById(R.id.nameEvent);
        //descriptionEvent = findViewById(R.id.descriptionEvent);
        EditText nameEvent = findViewById(R.id.nameEvent);
        EditText descriptionEvent = findViewById(R.id.descriptionEvent);
        //EditText dateEvent = findViewById(R.id.dateEvent);

        createEvent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //CreateEvent.this.saveData(view);
                //Intent intent = new Intent(CreateEvent.this, ListingEvent.class);
                Intent intent = new Intent(CreateEvent.this, ListingEvent.class);
                Bundle b = new Bundle();
                EditText nameEvent = findViewById(R.id.nameEvent);
                EditText descriptionEvent = findViewById(R.id.descriptionEvent);
                //EditText dateEvent = findViewById(R.id.dateEvent);
                String name = nameEvent.getText().toString();
                String description = descriptionEvent.getText().toString();
                //String date = dateEvent.getText().toString();
                b.putString("name",name);
                b.putString("desc",description);
                //b.putString("date",date);
                intent.putExtras(b);
                startActivity(intent);
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