package Anja_Training.woche2.schleifenAufgaben;

import java.util.Scanner;

public class Weihnachtsbaum {
    /* Überlegung:
        - Anzahl der '*' ist immer (aktuelleZeile *2)-1
        - Anzahl der ' ' ist immer (gesamtzahlZeile - aktuelleZeile)
        - Position Zeichen 'I' ist immer identisch zu Zeile1 -> gesamtzahlZeile -1
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie hoch soll der Weihnachtsbaum sein? ");
        int sizeTree = scanner.nextInt();

        for (int lineNumber = 1; lineNumber <= sizeTree; lineNumber++) {
            for (int i = 0; i < (sizeTree - lineNumber); i++) {
                System.out.print(" ");
            }
            for (int numberSign = 0; numberSign < ((lineNumber * 2) - 1); numberSign++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int k = 0; k < sizeTree - 1; k++) {
            System.out.print(" ");
        }
        System.out.println("I");


    }
}
