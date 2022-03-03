package Philipp_Training.Other.JavaTranslator;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InputForm extends JFrame{
    private JPanel mainPanel;
    private JTextArea germanInput;
    private JTextPane javaOutput;

    public InputForm(String title) {

        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        germanInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);

                sourceCode sourceCode = new sourceCode(germanInput.getText());
                javaOutput.setText(sourceCode.toString());
            }
        });
    }
}
