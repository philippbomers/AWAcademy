package Philipp_Training.Philipp_Woche4.Classes_And_Objects.Calculator;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new CalculatorGui("My first Java-GUI-calculator");
        frame.setVisible(true);

        /*
           Sourcecode der gestellten Aufgabe (Logik-Klasse bleibt die Gleiche):

                  CalculatorLogic meinRechner = new CalculatorLogic();
                  meinRechner.plus(8);
                  meinRechner.mal(2);
                  meinRechner.geteilt(4);
                  System.out.println(meinRechner.getErgebnis());
         */
    }
}
