package org.lessons.java.utils;

import java.util.Random;

public class Prodotto {
    private int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public double iva;

    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.codice = generaCodice();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    private int generaCodice() {
        Random random = new Random();
        return random.nextInt(100000); // Genera un numero random tra 0 e 99999
    }

    public double getPrezzoBase(){
        return prezzo;
    }

    public String getPrezzoConIvaFormattato() {
        return String.format("%.2f", prezzo * (1 + iva));
    }

    public int getCodice(){
        return codice;
    }

    public String getNomeEsteso(){
        return codice + "-" + nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescrizione(){
        return descrizione;
    }

    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }

    public double getIva(){
        return iva;
    }

    public void setIva(double iva){
        this.iva = iva;
    }

}
