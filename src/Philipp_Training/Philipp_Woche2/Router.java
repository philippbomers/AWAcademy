/**
 * Choose a number to start a java class with the tasks solution
 */

package Philipp_Training.Philipp_Woche2;

import Philipp_Training.Philipp_Woche2.Loops.ChristmasTree;
import Philipp_Training.Philipp_Woche2.Loops.GuessNumbers;
import Philipp_Training.Philipp_Woche2.Loops.Triangles;
import Philipp_Training.Philipp_Woche2.Operators.Cylinder;
import Philipp_Training.Philipp_Woche2.Operators.Metropolises;
import Philipp_Training.Philipp_Woche2.Operators.OneCodeLine;
import Philipp_Training.Philipp_Woche2.Operators.TimeUnits;

import javax.swing.*;
import java.util.Scanner;

public class Router {
    public static void main(String[] args) {

        while (true) {
            int inputValue = Integer.parseInt(JOptionPane.showInputDialog("""


                    Bitte wähle eine Zahl.

                    Operatoren
                    1. Zeiteinheiten
                    2. Zylinder
                    3. Eine Zeile Code
                    4. Metropolen (Bonusaufgabe)

                    Schleifen
                    5. Zahlenraten
                    6. Dreiecke
                    7. Weihnachtsbaum (Bonusaufgabe)

                    Sonstiges
                    0: Beenden"""));

            switch (inputValue) {
                case 0:
                    return;
                case 1:
                    TimeUnits.main(null);
                    pressReturnToContinue();
                    continue;
                case 2:
                    Cylinder.main(null);
                    pressReturnToContinue();
                    continue;
                case 3:
                    OneCodeLine.main(null);
                    pressReturnToContinue();
                    continue;
                case 4:
                    Metropolises.main(null);
                    pressReturnToContinue();
                    continue;
                case 5:
                    GuessNumbers.main(null);
                    pressReturnToContinue();
                    continue;
                case 6:
                    Triangles.main(null);
                    pressReturnToContinue();
                    continue;
                case 7:
                    ChristmasTree.main(null);
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
