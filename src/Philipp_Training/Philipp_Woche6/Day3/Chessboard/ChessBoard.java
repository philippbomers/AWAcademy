package Philipp_Training.Philipp_Woche6.Day3.Chessboard;

import Philipp_Training.Philipp_Woche6.Day3.Chessboard.Board.ChessField;
import Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece.*;

public class ChessBoard {

    private ChessField[][] field;

    public ChessBoard() {

        this.field = new ChessField[8][8];

        /**
         * creates a new chess field
         */
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                switch (y) {
                    case 0:
                        switch (x) {
                            case 0, 7 -> {
                                this.field[x][y] = new ChessField(x, y);
                                this.field[x][y].setChessPiece(new Rook(true, x, y));
                            }
                            case 1, 6 -> {
                                this.field[x][y] = new ChessField(x, y);
                                this.field[x][y].setChessPiece(new Knight(true, x, y));
                            }
                            case 2, 5 -> {
                                this.field[x][y] = new ChessField(x, y);
                                this.field[x][y].setChessPiece(new Bishop(true, x, y));
                            }
                            case 3 -> {
                                this.field[x][y] = new ChessField(x, y);
                                this.field[x][y].setChessPiece(new Queen(true, x, y));
                            }
                            case 4 -> {
                                this.field[x][y] = new ChessField(x, y);
                                this.field[x][y].setChessPiece(new King(true, x, y));
                            }
                        }
                        break;
                    case 1:
                        this.field[x][y] = new ChessField(x, y);
                        this.field[x][y].setChessPiece(new Pawn(true, x, y));
                        break;
                    case 6:
                        this.field[x][y] = new ChessField(x, y);
                        this.field[x][y].setChessPiece(new Pawn(false, x, y));
                        break;
                    case 7:
                        switch (x) {
                            case 0, 7 -> {
                                this.field[x][y] = new ChessField(x, y);
                                this.field[x][y].setChessPiece(new Rook(false, x, y));
                            }
                            case 1, 6 -> {
                                this.field[x][y] = new ChessField(x, y);
                                this.field[x][y].setChessPiece(new Knight(false, x, y));
                            }
                            case 2, 5 -> {
                                this.field[x][y] = new ChessField(x, y);
                                this.field[x][y].setChessPiece(new Bishop(false, x, y));
                            }
                            case 3 -> {
                                this.field[x][y] = new ChessField(x, y);
                                this.field[x][y].setChessPiece(new Queen(false, x, y));
                            }
                            case 4 -> {
                                this.field[x][y] = new ChessField(x, y);
                                this.field[x][y].setChessPiece(new King(false, x, y));
                            }
                        }
                        break;
                    default:
                        this.field[x][y] = new ChessField(x, y);
                        break;
                }
            }
        }
    }

    public ChessField getField(int x, int y) {
        return field[x][y];
    }

    public void setField(int x, int y, ChessField field) {
        this.field[x][y] = field;
    }

    public void setField(int x, int y) {
        this.field[x][y] = null;
    }
}
