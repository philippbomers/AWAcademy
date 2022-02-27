package Anja_Training.woche2.operatoren;

import java.util.Scanner;

public class Zeiteinheiten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wieviele Sekunden hast du zur Verfügung: ");
        int x = scanner.nextInt();
        int secs = x % 60;
        x = x / 60;             // x in min
        int mins = x % 60;
        x = x / 60;             // x in hours
        int hours = x % 24;
        x = x / 24;             // x in days
        int days = x % 365;
        x = x / 365;            // x in Years

        // Countdownanzeige
        System.out.println(x + " Jahre und " + days + " Tage und " + hours + " Stunden und " + mins + " Minuten und " + secs + " Sekunden");

    }


}
