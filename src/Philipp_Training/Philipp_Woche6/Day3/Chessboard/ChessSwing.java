package Philipp_Training.Philipp_Woche6.Day3.Chessboard;

import Philipp_Training.Philipp_Woche6.Day3.Chessboard.Board.ChessBoard;
import Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece.*;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class ChessSwing extends ChessBoard {

    private final JFrame window = new JFrame("Chess");
    private final ChessBoard chessBoard = new ChessBoard();
    private final int king = 0;

    public ChessSwing() {

        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setVisible(true);

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
        JButton button;
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if (super.getField(x, y).getChessPiece() != null) {
                    button = this.createFieldButton(x, y);
                } else {
                    button = new JButton();
                }
                button.setBackground(x % 2 == 0 ^ y % 2 == 0 ? Color.WHITE : Color.LIGHT_GRAY);
                fields.add(button);
            }
        }
        return fields;
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
        JButton button = new JButton(newImageIcon);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.CENTER);
        return button;
    }

    private String getPicutresPath() {
        String path = ChessBoardMain.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        path = path.replaceFirst("/", "");
        String fullPath = Objects.requireNonNull(ChessBoardMain.class.getResource(".")).getPath().substring(1);
        return "src/" + fullPath.replaceAll(path, "") + "Pictures/";
    }

}
