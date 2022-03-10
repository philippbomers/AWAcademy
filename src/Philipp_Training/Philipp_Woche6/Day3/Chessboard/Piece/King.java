package Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece;

import Philipp_Training.Philipp_Woche6.Day3.Chessboard.ChessPiece;

/**
 * König
 */
public class King extends ChessPiece {

    public static final String CHESS_PIECE_KING_NAME = "King";

    public King(boolean white, int x, int y) {
        super(white, x, y);
    }

    @Override
    public boolean canMove(int x, int y) {
        if (super.canMove(x, y)) {
            int anzahlFelderNachX = Math.abs(x - this.getX());
            int anzahlFelderNachY = Math.abs(y - this.getY());
            return (anzahlFelderNachX == 1) || (anzahlFelderNachY == 1);
        }
        return false;
    }


    @Override
    public String getName() {
        return CHESS_PIECE_KING_NAME;
    }

}
