package Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece;

import Philipp_Training.Philipp_Woche6.Day3.Chessboard.ChessPiece;

// Läufer
public class Bishop extends ChessPiece {
    public Bishop(boolean white, int x, int y) {
        super(white, x, y);
    }

    @Override
    public boolean canMove(int x, int y) {
        if (super.canMove(x, y)) {
            int anzahlFelderNachX = Math.abs(x - this.getX());
            int anzahlFelderNachY = Math.abs(y - this.getY());
            return anzahlFelderNachX == anzahlFelderNachY;
        }
        return false;
    }
}
