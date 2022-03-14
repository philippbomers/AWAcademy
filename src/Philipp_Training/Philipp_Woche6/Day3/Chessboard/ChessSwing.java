package Philipp_Training.Philipp_Woche6.Day3.Chessboard;

import Philipp_Training.Philipp_Woche6.Day3.Chessboard.Board.ChessBoard;
import Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece.*;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Objects;

public class ChessSwing extends ChessBoard {

    private final JFrame window = new JFrame("Chess");
    private final ChessBoard chessBoard = new ChessBoard();
    private final JButton[] buttons = new JButton[64];
    private int selectedButtonNumber = -1;
    private JLabel turn;

    public ChessSwing() {

        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setVisible(true);

        this.window.add(this.generateMenuBar(), BorderLayout.NORTH);
        this.window.add(this.generateFieldButton(), BorderLayout.CENTER);
        this.window.setSize(800, 400);
    }

    /**
     * Generiert die Felder im eigenen Panel
     *
     * @return JPanel mit allen Feldern
     */
    private JPanel generateFieldButton() {
        JPanel fields = new JPanel(new GridLayout(8, 8));
        int buttonNumber = 0;
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                int finalButtonNumber = buttonNumber;
                this.buttons[buttonNumber] = super.getField(x, y).getChessPiece() != null ? this.createFieldButton(x, y) : new JButton();
                this.buttons[buttonNumber].setName(x + " " + y);
                this.buttons[buttonNumber].addActionListener(e -> this.getButtonAction(finalButtonNumber));
                this.buttons[buttonNumber].setBackground(x % 2 == 0 ^ y % 2 == 0 ? Color.WHITE : Color.LIGHT_GRAY);
                fields.add(this.buttons[buttonNumber++]);
            }
        }
        return fields;
    }

    private JMenuBar generateMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();
        JButton restartButton = new JButton("Neustart");
        restartButton.addActionListener(e -> {
            window.dispose();
            new ChessSwing();
        });
        jMenuBar.add(restartButton);
        jMenuBar.add(Box.createRigidArea(new Dimension(50, 0)));
        this.turn = new JLabel((chessBoard.isWhiteTurn() ? "Weiß" : "Schwarz") + " ist am Zug");
        this.turn.setBounds(this.turn.getX(), this.turn.getY(), 200, 50);
        jMenuBar.add(this.turn);
        return jMenuBar;
    }

    private JButton createFieldButton(int x, int y) {
        String filename = switch (super.getField(x, y).getChessPiece().getName()) {
            case Pawn.CHESS_PIECE_PAWN_NAME -> super.getField(x, y).getChessPiece().isWhite() ? "PawnWhite.png" : "PawnBlack.png";
            case Bishop.CHESS_PIECE_BISHOP_NAME -> super.getField(x, y).getChessPiece().isWhite() ? "BishopWhite.png" : "BishopBlack.png";
            case King.CHESS_PIECE_KING_NAME -> super.getField(x, y).getChessPiece().isWhite() ? "KingWhite.png" : "KingBlack.png";
            case Knight.CHESS_PIECE_KNIGHT_NAME -> super.getField(x, y).getChessPiece().isWhite() ? "KnightWhite.png" : "KnightBlack.png";
            case Queen.CHESS_PIECE_QUEEN_NAME -> super.getField(x, y).getChessPiece().isWhite() ? "QueenWhite.png" : "QueenBlack.png";
            case Rook.CHESS_PIECE_ROOK_NAME -> super.getField(x, y).getChessPiece().isWhite() ? "RookWhite.png" : "RookBlack.png";
            default -> "";
        };
        ImageIcon imageIcon = new ImageIcon(this.getPicutresPath() + filename);
        Image image = imageIcon.getImage();
        ImageIcon newImageIcon = new ImageIcon(image.getScaledInstance((int) (this.window.getWidth() * 0.3), (int) (this.window.getHeight() * 1.1), 50));
        return new JButton(newImageIcon);
    }

    private int[] getXyFromButton(int buttonNumber){
        int[] result = new int[2];
        String[] buttonData = buttons[buttonNumber].getName().split(" ");
        result[0] = Integer.parseInt(buttonData[0]);
        result[1] = Integer.parseInt(buttonData[1]);
        return result;
    }

    private int[] getXyFromButton(JButton button){
        int[] result = new int[2];
        String[] buttonData = button.getName().split(" ");
        result[0] = Integer.parseInt(buttonData[0]);
        result[1] = Integer.parseInt(buttonData[1]);
        return result;
    }

    private void getButtonAction(int newButtonNumber) {
        if (this.selectedButtonNumber == -1 && buttons[newButtonNumber].getIcon() != null) {
            this.buttons[newButtonNumber].setBackground(Color.CYAN);

            int x = getXyFromButton(newButtonNumber)[0];
            int y = getXyFromButton(newButtonNumber)[1];

            chessBoard.getFieldsOfPossibleMovements(x, y).forEach(field -> Arrays.stream(this.getButtons())
                    .filter(button -> button.getName().equals(field.getX() + " " + field.getY()))
                    .forEach(button -> button.setBackground(Color.BLUE)));
        }

        if (this.selectedButtonNumber != -1 && buttons[this.selectedButtonNumber].getIcon() != null) {
            int oldX = getXyFromButton(this.selectedButtonNumber)[0];
            int oldY = getXyFromButton(this.selectedButtonNumber)[1];

            int newX = getXyFromButton(newButtonNumber)[0];
            int newY = getXyFromButton(newButtonNumber)[1];

            this.setButtonStandardColor();

            if (chessBoard.movePieceOnBoard(oldX, oldY, newX, newY)) {
                this.buttons[newButtonNumber].setIcon(buttons[selectedButtonNumber].getIcon());
                this.buttons[selectedButtonNumber].setIcon(null);
                this.turn.setText((chessBoard.isWhiteTurn() ? "Weiß" : "Schwarz") + " ist am Zug");
            }
        }

        if (this.selectedButtonNumber == -1 && this.buttons[newButtonNumber].getIcon() != null) {
            this.selectedButtonNumber = Objects.equals(selectedButtonNumber, -1) ? newButtonNumber : -1;
        } else {
            this.selectedButtonNumber = -1;
        }

        if (chessBoard.checkWin()) {
            this.winningDialog();
            this.turn.setText((chessBoard.isWhiteTurn() ? "Schwarz" : "Weiß") + " hat gewonnen!");
        }
    }

    private void setButtonStandardColor() {
        int x;
        int y;
        Color color;

        for (JButton button : this.getButtons()) {
            x = getXyFromButton(button)[0];
            y = getXyFromButton(button)[1];
            color = x % 2 == 0 ^ y % 2 == 0 ? Color.WHITE : Color.LIGHT_GRAY;
            if (button.getBackground() != color)
                button.setBackground(color);
        }
    }

    private String getPicutresPath() {
        String path = ChessBoardMain.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        path = path.replaceFirst("/", "");
        String fullPath = Objects.requireNonNull(ChessBoardMain.class.getResource(".")).getPath().substring(1);
        return "src/" + fullPath.replaceAll(path, "") + "Pictures/";
    }

    private JButton[] getButtons() {
        return buttons;
    }

    private void winningDialog() {
        JOptionPane.showMessageDialog(window, (chessBoard.isWhiteTurn() ? "Schwarz" : "Weiß") + " hat gewonnen!");
        for (JButton button : this.getButtons()) {
            button.setEnabled(false);
        }
    }

}
