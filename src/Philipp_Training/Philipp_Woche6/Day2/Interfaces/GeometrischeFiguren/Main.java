package Philipp_Training.Philipp_Woche6.Day2.Interfaces.GeometrischeFiguren;

import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        // Lanterna wird erzeugt
        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        terminal.enterPrivateMode();

        Figur[] figuren = new Rechteck[2];
        figuren[0] = new Rechteck(new Punkt(8, 5), new Punkt(15, 10));
        figuren[1] = new Rechteck(new Punkt(2, 2), new Punkt(5, 8));
//        figuren[2] = new Kreis(new Punkt(17, 12), new Punkt(23, 16));

        StandardZeichnung standardZeichnung = new StandardZeichnung(terminal);
        standardZeichnung.zeichneFiguren(figuren);

        Thread.sleep(2000);
        terminal.clearScreen();

        VergroesserteZeichnung vergroesserteZeichnung = new VergroesserteZeichnung(terminal);
        vergroesserteZeichnung.zeichneFiguren(figuren);
    }
}
