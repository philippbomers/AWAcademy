package Philipp_Training.Philipp_Woche6.Day3.Chessboard.Board.Piece;

import Philipp_Training.Philipp_Woche6.Day3.Chessboard.Board.ChessPiece;

/**
 * Bauer
 */
public class Pawn extends ChessPiece {

    public static final String CHESS_PIECE_PAWN_NAME = "Pawn";

    public Pawn(boolean white, int x, int y) {
        super(white, x, y);
    }

    @Override
    public boolean canMove(int x, int y) {
        if (super.canMove(x, y)) {
            int CountFieldsOfX = Math.abs(x - this.getX());
            int CountFieldsOfY = Math.abs(y - this.getY());
            return (CountFieldsOfX == 0) && (CountFieldsOfY == 1);
        }
        return false;
    }

    @Override
    public String getName() {
        return CHESS_PIECE_PAWN_NAME;
    }

}
