package com.example.appkenai;

public class Event {
    private String nameEvent;
    private String descEvent;
    private String dateEvent;

    public Event(String nameEvent, String descEvent, String dateEvent){
        this.nameEvent = nameEvent;
        this.descEvent = descEvent;
        this.dateEvent = dateEvent;
    }

    public String getNameEvent(){
        return nameEvent;
    }

    public void setNameEvent(String n){
        this.nameEvent = n;
    }

    public String getDescEvent(){
        return descEvent;
    }

    public void setDescEvent(String d){
        this.descEvent = d;
    }

    public String getDateEvent(){
        return dateEvent;
    }

    public void setDateEvent(String name){
        this.dateEvent = name;
    }

    @Override
    public String toString(){
        return this.nameEvent;
    }
}
