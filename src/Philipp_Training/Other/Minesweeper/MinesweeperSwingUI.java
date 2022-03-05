package Philipp_Training.Other.Minesweeper;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class MinesweeperSwingUI extends MinesweeperBoard {
    private final JFrame window;
    private JButton[] buttons;


    public MinesweeperSwingUI(int width, int bombs) {
        super(width, bombs);

        window = new JFrame("Minesweeper");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        this.getBoardGui();
    }

    public void getBoardGui() {

        JPanel fields = new JPanel(new GridLayout(super.getWidth(), super.getHeight()));
        buttons = new JButton[super.getWidth() * super.getHeight()];

        int fieldRow = 0;
        int fieldColumn = 0;
        int buttonNumber = 0;
        for (boolean[] row : super.getFields()) {
            for (boolean col : row) {
                buttons[buttonNumber] = new JButton("X");
                buttons[buttonNumber].setActionCommand("X");
                buttons[buttonNumber].setSize(1, 1);
                int finalFieldRow = fieldRow;
                int finalFieldColumn = fieldColumn;
                int finalButtonNumber = buttonNumber;
                buttons[buttonNumber].addActionListener(e -> {
                    super.setOpenFields(finalFieldRow, finalFieldColumn);
                    buttons[finalButtonNumber].setText(super.getSign(finalFieldRow, finalFieldColumn));
                    if (super.getBombFields(finalFieldRow, finalFieldColumn)) {
                        this.getLoosingWindow();
                        this.setOpenAllFields();
                    } else if (this.isCompletedFields()) {
                        this.getWinningWindow();
                        this.setOpenAllFields();
                    }
                });
                fields.add(buttons[buttonNumber++]);
                fieldColumn++;
            }
            fieldColumn = 0;
            fieldRow++;
        }

        window.add(fields, BorderLayout.CENTER);
        fields.setVisible(true);
        window.setSize(super.getWidth() * 100, super.getHeight() * 50);
    }

    private void setOpenAllFields() {
        int fieldRow = 0;
        int fieldColumn = 0;
        int buttonNumber = 0;
        for (boolean[] row : super.getFields()) {
            for (boolean col : row) {
                buttons[buttonNumber].setText(super.getSign(fieldRow, fieldColumn));
                fieldRow++;
                buttonNumber++;
            }
            fieldRow = 0;
            fieldColumn++;
        }
    }

    public void getWinningWindow() {
        JOptionPane.showMessageDialog(window, "Du hast gewonnen!");
    }

    public void getLoosingWindow() {
        JOptionPane.showMessageDialog(window, "Du hast verloren!");
    }
}
