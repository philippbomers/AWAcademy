package Philipp_Training.Philipp_Woche3;


import Philipp_Training.Philipp_Woche3.Arrays.MinimumAndMaximum;
import Philipp_Training.Philipp_Woche3.Arrays.MultiplicationTables;
import Philipp_Training.Philipp_Woche3.Arrays.PassThrough;
import Philipp_Training.Philipp_Woche3.Arrays.Sum;
import Philipp_Training.Philipp_Woche3.Strings.CompareStrings;
import Philipp_Training.Philipp_Woche3.Strings.CountWords;
import Philipp_Training.Philipp_Woche3.Strings.StringMethods;

import javax.swing.*;
import java.util.Scanner;

public class Router {
    public static void main(String[] args) {

        while (true) {
            int inputValue = Integer.parseInt(JOptionPane.showInputDialog("""
                    Bitte wähle eine Zahl.

                    Arrays
                    1. Minimum und Maximum
                    2. Multiplikationstabelle (Bonusaufgabe)
                    3. Durchlauf
                    4. Summen

                    Strings
                    5. Vergleichen
                    6. Wörter zählen (Bonusaufgabe)
                    7. Methoden

                    Sonstiges
                    0: Beenden
                    """));

            switch (inputValue) {
                case 0:
                    return;
                case 1:
                    MinimumAndMaximum.main(null);
                    pressReturnToContinue();
                    continue;
                case 2:
                    MultiplicationTables.main(null);
                    pressReturnToContinue();
                    continue;
                case 3:
                    PassThrough.main(null);
                    pressReturnToContinue();
                    continue;
                case 4:
                    Sum.main(null);
                    pressReturnToContinue();
                    continue;
                case 5:
                    CompareStrings.main(null);
                    pressReturnToContinue();
                    continue;
                case 6:
                    CountWords.main(null);
                    pressReturnToContinue();
                    continue;
                case 7:
                    StringMethods.main(null);
                    pressReturnToContinue();
                    continue;
                default:
                    System.out.println("Unerwarteter Wert: " + inputValue);
                    pressReturnToContinue();
            }
        }
    }

    public static void pressReturnToContinue() {
        Scanner pressReturn = new Scanner(System.in);
        System.out.println("\nDrücke Return, um zum Menü zurückzukehren.");
        pressReturn.nextLine();
    }
}
