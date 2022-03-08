package David_Training.Training_Week01.Training_Day03;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterUndStrings {
    public static void main(String[] args) {

        char [] zeichenKette = {'J', 'a', 'v', 'a', '-', 'K', 'u', 'r', 's'};

        // Aufgabe 1:
        System.out.println("Aufgabe 1: ");

        for (int i = zeichenKette.length-1; i >= 0; i--) {
            System.out.print(zeichenKette[i] + "\t");
        }

        // Aufgabe 2:
        System.out.println("\nAufgabe 2: ");

        for (int i = 0; i < zeichenKette.length; i+=2) {
            System.out.print(zeichenKette[i] + "\t");
        }

        // Aufgabe 3:
        System.out.println("\nAufgabe 3: ");

        // String stringZeichenKette =
        String stringZeichenKette = String.valueOf(zeichenKette);
        System.out.println(stringZeichenKette);

        // Aufgabe 4:
        System.out.println("Aufgabe 4: ");

        String beliebigeZeichenfolge = "Beliebige Zeichenfolge";

        char [] newCharArray = beliebigeZeichenfolge.toCharArray();

        System.out.println(Arrays.toString(newCharArray));

        // Aufgabe 5:
        System.out.println("Aufgabe 5: ");

        String zeichenFolge = "1, 2, 4, 9, 8, 7, 6, 4, 1";

        String [] newStringArray = zeichenFolge.split(", ");
        int [] newIntArray = new int[newStringArray.length];

        for (int i = 0; i < newStringArray.length; i++) {
            newIntArray[i] = Integer.parseInt(newStringArray[i]);
        }

        // Einfache Methode
        System.out.println(Arrays.toString(newIntArray));

        /*// Naive Methode
        for(int i : newIntArray) {
            System.out.print(String.valueOf(i) + "\t");
        }*/

    }
}
