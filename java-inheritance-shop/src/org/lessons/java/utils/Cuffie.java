package org.lessons.java.utils;

public class Cuffie extends Prodotto{
    private String colore;
    private boolean connettivita;

    public Cuffie(String nome, String descrizione, double prezzo, double iva, String colore, boolean connettivita){
        super(nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.connettivita = connettivita;
    }

    public String getColore(){
        return colore;
    }

    public void setColore(String colore){
        this.colore = colore;
    }

    public boolean getConnettivita(){
        return connettivita;
    }

    public void setConnettivita(boolean  connettivita){
        this.connettivita = connettivita;
    }
}
