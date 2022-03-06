package Philipp_Training.Philipp_Woche5.day3;

import java.util.Scanner;

public class FastLaneProgramming {
    public static void main(String[] args) {

        System.out.println("gib die Nummer ein");
        String input;
        int myNumber;

        while (true) {
            input = (new Scanner(System.in)).nextLine();
            myNumber = Integer.parseInt(input);
            if (input.matches("[0-9]*") && (myNumber > 0 && myNumber < 13)) {
                switch (myNumber) {
                    case 1, 2, 3, 4 -> System.out.println("Frühling " + "allergie".toUpperCase());
                    case 5, 6, 7, 8 -> System.out.println("Sommer" + "Sonnenbrand".toLowerCase());
                    case 9, 10, 11, 12 -> System.out.println("Herbst");
                    default -> System.out.println("Winter gibt es nicht.");
                }
                break;
            } else {
                System.out.println("Bitte gib eine Zahl von 1-12 ein.");
            }
        }
    }
}
