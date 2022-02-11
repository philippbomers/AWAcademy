package Pia_Training.Pia_Woche2.Loops;

import java.util.Random;
import java.util.Scanner;

public class Schleifen {
    public static void main(String[] args) {
        /*
        // ZAHLENRATEN:
        // 1. Zufallszahl und User-Eingabe festlegen.
        int zufall, eingabe;
        // 2. 100 als maximalen Endwert deklarieren.
        final int MAX = 100;
        // 3. Scanner für User-Eingabe implementieren.
        Scanner in = new Scanner(System.in);
        // 4. Zufallszahl als random deklarieren.
        Random rand = new Random();
        boolean incorrectNumber = true;
        // 5. richtige Antwort
        zufall = rand.nextInt(MAX) + 1;
        // 6. Schleife bis die Antwort korrekt ist.
        while (incorrectNumber) {
            System.out.println(
                    "Gib eine Zahl zwischen 1 und 100 ein: ");
            // User gibt Zahl ein.
            eingabe = in.nextInt();
            // Falls die Zahl zu groß ist:
            if (eingabe > zufall) {
                System.out.println("Deine Zahl ist zu hoch. Versuche es nochmal. ");
            }
            // Falls die Zahl zu klein ist:
            else if (eingabe < zufall) {
                System.out.println("Deine Zahl ist zu niedrig. Versuche es nochmal.");
            }
            // Ende: Richtige Zahl wurde getroffen.
            else {
                System.out.println(
                        "Glückwunsch, du hast die richtige Zahl getroffen!");
                incorrectNumber = false;
            }
        }
        System.out.println("\n");
        */

        // DREIECKE:
        // Scanner für User-Eingabe implementieren.
        Scanner dreieck = new Scanner(System.in);
        System.out.println("Wie groß sollen deine Dreiecke sein?");
        int groesse = dreieck.nextInt();
        System.out.println("Wie viele von diesen Dreiecken möchtest du zeichnen?");
        int anzahl = dreieck.nextInt();

        //Dauer der Schleife mit User-Eingaben verbinden.
        for (int a = 1; a <= anzahl; a++) {
            for (int i = 1; i <= groesse; i++) {
                int j;
                for (j = 0; j == groesse; i++) {
                    System.out.print("*");
                }
                for (int k = 0; k <= (i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("\n");
        }
        System.out.println("\n");

        //BONUSAUFGABE (ohne Scanner):
        for (int i = 1; i <= 5; i++) {
            for (int leertaste = 1; leertaste <= 5 - i; leertaste++) {
                System.out.print(" ");
            }
            for (int stern = 1; stern <= (2 * i - 1); stern++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            for (int leertaste2 = 1; leertaste2 <= 4; leertaste2++) {
                System.out.print(" ");
            }
            for (int stamm = 1; stamm <= 1; stamm++) {
                System.out.print("I");
            }
            System.out.println();
        }
        System.out.println("\n");

        //BONUSAUFGABE (mit Scanner):
        Scanner tree = new Scanner(System.in);
        System.out.println("Gib die Höhe deines Baums ein:");
        int hoeheBaum = tree.nextInt();

        for (int i = 1; i <= hoeheBaum; i++) {
            for (int leertaste = 1; leertaste <= hoeheBaum - i; leertaste++) {
                System.out.print(" ");
            }
            for (int stern = 1; stern <= (2 * i - 1); stern++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            for (int leertaste = 1; leertaste <= (hoeheBaum - 1); leertaste++) {
                System.out.print(" ");
            }
            for (int stamm = 1; stamm <= 1; stamm++) {
                System.out.print("I");
            }
            System.out.println();
        }
        System.out.println("Ja, ist denn heut' scho Weihnachten?");
    }
}

