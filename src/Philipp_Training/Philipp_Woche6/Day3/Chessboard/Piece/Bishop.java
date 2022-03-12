package Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece;

/**
 * Läufer
 */
public class Bishop extends ChessPiece {

    public static final String CHESS_PIECE_BISHOP_NAME = "Laeufer";

    public Bishop(boolean white, int x, int y) {
        super(white, x, y);
    }

    @Override
    public boolean canMove(int x, int y, boolean discard) {
        if (super.canMove(x, y, discard)) {
            int CountFieldsOfX = Math.abs(x - this.getX());
            int CountFieldsOfY = Math.abs(y - this.getY());
            return CountFieldsOfX == CountFieldsOfY;
        }
        return false;
    }

    @Override
    public String getName() {
        return CHESS_PIECE_BISHOP_NAME;
    }
}
