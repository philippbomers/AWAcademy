package Philipp_Training.Other.Minesweeper;

import javax.swing.*;

public class MinesweeperConfigDialogue {
    final private JFrame configWindow;

    public MinesweeperConfigDialogue() {
        this.configWindow = new JFrame("Configuration");
        this.configWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.configWindow.setSize(250, 210);
        this.configWindow.setLayout(null);
        this.configWindow.setVisible(true);
        this.addWidthDialogue();
    }

    private void addWidthDialogue() {
        JLabel widthLabel = new JLabel();
        widthLabel.setText("How many fields should be in a row?");
        widthLabel.setBounds(10, 10, 300, 20);
        this.configWindow.add(widthLabel);

        JTextField inputWidth = new JTextField("5");
        inputWidth.setBounds(20, 40, 180, 20);
        this.configWindow.add(inputWidth);

        JLabel bombLabel = new JLabel();
        bombLabel.setText("How many fields should be in a row?");
        bombLabel.setBounds(10, 70, 300, 20);
        this.configWindow.add(bombLabel);

        JTextField inputBomb = new JTextField("8");
        inputBomb.setBounds(20, 100, 180, 20);
        this.configWindow.add(inputBomb);

        JButton submitButton = new JButton("SUBMIT");
        submitButton.setBounds(80, 140, 120, 20);
        submitButton.addActionListener(e -> getSubmitButtonAction(inputWidth.getText(), inputBomb.getText()));
        this.configWindow.add(submitButton);

        this.configWindow.repaint();
    }

    private void getSubmitButtonAction(String inputWidth, String inputBomb) {
        if (isInteger(inputWidth, 4, 100) && isInteger(inputBomb, 0, 99)) {
            int width = Integer.parseInt(inputWidth);
            int bombs = Integer.parseInt(inputBomb);
            if (bombs < width * width) {
                this.configWindow.dispose();
                new MinesweeperSwingUI(Integer.parseInt(inputWidth), Integer.parseInt(inputBomb));
            } else {
                JOptionPane.showMessageDialog(this.configWindow, "Bitte gib weniger Bomben an.");
            }
        } else {
            JOptionPane.showMessageDialog(this.configWindow, "Deine Eingabe ist ungültig.");
        }
    }

    private boolean isInteger(String input, int min, int max) {
        if (input.matches("-?(0|[1-9]\\d*)")) {
            int value = Integer.parseInt(input);
            return (value >= min && value <= max);
        }
        return false;
    }
}
