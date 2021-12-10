package com.example.appkenai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class EventListAdapter extends ArrayAdapter<Event>{

    private static final String TAG = "EventListAdapter";
    private Context aContext;
    int aResource;

    private Context context;

    public EventListAdapter(Context context, int resource, ArrayList<Event> objects){
        super(context, resource, objects);
        aContext = context;
        aResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        String name = getItem(position).getNameEvent();
        String desc = getItem(position).getDescEvent();
        String date = getItem(position).getDateEvent();

        Event event = new Event(name, desc, date);

        LayoutInflater inflater = LayoutInflater.from(aContext);
        convertView = inflater.inflate(aResource, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.textView1);
        TextView tvDesc = (TextView) convertView.findViewById(R.id.textView2);
        TextView tvDate = (TextView) convertView.findViewById(R.id.textView3);

        tvName.setText(name);
        tvDesc.setText(desc);
        tvDate.setText(date);

        return convertView;
    }
}
