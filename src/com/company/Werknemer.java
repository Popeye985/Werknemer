package com.company;

public class Werknemer {
    private String naam;
    private double loon;
    public Werknemer (String naam, double loon){
        this.loon = loon;
        this.naam = naam;

    }

    public double getLoon(){
        return loon;

    }
}
