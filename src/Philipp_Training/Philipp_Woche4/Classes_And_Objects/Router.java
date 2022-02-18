package Philipp_Training.Philipp_Woche4.Classes_And_Objects;

import Philipp_Training.Philipp_Woche3.Arrays.MinimumAndMaximum;
import Philipp_Training.Philipp_Woche3.Arrays.MultiplicationTables;
import Philipp_Training.Philipp_Woche3.Arrays.PassThrough;
import Philipp_Training.Philipp_Woche3.Arrays.Sum;
import Philipp_Training.Philipp_Woche3.Strings.CompareStrings;
import Philipp_Training.Philipp_Woche3.Strings.CountWords;
import Philipp_Training.Philipp_Woche3.Strings.StringMethods;

import Philipp_Training.Philipp_Woche4.Classes_And_Objects.Calculator.*;
import Philipp_Training.Philipp_Woche4.Classes_And_Objects.ComputerShop.*;
import Philipp_Training.Philipp_Woche4.Classes_And_Objects.ComputerShop.Main;

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
                        Philipp_Training.Philipp_Woche4.Classes_And_Objects.Calculator.Main.main(null);
                        pressReturnToContinue();
                        continue;
                    case 2:
                        Main.main(null);
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
