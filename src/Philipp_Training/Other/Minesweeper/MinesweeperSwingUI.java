package Philipp_Training.Other.Minesweeper;

import javax.swing.*;
import java.awt.*;

public class MinesweeperSwingUI extends MinesweeperBoard {
    private final JFrame window;
    private JButton[] buttons;
    private JLabel points;


    public MinesweeperSwingUI(int width, int bombs) {
        super(width, bombs);
        window = new JFrame("Minesweeper");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        this.getBoardGui();
    }

    public void getBoardGui() {
        this.window.add(this.setMenuBar(), BorderLayout.NORTH);
        window.add(this.setFieldsPanel(), BorderLayout.CENTER);
        window.setSize(super.getWidth() * 100, super.getWidth() * 50);
    }

    private JPanel setFieldsPanel() {
        JPanel fields = new JPanel(new GridLayout(super.getWidth(), super.getWidth()));
        buttons = new JButton[super.getWidth() * super.getWidth()];
        int fieldRow = 0;
        int fieldColumn = 0;
        int buttonNumber = 0;
        for (boolean[] row : super.getFields()) {
            for (boolean col : row) {
                fields.add(this.getFieldButton(fieldRow, fieldColumn, buttonNumber));
                fieldColumn++;
                buttonNumber++;
            }
            fieldColumn = 0;
            fieldRow++;
        }
        return fields;
    }

    private JMenuBar setMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();

        JButton restartButton = new JButton("RESTART");
        restartButton.addActionListener(e -> {
            window.dispose();
            new MinesweeperSwingUI(this.getWidth(), this.getBombs());
        });
        jMenuBar.add(restartButton);

        jMenuBar.add(Box.createRigidArea(new Dimension(50, 0)));

        jMenuBar.add(new JLabel("POINTS: "));
        this.points = new JLabel("0");
        jMenuBar.add(this.points);

        return jMenuBar;
    }

    private void setOpenAllFields() {
        int buttonNumber = 0;
        super.openAllFields();
        for (int row = 0; row < super.getWidth(); row++) {
            for (int col = 0; col < super.getWidth(); col++) {
                buttons[buttonNumber].setText(super.getSign(row, col));
                buttons[buttonNumber++].setEnabled(false);
            }
        }
    }

    private void getWinningWindow() {
        JOptionPane.showMessageDialog(window, "Du hast gewonnen!");
    }

    private void getLoosingWindow() {
        JOptionPane.showMessageDialog(window, "Du hast verloren!");
    }

    JButton getFieldButton(int row, int column, int buttonNumber) {
        this.buttons[buttonNumber] = new JButton(super.getSign(row, column));
        buttons[buttonNumber].addActionListener(e -> this.getFieldButtonAction(row, column, buttonNumber));
        if (!this.buttons[buttonNumber].getText().equals("X")) {
            this.buttons[buttonNumber].setEnabled(false);
        }
        return this.buttons[buttonNumber];
    }

    private void getFieldButtonAction(int row, int col, int buttonNumber) {
        super.setOpenFields(row, col);
        this.buttons[buttonNumber].setText(super.getSign(row, col));
        if (super.getBombFields(row, col)) {
            this.getLoosingWindow();
            this.setOpenAllFields();
        } else if (this.isCompletedFields()) {
            this.getWinningWindow();
            this.setOpenAllFields();
        } else if (this.buttons[buttonNumber].getText().matches("-?(0|[1-9]\\d*)")) {
            int userPoints = Integer.parseInt(this.points.getText()) + Integer.parseInt(this.buttons[buttonNumber].getText());
            this.points.setText(String.valueOf(userPoints));
        }
        if (!this.buttons[buttonNumber].getText().equals("X")) {
            this.buttons[buttonNumber].setEnabled(false);
        }
    }
}
