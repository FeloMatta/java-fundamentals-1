package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcoloBigliettoTreno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.print("Inserisci il numero di chilometri da percorrere: ");
        int chilometri = scanner.nextInt();

        System.out.print("Inserisci l'età del passeggero: ");
        int eta = scanner.nextInt();

        double prezzoTotale = chilometri * 0.21;

        if (eta < 18) {
            prezzoTotale *= 0.8; // Applica lo sconto del 20% per i minorenni
        } else if (eta >= 65) {
            prezzoTotale *= 0.6; // Applica lo sconto del 40% per gli over 65
        }

        System.out.println("Il prezzo totale del viaggio è: " + decimalFormat.format(prezzoTotale) + " €");

        scanner.close();
    }
}
