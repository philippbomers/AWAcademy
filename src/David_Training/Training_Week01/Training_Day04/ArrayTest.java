package David_Training.Training_Week01.Training_Day04;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        int [] input = new int [] {1, 4, 5, 7, 20000, -511, 100, -200, 400};

        // Aufgabe 1: Summe, Maximum, Minimum

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < input.length; i++) {
            sum += input[i];

            if (input[i] > max) {
                max = input[i];
            }

            if (input[i] < min) {
                min = input[i];
            }

        }

        System.out.println("Aufgabe 1: Der Array input vom Typ int " + Arrays.toString(input) + " hat die Summe " + sum
                + ", den minimalen Wert " + min + " und den maximalen Wert " + max);

        // // Aufgabe 2: Summe, Maximum, Minimum mit for each

        sum = 0;
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        for (int i: input) {
            sum += i;

            if (i > max) {
                max = i;
            }

            if (i < min) {
                min = i;
            }
        }

        System.out.println("Aufgabe 2: Der Array input vom Typ int " + Arrays.toString(input) + " hat die Summe " + sum
                + ", den minimalen Wert " + min + " und den maximalen Wert " + max);

        // Bonusaufgabe: Modulo-Suche

        int [] result;
        int counter = 0;

        // Zählen der geraden Zahlen
        for (int item : input) {
            if (item%2 == 0) {
                counter += 1;
            }
        }

        result = new int[counter];

        for (int item : input) {

        }



    }
}
