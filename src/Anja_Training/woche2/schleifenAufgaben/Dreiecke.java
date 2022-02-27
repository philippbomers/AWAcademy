package Anja_Training.woche2.schleifenAufgaben;

import java.util.Scanner;

public class Dreiecke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kommunikation mit User
        System.out.println("Wie groß sollen deine Dreiecke sein?");
        int linesTriangle = scanner.nextInt();

        System.out.println("Wieviele von diesen Dreiecken möchtest du zeichnen?");
        int numberTriangle = scanner.nextInt();

        System.out.println("Hier ist das Ergebnis: ");

        // for-Loop für die Anzahl der Dreiecke
        for (int i = 0; i < numberTriangle; i++) {

            // for-Loop für die Linien eines Dreiecks
            for (int y = 1; y <= linesTriangle; y++) {

                // while-Schleife für die Zahl der aufeinanderfolgenden '*'
                int x = 0;
                while (x < y) {
                    System.out.print("*");
                    x++;
                }
                System.out.print("\n");

            }
            System.out.print("\n");
        }
    }
}
