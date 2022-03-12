package Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece;

/**
 * Turm
 */
public class Rook extends ChessPiece {

    public static final String CHESS_PIECE_ROOK_NAME = "Turm";

    public Rook(boolean white, int x, int y) {
        super(white, x, y);
    }

    @Override
    public boolean canMove(int x, int y, boolean discard) {
        if (super.canMove(x, y, discard)) {
            return (this.getX() == x ^ this.getY() == y);
        }
        return false;
    }

    @Override
    public String getName() {
        return CHESS_PIECE_ROOK_NAME;
    }

}
