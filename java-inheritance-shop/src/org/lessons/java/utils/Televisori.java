package org.lessons.java.utils;

public class Televisori extends Prodotto{
    private double dimensioni;
    private boolean smart;

    public Televisori(String nome, String descrizione, double prezzo, double iva, double dimensioni, boolean smart){
        super(nome, descrizione, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }
}
