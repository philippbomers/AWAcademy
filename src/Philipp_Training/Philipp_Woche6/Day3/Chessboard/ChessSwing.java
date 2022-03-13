package Philipp_Training.Philipp_Woche6.Day3.Chessboard;

import Philipp_Training.Philipp_Woche6.Day3.Chessboard.Board.ChessBoard;
import Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece.*;

import javax.swing.*;
import java.awt.*;
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
                if (super.getField(x, y).getChessPiece() != null) {
                    this.buttons[buttonNumber] = this.createFieldButton(x, y);
                } else {
                    this.buttons[buttonNumber] = new JButton();
                }
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
        this.turn = new JLabel(chessBoard.isWhiteTurn() ? "Weiß" : "Schwarz");
        turn.setBounds(this.turn.getX(), this.turn.getY(), 200, 50);
        jMenuBar.add(this.turn);
        jMenuBar.add(new JLabel(" ist am Zug"));
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

    private void getButtonAction(int newButtonNumber) {

        if(buttons[newButtonNumber].getIcon() != null){
            this.buttons[newButtonNumber].setBackground(Color.CYAN);
        }

        if (this.selectedButtonNumber != -1 && this.buttons[newButtonNumber] != null && buttons[this.selectedButtonNumber].getIcon() != null) {
            String[] xyOld = this.buttons[this.selectedButtonNumber].getName().split(" ");
            int oldX = Integer.parseInt(xyOld[0]);
            int oldY = Integer.parseInt(xyOld[1]);

            String[] xyNew = this.buttons[newButtonNumber].getName().split(" ");
            int newX = Integer.parseInt(xyNew[0]);
            int newY = Integer.parseInt(xyNew[1]);

            this.buttons[selectedButtonNumber].setBackground(oldX % 2 == 0 ^ oldY % 2 == 0 ? Color.WHITE : Color.LIGHT_GRAY);
            this.buttons[newButtonNumber].setBackground(newX % 2 == 0 ^ newY % 2 == 0 ? Color.WHITE : Color.LIGHT_GRAY);

            if (chessBoard.movePieceOnBoard(oldX, oldY, newX, newY)) {
                this.buttons[newButtonNumber].setIcon(buttons[selectedButtonNumber].getIcon());
                this.buttons[selectedButtonNumber].setIcon(null);
                this.turn.setText(chessBoard.isWhiteTurn() ? "Weiß" : "Schwarz");
            }
        }

        this.selectedButtonNumber = Objects.equals(selectedButtonNumber, -1) ? newButtonNumber : -1;
    }

    private String getPicutresPath() {
        String path = ChessBoardMain.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        path = path.replaceFirst("/", "");
        String fullPath = Objects.requireNonNull(ChessBoardMain.class.getResource(".")).getPath().substring(1);
        return "src/" + fullPath.replaceAll(path, "") + "Pictures/";
    }

}
