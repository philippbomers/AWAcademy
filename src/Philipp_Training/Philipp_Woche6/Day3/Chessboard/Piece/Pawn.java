package Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece;

/**
 * Bauer
 */
public class Pawn extends ChessPiece {

    public static final String CHESS_PIECE_PAWN_NAME = "Bauer";

    public Pawn(boolean white, int x, int y) {
        super(white, x, y);
    }


    /*

TODO WORK HERE: does not work (Schräg abwerfen klappt nicht)

 */
    @Override
    public boolean canMove(int x, int y, boolean discard) {
        if (super.canMove(x, y, false)) {
            return ((this.isFirstStep() &&
                    y == this.getY() + (isWhite() ? 2 : -2) ||          // First Step condition
                    y == this.getY() + (isWhite() ? 1 : -1))

                    ||

                    (discard &&
                            (this.getX() == x ||                                // Abwurf condition
                                    this.getX() + 1 == x ||
                                    this.getX() - 1 == x) &&
                            y == this.getY() + (isWhite() ? 1 : -1))

                    ||
                    (y == this.getY() + (isWhite() ? 1 : -1) && x == getX()));  // Standard condition
        }
        return false;
    }

    @Override
    public boolean move(int x, int y, boolean discard) {
        // Wenn die Figur sich bewegen kann, setze sie auf X, Y
        if (this.canMove(x, y, discard)) {
            this.x = x;
            this.y = y;
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return CHESS_PIECE_PAWN_NAME;
    }
}
