/**
 * Choose a number to start a java class with the tasks solution
 */

package Philipp_Woche2;

import Philipp_Woche2.Loops.ChristmasTree;
import Philipp_Woche2.Loops.GuessNumbers;
import Philipp_Woche2.Loops.Triangles;
import Philipp_Woche2.Operators.Cylinder;
import Philipp_Woche2.Operators.Metropolises;
import Philipp_Woche2.Operators.OneCodeLine;
import Philipp_Woche2.Operators.TimeUnits;

import javax.swing.*;

public class Router {
    public static void main(String[] args) {

        while (true) {
            int inputValue = Integer.parseInt(JOptionPane.showInputDialog("\n\nBitte wähle eine Zahl:" +
                    "\n\n" +
                    "Operatoren\n" +
                    "1. Zeiteinheiten\n" +
                    "2. Zylinder\n" +
                    "3. Eine Zeile Code\n" +
                    "4. Metropolen (Bonusaufgabe)" +
                    "\n\n" +
                    "Schleifen\n" +
                    "5. Zahlenraten\n" +
                    "6. Dreiecke\n" +
                    "7. Weihnachtsbaum (Bonusaufgabe)" +
                    "\n\n" +
                    "Sonstiges\n" +
                    "0: Beenden"));

            switch (inputValue) {
                case 0:
                    return;
                case 1:
                    TimeUnits.main();
                    continue;
                case 2:
                    Cylinder.main();
                    continue;
                case 3:
                    OneCodeLine.main();
                    continue;
                case 4:
                    Metropolises.main();
                    continue;
                case 5:
                    GuessNumbers.main();
                    continue;
                case 6:
                    Triangles.main();
                    continue;
                case 7:
                    ChristmasTree.main();
            }
        }

    }
}
