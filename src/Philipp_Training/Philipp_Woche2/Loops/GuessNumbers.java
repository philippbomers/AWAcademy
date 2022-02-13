package Philipp_Training.Philipp_Woche2.Loops;

import java.util.Scanner;

public class GuessNumbers {

    public static void main(String[] args) {
        System.out.println("""
                Willkommen beim Zahlenraten.
                Bitte wähle eine Zahl zwischen 1 und 100.
                Um das Programm zu beenden, schreibe 0 oder eine Zahl über 100.""");

        // generate random number between 1 and 100
        byte randomNumber = (byte) (Math.random() * 100);

        // repeat until result is correct or user exits the program
        Scanner scanNumberInput = new Scanner(System.in);
        for (int attempt=1; true; attempt++) {
            System.out.println("Versuch " + attempt + " - Rate eine Zahl: ");
            byte guessedNumber = scanNumberInput.nextByte();
            String result = compareNumbers(randomNumber, guessedNumber);
            System.out.println(result);
            if (result.equals("Korrekt!") || result.equals("Exit"))
                break;
        }
    }

    /**
     * checks if two numbers are greater, smaller, equal
     * or if user wants to exit
     *
     * @return String result
     */
    public static String compareNumbers(byte randomNumber, byte guessedNumber) {
        if (guessedNumber > 100 || guessedNumber == 0)
            return "Exit";
        else if (guessedNumber < randomNumber)
            return "Deine Zahl ist zu klein.";
        else if (guessedNumber > randomNumber)
            return "Deine Zahl ist zu groß.";
        else
            return "Korrekt!";
    }
}
