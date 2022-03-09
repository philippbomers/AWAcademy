package Philipp_Training.Philipp_Woche6.Day2.Interfaces.GeometrischeFiguren;

import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class StandardZeichnung implements Zeichnung {

    private final Terminal terminal;

    public StandardZeichnung(Terminal terminal) {
        this.terminal = terminal;
    }


    public void zeichneFiguren(Figur[] figuren) throws IOException {

        for (Figur figur : figuren) {

            for (Punkt punkt : figur.zeichne()) {

                terminal.setCursorPosition(punkt.x, punkt.y);
                terminal.putCharacter('o');
            }
        }
        terminal.flush();
    }
}
