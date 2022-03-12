package Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece;

/**
 * Springer
 */
public class Knight extends ChessPiece {

    public static final String CHESS_PIECE_KNIGHT_NAME = "Springer";

    public Knight(boolean white, int x, int y) {
        super(white, x, y);
    }

    @Override
    public boolean canMove(int x, int y, boolean discard) {
        if (super.canMove(x, y, discard)) {
            int CountFieldsOfX = Math.abs(x - this.getX());
            int CountFieldsOfY = Math.abs(y - this.getY());
            return (CountFieldsOfX == 1 && CountFieldsOfY == 2) ||
                    (CountFieldsOfX == 2 && CountFieldsOfY == 1);
        }
        return false;
    }

    @Override
    public String getName() {
        return CHESS_PIECE_KNIGHT_NAME;
    }

}
