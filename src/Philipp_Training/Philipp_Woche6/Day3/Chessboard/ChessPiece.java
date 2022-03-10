package Philipp_Training.Philipp_Woche6.Day3.Chessboard;

public abstract class ChessPiece {
    final private boolean white;
    private int x;
    private int y;

    public abstract String getName();

    public ChessPiece(boolean white, int x, int y) {
        this.white = white;
        this.x = x;
        this.y = y;
    }

    public boolean canMove(int x, int y) {
        // Ist die Figur auf dem Schachbrett?
        return x >= 0 && x < 8 && y >= 0 && y < 8 && !moveToSameField(x, y);
    }

    private boolean moveToSameField(int x, int y) {
        return x == this.x && y == this.y;
    }

    public boolean move(int x, int y) {
        // Wenn die Figur sich bewegen kann, setze sie auf X, Y
        if (canMove(x, y)) {
            this.x = x;
            this.y = y;
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
}
