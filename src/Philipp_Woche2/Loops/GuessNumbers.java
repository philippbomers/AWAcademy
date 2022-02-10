/**
 * Zahlenraten
 * Zufällig soll eine Zahl von 1 bis 100 erzeugt werden, die vom Benutzer erraten wird. Das
 * Programm gibt zu einer eingegebenen Zahl aus, ob sie größer, kleiner oder gleich der
 * Zufallszahl ist. So nähert sich der Spieler dem Ergebnis schrittweise an.
 */

package Philipp_Woche2.Loops;

import java.util.Scanner;

public class GuessNumbers {
    public static void main() {
        System.out.println("Willkommen beim Zahlenraten.\n" +
                "Bitte wähle eine Zahl zwischen 1 und 100.\n" +
                "Um das Programm zu beenden, schreibe 0 oder eine Zahl über 100.");

        // generate random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100);

        Scanner scanNumberInput = new Scanner(System.in);
        int attempt = 0;

        // repeat until result is correct or user exits the program
        while (true) {
            attempt++;
            System.out.println("Versuch " + attempt + " - Rate eine Zahl: ");
            int guessedNumber = scanNumberInput.nextInt();
            String result = compareNumbers(randomNumber, guessedNumber);
            System.out.println(result);
            if (result.equals("Korrekt!") || result.equals("Exit"))
                return;
        }
    }

    /**
     * checks if two numbers are greater, smaller, equal
     *  or if user wants to exit
     *
     * @return String result
     */
    public static String compareNumbers(int randomNumber, int guessedNumber) {
        if (guessedNumber > 100 || guessedNumber == 0)
            return "Exit";
        else if (guessedNumber < randomNumber)
            return "Deine Zahl ist zu klein.";
        else if (guessedNumber > randomNumber)
            return "Deine Zahl ist zu groß";
        else
            return "Korrekt!";
    }
}
