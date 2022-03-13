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
    public boolean canMove(int x, int y, boolean anotherPieceOnField) {
        if (super.canMove(x, y, false)) {
            return ((this.isFirstStep() && x == getX() && !anotherPieceOnField &&
                    (// First Step condition
                            y == this.getY() + (isWhite() ? 1 : -1) ^
                                    y == this.getY() + (isWhite() ? 2 : -2)

                    )) ||
                    (// anotherPieceOnField condition
                            anotherPieceOnField && (
                                    this.getX() + 1 == x ||
                                            this.getX() - 1 == x) && (
                                    y == this.getY() + (isWhite() ? 1 : -1))
                    ) ||
                    (// Standard condition
                            y == this.getY() + (isWhite() ? 1 : -1) &&
                                    x == getX() && !anotherPieceOnField
                    ));
        }
        return false;
    }

    @Override
    public String getName() {
        return CHESS_PIECE_PAWN_NAME;
    }
}
