package org.lessons.java.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Prodotto> carrello = new ArrayList<>();

        boolean continua = true;
        while (continua) {
            System.out.println("Che tipo di prodotto vuoi inserire? (1: Smartphone, 2: Televisore, 3: Cuffie, 0: Esci)");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1 -> {
                    System.out.print("Inserisci il nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Inserisci la marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Inserisci il prezzo: ");
                    double prezzo = scanner.nextDouble();
                    System.out.print("Inserisci l'IVA: ");
                    double iva = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Inserisci il codice IMEI: ");
                    String codiceImei = scanner.nextLine();
                    System.out.print("Inserisci la memoria: ");
                    int memoria = scanner.nextInt();

                    carrello.add(new Smartphone(nome, marca, prezzo, iva, codiceImei, memoria));
                }

                case 2 -> {
                    System.out.print("Inserisci il nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Inserisci la marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Inserisci il prezzo: ");
                    double prezzo = scanner.nextDouble();
                    System.out.print("Inserisci l'IVA: ");
                    double iva = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Inserisci le dimensioni: ");
                    int dimensioni = scanner.nextInt();
                    System.out.print("Il televisore è smart? (true/false): ");
                    boolean smart = scanner.nextBoolean();

                    carrello.add(new Televisori(nome, marca, prezzo, iva, dimensioni, smart));
                }

                case 3 -> {
                    System.out.print("Inserisci il nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Inserisci la marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Inserisci il prezzo: ");
                    double prezzo = scanner.nextDouble();
                    System.out.print("Inserisci l'IVA: ");
                    double iva = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Inserisci il colore: ");
                    String colore = scanner.nextLine();
                    System.out.print("Le cuffie sono wireless? (true/false): ");
                    boolean wireless = scanner.nextBoolean();

                    carrello.add(new Cuffie(nome, marca, prezzo, iva, colore, wireless));
                }
                case 0 -> {
                    continua = false;
                }
                default -> System.out.println("Scelta non valida.");
            }
        }

        System.out.println("Carrello:");
        for (Prodotto prodotto : carrello) {
            System.out.println(prodotto.getNomeEsteso() + ", Prezzo con IVA: " + prodotto.getPrezzoConIvaFormattato());
        }

        scanner.close();
}

}
