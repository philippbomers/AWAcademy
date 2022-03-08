package Philipp_Training.Other.Minesweeper;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Grafische Oberfläche für Minesweeper
 */
public class MinesweeperSwingUI extends MinesweeperBoard {
    private final JFrame window;
    private JButton[] buttons;
    private JLabel points;

    /**
     * Erstellt das Fenster mit allen Elementen
     *
     * @param width Breite (in Anzahl der Felder)
     * @param bombs Anzahl der Bomben
     */
    public MinesweeperSwingUI(int width, int bombs) {
        super(width, bombs);
        window = new JFrame("Minesweeper");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        this.window.add(this.generateMenuBar(), BorderLayout.NORTH);
        window.add(this.generateFieldButton(), BorderLayout.CENTER);
        window.setSize(super.getWidth() * 100, super.getWidth() * 50);
    }

    /**
     * Generiert die Felder im eigenen Panel
     *
     * @return JPanel mit allen Feldern
     */
    private JPanel generateFieldButton() {
        JPanel fields = new JPanel(new GridLayout(super.getWidth(), super.getWidth()));
        buttons = new JButton[super.getWidth() * super.getWidth()];
        int fieldRow = 0;
        int fieldColumn = 0;
        int buttonNumber = 0;
        for (boolean[] row : super.getFields()) {
            for (boolean ignored : row) {
                fields.add(this.getFieldButton(fieldRow, fieldColumn, buttonNumber));
                fieldColumn++;
                buttonNumber++;
            }
            fieldColumn = 0;
            fieldRow++;
        }
        return fields;
    }

    /**
     * Generiert den Header mit Restart und Punkten
     *
     * @return JMenuBar obere Leiste
     */
    private JMenuBar generateMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();

        JButton restartButton = new JButton("RESTART");
        restartButton.addActionListener(e -> {
            window.dispose();
            new MinesweeperConfigDialog();
        });
        jMenuBar.add(restartButton);

        jMenuBar.add(Box.createRigidArea(new Dimension(50, 0)));

        jMenuBar.add(new JLabel("POINTS: "));
        this.points = new JLabel("0");
        jMenuBar.add(this.points);

        jMenuBar.add(Box.createRigidArea(new Dimension(50, 0)));

        JButton leaderBoardButton = new JButton("LEADERBOARD");
        leaderBoardButton.addActionListener(e -> {
            try {
                MinesweeperLeaderBoard minesweeperLeaderBoard = new MinesweeperLeaderBoard(this.getWidth(), this.getBombs(), Integer.parseInt(this.points.getText()));
                minesweeperLeaderBoard.showWindow();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(window, ex);
            }
        });
        jMenuBar.add(leaderBoardButton);

        return jMenuBar;
    }

    /**
     * Öffnet und deaktiviert alle Felder
     */
    private void openAllFieldButtons() {
        int buttonNumber = 0;
        for (int row = 0; row < super.getWidth(); row++) {
            for (int col = 0; col < super.getWidth(); col++) {
                if (this.isFlaggedField(row, col) && this.isBombField(row, col)) {
                    this.points.setText(String.valueOf(Integer.parseInt(this.points.getText()) + 1));
                }
                buttons[buttonNumber].setText(super.getSign(row, col));
                buttons[buttonNumber++].setEnabled(false);
            }
        }
        buttonNumber = 0;
        super.openAllFields();
        for (int row = 0; row < super.getWidth(); row++) {
            for (int col = 0; col < super.getWidth(); col++) {
                buttons[buttonNumber].setText(super.getSign(row, col));
                buttons[buttonNumber++].setEnabled(false);
            }
        }
    }

    /**
     * Zeigt ein Gewinn-Fenster an
     */
    private void showWinningWindow() {
        JOptionPane.showMessageDialog(window, "Das Spiel ist vorbei. Du hast " + this.points.getText() + " Punkte erreicht");
        try {
            MinesweeperLeaderBoard minesweeperLeaderBoard = new MinesweeperLeaderBoard(this.getWidth(), this.getBombs(), Integer.parseInt(this.points.getText()));
            minesweeperLeaderBoard.setEntry(null);
            minesweeperLeaderBoard.showWindow();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(window, e);
        }
    }

    /**
     * Zeigt ein Verloren-Fenster an
     */
    private void getLoosingWindow() {
        JOptionPane.showMessageDialog(window, "Du hast verloren!");
    }

    /**
     * Erstellt einen Feld-Button mit Funktionalität
     *
     * @param row          Reihe
     * @param column       Spalte
     * @param buttonNumber Name des Buttons
     * @return Feld-Button
     */
    private JButton getFieldButton(int row, int column, int buttonNumber) {
        this.buttons[buttonNumber] = new JButton(super.getSign(row, column));
        buttons[buttonNumber].addActionListener(e -> this.getFieldButtonAction(row, column, buttonNumber));
        if (!this.buttons[buttonNumber].getText().equals("X")) {
            this.buttons[buttonNumber].setEnabled(false);
        }
        return this.buttons[buttonNumber];
    }

    /**
     * Erstellt die Aktion nach Klick auf einem Feld
     *
     * @param row          Reihe
     * @param col          Spalte
     * @param buttonNumber Button-Name
     */
    private void getFieldButtonAction(int row, int col, int buttonNumber) {
        if (this.isFlaggedField(row, col)) {
            super.setOpenField(row, col);
            this.buttons[buttonNumber].setText(super.getSign(row, col));
            if (super.isBombField(row, col)) {
                this.getLoosingWindow();
                this.openAllFieldButtons();
            } else if (this.buttons[buttonNumber].getText().matches("-?(0|[1-9]\\d*)")) {
                int userPoints = Integer.parseInt(this.points.getText()) + Integer.parseInt(this.buttons[buttonNumber].getText());
                this.points.setText(String.valueOf(userPoints));
            }
            if (!this.buttons[buttonNumber].getText().equals("X")) {
                this.buttons[buttonNumber].setEnabled(false);
            }
        } else {
            this.setFlaggedField(row, col);
            this.buttons[buttonNumber].setText(super.getSign(row, col));
        }
        if (this.isCompletedFields()) {
            this.openAllFieldButtons();
            this.showWinningWindow();
        }
    }
}
