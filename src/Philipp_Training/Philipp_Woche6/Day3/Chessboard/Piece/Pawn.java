package Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece;

import Philipp_Training.Philipp_Woche6.Day3.Chessboard.ChessPiece;

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
            int CountFieldsOfX = Math.abs(x - this.getX());
            int CountFieldsOfY = y - this.getY();
            return ((CountFieldsOfY == -1 && !this.isWhite()) || CountFieldsOfY == 1 && this.isWhite()) && (CountFieldsOfX == 0);
        }
        return false;
    }

    @Override
    public String getName() {
        return CHESS_PIECE_PAWN_NAME;
    }

}
