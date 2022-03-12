package Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece;

/**
 * König
 */
public class King extends ChessPiece {

    public static final String CHESS_PIECE_KING_NAME = "Koenig";

    public King(boolean white, int x, int y) {
        super(white, x, y);
    }

    @Override
    public boolean canMove(int x, int y, boolean anotherPieceOnField) {
        if (super.canMove(x, y, anotherPieceOnField)) {
            int CountFieldsOfX = Math.abs(x - this.getX());
            int CountFieldsOfY = Math.abs(y - this.getY());
            return ((CountFieldsOfX == 1) ^ (CountFieldsOfY == 1));
        }
        return false;
    }


    @Override
    public String getName() {
        return CHESS_PIECE_KING_NAME;
    }

}
