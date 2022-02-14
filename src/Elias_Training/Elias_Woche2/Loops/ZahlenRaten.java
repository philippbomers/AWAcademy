package Elias_Training.Elias_Woche2.Loops;

import java.util.Scanner;

public class ZahlenRaten {

    public static void randomZahlenRaten() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ich habe eine zufällige Zahl zwsichen 1 - 100,  rate mal welche...");
        System.out.println("Oder wenn du keine Lust hast, dann gib \"Exit\" ein :(");
        //int zufallsZahl = (new Random()).nextInt(100) + 1;
        byte zufallsZahl = (byte) (Math.random()*100);

        while (true) {
            String eingabe = scanner.nextLine();

            if (eingabe.matches("[0-9]+")) {
                if (Integer.parseInt(eingabe) == zufallsZahl) {
                    System.out.println("Applaus! Du hast gewonnen! Die richtige Zahl ist " + zufallsZahl);
                    break;

                } else if (Integer.parseInt(eingabe) < zufallsZahl) {
                    System.out.println("die eingegene Zahl ist zu niedrig");
                } else if (Integer.parseInt(eingabe) > zufallsZahl) {
                    System.out.println("die eingegebee Zahl ist zu hoch");

                }
            }  else if (eingabe.toLowerCase().contentEquals("exit")) {
                System.out.println("Schade... bye bye!\nAch warte kurz, die richtige Zahl war übrigens " + zufallsZahl + " ;)");
                break;
            }else {
                System.out.println("Deine Eingabe muss NUR aus Zahlen bestehen!\nVersuch nochmal ;)");
            }
        }
    }
}
