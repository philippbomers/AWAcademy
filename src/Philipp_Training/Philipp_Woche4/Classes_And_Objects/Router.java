package Philipp_Training.Philipp_Woche4.Classes_And_Objects;

import Philipp_Training.Philipp_Woche4.Classes_And_Objects.Calculator.CalculatorMain;
import Philipp_Training.Philipp_Woche4.Classes_And_Objects.ComputerShop.ComputerMain;

import javax.swing.*;
import java.util.Scanner;

public class Router {

        public static void main(String[] args) {

            while (true) {
                int inputValue = Integer.parseInt(JOptionPane.showInputDialog("""
                    Bitte wähle eine Zahl.

                    Klassen und Objekte
                    1. Taschenrechner
                    2. Computer Shop

                    Sonstiges
                    0: Beenden
                    """));

                switch (inputValue) {
                    case 0:
                        return;
                    case 1:
                        CalculatorMain.main(null);
                        pressReturnToContinue();
                        continue;
                    case 2:
                        ComputerMain.main(null);
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
