package Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece;

/**
 * Königin
 */
public class Queen extends ChessPiece {

    public static final String CHESS_PIECE_QUEEN_NAME = "Koenigin";

    public Queen(boolean white, int x, int y) {
        super(white, x, y);
    }

    @Override
    public boolean canMove(int x, int y) {
        if (super.canMove(x, y)) {
            int CountFieldsOfX = Math.abs(x - this.getX());
            int CountFieldsOfY = Math.abs(y - this.getY());
            return ((CountFieldsOfX == CountFieldsOfY) || (this.getX() == x ^ this.getY() == y));
        }
        return false;
    }

    @Override
    public String getName() {
        return CHESS_PIECE_QUEEN_NAME;
    }

}
