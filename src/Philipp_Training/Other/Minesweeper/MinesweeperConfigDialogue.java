package Philipp_Training.Other.Minesweeper;

import javax.swing.*;

/**
 * Oberfläche zum Einstellen der Anzahl von Feldern und Bomben
 */
public class MinesweeperConfigDialogue {
    final private JFrame configWindow;

    /**
     * Erstellt ein neues Fenster
     */
    public MinesweeperConfigDialogue() {
        this.configWindow = new JFrame("Configuration");
        this.configWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.configWindow.setSize(260, 400);
        this.configWindow.setLayout(null);
        this.configWindow.setVisible(true);
        this.addWidthDialogue();
    }

    /**
     * Generiert den Inhalt des Fensters
     * mit Abfrage von Feldgröße und Anzahl der Bomben
     */
    private void addWidthDialogue() {
        JLabel widthLabel = new JLabel();
        widthLabel.setText("How many fields should be in a row?");
        widthLabel.setBounds(10, 10, 300, 20);
        this.configWindow.add(widthLabel);

        JTextField inputWidth = new JTextField("5");
        inputWidth.setBounds(20, 40, 180, 20);
        this.configWindow.add(inputWidth);

        JLabel bombLabel = new JLabel();
        bombLabel.setText("How many bombs should be on the field?");
        bombLabel.setBounds(10, 70, 310, 20);
        this.configWindow.add(bombLabel);

        JTextField inputBomb = new JTextField("8");
        inputBomb.setBounds(20, 100, 180, 20);
        this.configWindow.add(inputBomb);

        JButton submitButton = new JButton("SUBMIT");
        submitButton.setBounds(80, 140, 120, 20);
        submitButton.addActionListener(e -> getSubmitButtonAction(inputWidth.getText(), inputBomb.getText()));
        this.configWindow.add(submitButton);

        JLabel rulesLabel = new JLabel();
        rulesLabel.setText("<html><body>" +
                "Points:<br>" +
                "1 point for a marked bomb.<br>" +
                "0-8 points for the number of bombs<br>" +
                "around an opened field.<br><br>" +
                "You loose when you hit a bomb.<br><br>" +
                "The game is over when you opened<br>" +
                "or marked every field that don't<br>" +
                "include a bomb." +
                "</body></html>");
        rulesLabel.setBounds(10, 150, 310, 200);
        this.configWindow.add(rulesLabel);

        this.configWindow.repaint();
    }

    /**
     * Weist dem Submit-Button Aktionen zu:
     * 1. Überprüfung der Eingaben
     * 2. Schließen dieses Fensters und öffnen des Spielfensters
     *
     * @param inputWidth Eingabe des ersten Inputs (Breite)
     * @param inputBomb  Eingabe des zweiten Inputs (Bombenanzahl)
     */
    private void getSubmitButtonAction(String inputWidth, String inputBomb) {
        if (isInteger(inputWidth, 4, 40) && isInteger(inputBomb, 0, 1599)) {
            int width = Integer.parseInt(inputWidth);
            int bombs = Integer.parseInt(inputBomb);
            if (bombs < (width * width)) {
                this.configWindow.dispose();
                new MinesweeperSwingUI(Integer.parseInt(inputWidth), Integer.parseInt(inputBomb));
            } else {
                JOptionPane.showMessageDialog(this.configWindow, "Bitte gib weniger Bomben an.");
            }
        } else {
            JOptionPane.showMessageDialog(this.configWindow, "Deine Eingabe ist ungültig.");
        }
    }

    /**
     * Prüft, ob die Eingabe eine Zahl ist
     *
     * @param input Eingabe des Textfeldes
     * @param min   Minimaler Soll-Wert
     * @param max   Maximaler Soll-Wert
     * @return Ist die Eingabe eine passende Zahl? (true, false)
     */
    private boolean isInteger(String input, int min, int max) {
        if (input.matches("-?(0|[1-9]\\d*)")) {
            int value = Integer.parseInt(input);
            return (value >= min && value <= max);
        }
        return false;
    }
}
