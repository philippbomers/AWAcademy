package Philipp_Woche2;

import Philipp_Woche2.Loops.ChristmasTree;
import Philipp_Woche2.Loops.GuessNumbers;
import Philipp_Woche2.Loops.Triangles;
import Philipp_Woche2.Operators.Cylinder;
import Philipp_Woche2.Operators.Metropolises;
import Philipp_Woche2.Operators.OneCodeLine;
import Philipp_Woche2.Operators.TimeUnits;

import java.util.Scanner;

public class Router {
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);

        while (true) {
            System.out.println("\n\nBitte wähle eine Zahl:" +
                    "\n__________\n" +
                    "0: Beenden" +
                    "\n__________\n" +
                    "Operatoren\n" +
                    "1. Zeiteinheiten\n" +
                    "2. Zylinder\n" +
                    "3. Eine Zeile Code\n" +
                    "4. Metropolen (Bonusaufgabe)" +
                    "\n__________\n" +
                    "Schleifen\n" +
                    "5. Zahlenraten\n" +
                    "6. Dreiecke\n" +
                    "7. Weihnachtsbaum (Bonusaufgabe)\n");

            switch (scanInput.nextInt()) {
                case 0:
                    return;
                case 1:
                    TimeUnits timeUnits = new TimeUnits();
                    timeUnits.main();
                    continue;
                case 2:
                    Cylinder cylinder = new Cylinder();
                    cylinder.main();
                    continue;
                case 3:
                    OneCodeLine oneCodeLine = new OneCodeLine();
                    oneCodeLine.main();
                    continue;
                case 4:
                    Metropolises metropolises = new Metropolises();
                    metropolises.main();
                    continue;
                case 5:
                    GuessNumbers guessNumbers = new GuessNumbers();
                    guessNumbers.main();
                    continue;
                case 6:
                    Triangles triangles = new Triangles();
                    triangles.main();
                    continue;
                case 7:
                    ChristmasTree christmastree = new ChristmasTree();
                    christmastree.main();
                    continue;
            }
        }

    }
}
