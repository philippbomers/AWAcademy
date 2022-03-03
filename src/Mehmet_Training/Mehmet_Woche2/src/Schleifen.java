package Mehmet_Training.Mehmet_Woche2.src;

import java.util.Scanner;

public class Schleifen {
    public static void main(String[] args) {
        //Aufgabe: Zahlenraten
        //Zuerst wird eine Zufallszahl von 1 bis 100 erzeugt
        int numberOfTries = 1;
        int zielNummer = (int) (Math.random() * 100 + 1);
        System.out.print("Ich habe eine Zahl von 1-100 gewählt. Kannst du sie erraten?");
        Scanner sc = new Scanner(System.in);
        int userGuess = sc.nextInt();
        //Solange die Eingegebene und die erzeugte Zahl nicht gleich sind, wird der Prozess wiederholt.
        while (userGuess != zielNummer) {
            //Falls Eingabe großer als die Zufallszahl
            if (userGuess > zielNummer) {
                numberOfTries++;
                System.out.println("Es hat leider nicht geklappt. Versuch es noch einmal mit etwas Kleineres");
                userGuess = sc.nextInt();
                //Falls Eingabe kleiner als die Zufallszahl
            } else if (userGuess < zielNummer) {
                numberOfTries++;
                System.out.println("Es hat leider nicht geklappt. Versuch es noch einmal mit etwas Großeres");
                userGuess = sc.nextInt();
            }
        }
        System.out.println("Korrekt! Herzlichen Glückwunsch!");
        System.out.println("It took you only " + numberOfTries + " tries!");
        System.out.println();

        //Aufgabe: Dreiecke
        System.out.print("Wie groß dürfen die Dreiecke sein?");
        int große = sc.nextInt();
        System.out.print("Wie viele von diesen Dreiecken möchtest du zeichnen?");
        int anzahl = sc.nextInt();
        System.out.println();
        System.out.println(anzahl + " Dreieck(e) mit der Größe: " + große);
        System.out.println();
        //Der Prozess wird bezüglich der Anzahl der gewünschten Dreiecken wiederholt.
        for (int i = 0; i < anzahl; i++) {
            //Anzahl der Zeilen
            for (int j = 0; j < große; j++) {
                //Anzahl der Sterne pro jeweilige Zeile
                for (int k = 0; k <= j; k++) {
                    System.out.print('*');
                }
                System.out.println();
            }
            System.out.println();
        }

        //Bonusaufgabe: Weihnachtsbaum
        System.out.print("Wie groß darf der Weihnachtsbaum sein?");
        int großeWeihnachtsbaum = sc.nextInt();
        System.out.println("Hier ist einen schönen Weihnachtsbaum mit der Größe: " + großeWeihnachtsbaum);
        //Anzahl der Zeilen bezüglich der gewünschten Größe
        for (int i = 0; i <= großeWeihnachtsbaum; i++) {
            //Leerzeichen am Anfang jeweiliger Zeile
            for (int j = großeWeihnachtsbaum - i - 1; j >= 0; j--) {
                System.out.print(" ");
            }
            //Anzahl der Sterne nach den Leerzeichen, damit sie mittig ausgerichtet sind
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        //Nun der Stamm. Leerzeichen bis Mitte, danach ein dünner Stamm :)
        for (int i = großeWeihnachtsbaum - 2; i >= 0; i--) {
            System.out.print(" ");
        }
        System.out.println('I');
    }
}
