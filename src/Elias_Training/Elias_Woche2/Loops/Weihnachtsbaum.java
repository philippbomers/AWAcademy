package Elias_Training.Elias_Woche2.Loops;

import java.util.Scanner;

public class Weihnachtsbaum {

    public static void weihnachtsbaumErstellen() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie hoch darf Ihr Weihnachtsbaum sein? ");
        String hoeheString = scanner.nextLine();

        if (hoeheString.matches("[0-9]+")) {
            int hoehe = Integer.parseInt(hoeheString);

            // 1. Schleife für die Höhe des Baums (für jede sozusagen Etage des Baums)
            for (int i = 1; i <= hoehe; i++) {
                // 2. um die Leerzeichen hinzufügen
                for (int leerzeichen = 1; leerzeichen <= hoehe - i; leerzeichen++) {
                    System.out.print(" ");
                }
                // 3. um Sternchen auszugeben
                for (int sternchen = 1; sternchen <= (2 * i - 1); sternchen++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // bis zu (Hoehe-1) Leerzeichen hinzufügen
            for (int i = 1; i<=hoehe-1;i++){
                System.out.print(" ");
            }
            // Und anschließend Baumstamm
            System.out.println("I");


        } else
            System.out.println("Prüfen Sie bitte Ihre Eingabe auf Richtigkeit!");

    }
}




