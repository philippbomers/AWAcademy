package Philipp_Training.Philipp_Woche4.Classes_And_Objects.Calculator;

import javax.swing.*;

public class CalculatorGui extends JFrame {
    private JPanel mainPanel;
    private JTextField actualNumber;
    private JButton a1Button,
            a2Button,
            a3Button,
            ACButton,
            a4Button,
            a5Button,
            a6Button,
            plusButton,
            a7Button,
            a8Button,
            a9Button,
            minusButton,
            divisionButton,
            a0Button,
            MultiplyButton,
            DeleteButton;
    private JTextPane result;

    public CalculatorGui(String title) {
        super(title);
        CalculatorLogic calculatorLogic = new CalculatorLogic();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        a0Button.addActionListener(e -> actualNumber.setText(actualNumber.getText() + "0"));
        a1Button.addActionListener(e -> actualNumber.setText(actualNumber.getText() + "1"));
        a2Button.addActionListener(e -> actualNumber.setText(actualNumber.getText() + "2"));
        a3Button.addActionListener(e -> actualNumber.setText(actualNumber.getText() + "3"));
        a4Button.addActionListener(e -> actualNumber.setText(actualNumber.getText() + "4"));
        a5Button.addActionListener(e -> actualNumber.setText(actualNumber.getText() + "5"));
        a6Button.addActionListener(e -> actualNumber.setText(actualNumber.getText() + "6"));
        a7Button.addActionListener(e -> actualNumber.setText(actualNumber.getText() + "7"));
        a8Button.addActionListener(e -> actualNumber.setText(actualNumber.getText() + "8"));
        a9Button.addActionListener(e -> actualNumber.setText(actualNumber.getText() + "9"));

        ACButton.addActionListener(e -> {
            calculatorLogic.reset();
            actualNumber.setText("");
            result.setText("0");
        });

        plusButton.addActionListener(e -> {
            calculatorLogic.plus(Integer.parseInt(actualNumber.getText()));
            result.setText(calculatorLogic.getErgebnis());
            actualNumber.setText("");
        });

        minusButton.addActionListener(e -> {
            calculatorLogic.minus(Integer.parseInt(actualNumber.getText()));
            result.setText(calculatorLogic.getErgebnis());
            actualNumber.setText("");
        });


        divisionButton.addActionListener(e -> {
            calculatorLogic.geteilt(Integer.parseInt(actualNumber.getText()));
            result.setText(calculatorLogic.getErgebnis());
            actualNumber.setText("");
        });

        MultiplyButton.addActionListener(e -> {
            calculatorLogic.mal(Integer.parseInt(actualNumber.getText()));
            result.setText(calculatorLogic.getErgebnis());
            actualNumber.setText("");
        });

        DeleteButton.addActionListener(e -> actualNumber.setText(actualNumber.getText().substring(0, actualNumber.getText().length() - 1)));
    }

    public static void main(String[] args) {
        JFrame frame = new CalculatorGui("My first Java-GUI-calculator");
        frame.setVisible(true);
    }

}
