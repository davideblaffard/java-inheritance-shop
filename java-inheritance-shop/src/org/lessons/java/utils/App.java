package org.lessons.java.utils;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Prodotto prodotto = new Prodotto("Smartphone", "Telefono di ultima generazione", 799.99, 0.22);

        // Test dei metodi
        System.out.println("Codice prodotto: " + prodotto.getCodice());
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Descrizione: " + prodotto.getDescrizione());
        System.out.println("Prezzo base: " + prodotto.getPrezzoBase());
        System.out.println("Prezzo con IVA: " + prodotto.getPrezzoConIvaFormattato());
        System.out.println("Nome esteso: " + prodotto.getNomeEsteso());
    }
}
