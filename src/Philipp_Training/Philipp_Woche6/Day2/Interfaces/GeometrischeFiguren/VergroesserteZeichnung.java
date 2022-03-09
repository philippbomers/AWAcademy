package Philipp_Training.Philipp_Woche6.Day2.Interfaces.GeometrischeFiguren;

import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class VergroesserteZeichnung implements Zeichnung {

    private final Terminal terminal;

    public VergroesserteZeichnung(Terminal terminal) {
        this.terminal = terminal;
    }

    public void zeichneFiguren(Figur[] figuren) throws IOException {
        for (Figur figur : figuren) {
            Punkt[] punkte = figur.zeichne();

            for (Punkt punkt : punkte) {
                // Doppelte Größe zeichnen
                int x = punkt.x * 2;
                int y = punkt.y * 2;

                terminal.setCursorPosition(x, y);
                terminal.putCharacter('O');
                terminal.setCursorPosition(x + 1, y);
                terminal.putCharacter('O');
                terminal.setCursorPosition(x, y + 1);
                terminal.putCharacter('O');
                terminal.setCursorPosition(x + 1, y + 1);
                terminal.putCharacter('O');
            }
        }
        terminal.flush();

    }
}
