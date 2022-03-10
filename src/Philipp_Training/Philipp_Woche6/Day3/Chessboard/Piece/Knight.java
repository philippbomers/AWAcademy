package Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece;

import Philipp_Training.Philipp_Woche6.Day3.Chessboard.ChessPiece;

// Springer
public class Knight extends ChessPiece {
    public Knight(boolean white, int x, int y) {
        super(white, x, y);
    }

    @Override
    public boolean canMove(int x, int y) {
        if (super.canMove(x, y)) {
            int anzahlFelderNachX = Math.abs(x - this.getX());
            int anzahlFelderNachY = Math.abs(y - this.getY());
            return (anzahlFelderNachX == 1 && anzahlFelderNachY == 2) ||
                    (anzahlFelderNachX == 2 && anzahlFelderNachY == 1);
        }
        return false;
    }
}
