package Elias_Training.Elias_Woche2.Loops;

import java.util.Scanner;

public class Dreiecke {

    public static void dreieckeErzeugen() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie groß sollen deine Dreiecke sein? ");
        String groesseString = scanner.nextLine();
        System.out.print("Wie viele Dreiecke möchtest du haben? ");
        String anzahlString = scanner.nextLine();


        if (groesseString.matches("[0-9]+") && anzahlString.matches("[0-9]+")) {
            int groesse = Integer.parseInt(groesseString);
            int anzahl = Integer.parseInt(anzahlString);

            for (int a = 0; a < anzahl; a++) {
                for (int zeile = 1; zeile <= groesse; zeile++) {

                    for (int spalte = 1; spalte <= groesse; spalte++) {
                       if (spalte <= zeile)

                            System.out.print("*");
                    }
                    System.out.println();
                }

                System.out.println();
            }


        }else System.out.println("Falsche Eingaben!");
    }
}
