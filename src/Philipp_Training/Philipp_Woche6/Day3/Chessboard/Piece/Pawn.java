package Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece;

/**
 * Bauer
 */
public class Pawn extends ChessPiece {

    public static final String CHESS_PIECE_PAWN_NAME = "Bauer";

    public Pawn(boolean white, int x, int y) {
        super(white, x, y);
    }

    @Override
    public boolean canMove(int x, int y) {
        if (super.canMove(x, y)) {
            int CountFieldsOfY = y - this.getY();
            if (this.isFirstStep()) {
                return (((CountFieldsOfY == -1 && !this.isWhite()) ||
                        (CountFieldsOfY == -2 && !this.isWhite())) ||
                        ((CountFieldsOfY == 1 && this.isWhite()) ||
                                (CountFieldsOfY == 2 && this.isWhite()))) &&
                        (x == this.getX());
            } else {
                return (((CountFieldsOfY == -1 && !this.isWhite()) ||
                        (CountFieldsOfY == 1 && this.isWhite())) &&
                        (x == this.getX()));
            }
        }
        return false;
    }

    @Override
    public String getName() {
        return CHESS_PIECE_PAWN_NAME;
    }
}
