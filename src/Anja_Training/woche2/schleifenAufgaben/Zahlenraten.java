package Anja_Training.woche2.schleifenAufgaben;

import java.util.Scanner;

public class Zahlenraten {
    public static void main(String[] args) {

        int randomZahl = (int) ((Math.random() * 100) + 1);
        //System.out.println(randomZahl);
        int guessZahl;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Errate die Zahl zwischen 1 und 100");
            guessZahl = scanner.nextInt();
            count = count + 1;

            if (guessZahl < randomZahl) {
                System.out.println("Deine Zahl ist kleiner als die zu erratende Zahl");

            } else if (guessZahl > randomZahl) {
                System.out.println("Deine Zahl ist größer als die zu erratende Zahl");
            } else {
                System.out.println("Herzlichen Glückwunsch! Du hast die Zahl erfolgreich erraten " +
                        "und dafür: " + count + " Versuche benötigt.");
            }

        } while (guessZahl != randomZahl);

    }
}
