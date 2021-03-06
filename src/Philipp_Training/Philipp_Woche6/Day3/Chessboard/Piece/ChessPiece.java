package Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece;

public abstract class ChessPiece {
    final private boolean white;
    int x;
    int y;
    private boolean firstStep = true;

    public ChessPiece(boolean white, int x, int y) {
        this.white = white;
        this.x = x;
        this.y = y;
    }

    public abstract String getName();

    public boolean canMove(int x, int y, boolean anotherPieceOnField) {
        // Ist die Figur auf dem Schachbrett?
        return x >= 0 && x < 8 && y >= 0 && y < 8 && !moveToSameField(x, y);
    }

    private boolean moveToSameField(int x, int y) {
        return x == this.x && y == this.y;
    }

    public boolean move(int x, int y, boolean anotherPieceOnField) {
        // Wenn die Figur sich bewegen kann, setze sie auf X, Y
        if (this.canMove(x, y, anotherPieceOnField)) {
            this.x = x;
            this.y = y;
            if (this.firstStep) {
                this.firstStep = false;
            }
            return true;
        }
        return false;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean isWhite() {
        return this.white;
    }

    public boolean isFirstStep() {
        return this.firstStep;
    }

    public void setFirstStep(boolean firstStep) {
        this.firstStep = firstStep;
    }
}
