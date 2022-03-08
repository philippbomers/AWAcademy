package Philipp_Training.Other.Minesweeper;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Erstellt eine Liste aller Spielergebnisse und zeigt diese an
 */
public class MinesweeperLeaderBoard {
    private final File leaderBoard;
    private final String path;
    int width;
    int bombs;
    int points;
    private JFrame leaderBoardWindow;

    /**
     * Erstellt eine Liste aller Spielergebnisse in einer Oberfläche
     *
     * @param width  Feldbreite
     * @param bombs  Bomben
     * @param points Punkte zu Spielende
     * @throws IOException Fehler im Dateihandling
     */
    public MinesweeperLeaderBoard(int width, int bombs, int points) throws IOException {
        this.width = width;
        this.bombs = bombs;
        this.points = points;
        this.leaderBoard = new File("src/Philipp_Training/Other/Minesweeper/leaderboard.minesweeper");
        this.path = leaderBoard.getPath();
        if (leaderBoard.length() == 0) {
            leaderBoard.createNewFile();
        }
    }

    /**
     * Erstellt ein neues Fenster
     *
     * @throws FileNotFoundException Datei nicht gefunden
     */
    public void showWindow() throws FileNotFoundException {
        this.leaderBoardWindow = new JFrame("LeaderBoard");
        this.leaderBoardWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.leaderBoardWindow.setSize(260, 400);
        this.leaderBoardWindow.setLayout(new FlowLayout());
        this.leaderBoardWindow.setVisible(true);
        this.showLeaderBoardContent();
    }

    /**
     * Generiert den Inhalt des Leaderboards
     *
     * @throws FileNotFoundException Datei nicht gefunden
     */
    private void showLeaderBoardContent() throws FileNotFoundException {
        ScrollPane scrollPane = new ScrollPane();
        JLabel leaderBoardContent = new JLabel();
        leaderBoardContent.setText("<html><body>"
                + this.getEntry() +
                "</body></html>");
        leaderBoardContent.setBounds(10, 10, 310, 800);
        scrollPane.add(leaderBoardContent);
        scrollPane.setBounds(0, 0, 220, 300);
        this.leaderBoardWindow.add(scrollPane);
        this.leaderBoardWindow.repaint();
    }

    /**
     * Inhalte der Datei auslesen
     *
     * @return Inhalt von unten nach oben gelesen
     * @throws FileNotFoundException Datei nicht gefunden
     */
    protected String getEntry() throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        Scanner readEntry = new Scanner(this.leaderBoard);
        while (readEntry.hasNextLine()) {
            content.insert(0, readEntry.nextLine());
        }
        readEntry.close();
        return content.toString();
    }

    /**
     * Füge einen neuen Eintrag in die Datei ein
     *
     * @param string neuer Eintrag
     * @throws IOException Fehler im Dateihandling
     */
    protected void setEntry(String string) throws IOException {
        if (string == null) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
            String date = dtf.format(LocalDateTime.now());
            string = "<br>" + date + "<br>Felder: " + (width * width) + ", Bomben: " + bombs + ", Punkte: " + points;
        }
        FileWriter writeEntry = new FileWriter(this.path, true);
        writeEntry.write(System.lineSeparator());
        writeEntry.write("<br>" + string);
        writeEntry.close();
    }
}
