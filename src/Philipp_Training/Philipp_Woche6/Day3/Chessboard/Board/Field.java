package Philipp_Training.Philipp_Woche6.Day3.Chessboard.Board;

public class Field {
    final private int x;
    final private int y;
    private ChessPiece chessPiece;

    public Field(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ChessPiece getChessPiece() {
        return chessPiece;
    }

    public void setChessPiece(ChessPiece chessPiece) {
        this.chessPiece = chessPiece;
    }


}
