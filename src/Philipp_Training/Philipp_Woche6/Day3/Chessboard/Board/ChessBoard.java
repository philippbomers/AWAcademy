package Philipp_Training.Philipp_Woche6.Day3.Chessboard.Board;

import Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Generiert die Logik eines Schachbrettes zur externen Verwendung einer Oberfläche.
 * Funktionen:
 * - generiert Schachbrett im Array
 * → Wenn sich etwas ändert, ändert es sich auch im Array
 * - Es wird überprüft, wer am Zug ist
 * - Figuren bewegen sich korrekt
 * - Figuren können nicht über andere Figuren springen
 * - Figuren können Figuren mit anderer Farbe abwerfen
 */
public class ChessBoard {

    // TODO Rochade, Verbotszone um König, Bauer auf dem letzten Feld umwandeln

    private final ChessField[][] field = new ChessField[8][8];
    private boolean whiteTurn = true;

    public ChessBoard() {

        // creates a new chess field
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                this.setField(x, y, new ChessField(x, y));
                switch (y) {
                    case 0, 7:
                        switch (x) {
                            case 0, 7 -> this.getField(x, y).setChessPiece(new Rook((y == 0), x, y));
                            case 1, 6 -> this.getField(x, y).setChessPiece(new Knight((y == 0), x, y));
                            case 2, 5 -> this.getField(x, y).setChessPiece(new Bishop((y == 0), x, y));
                            case 3 -> this.getField(x, y).setChessPiece(new Queen((y == 0), x, y));
                            case 4 -> this.getField(x, y).setChessPiece(new King((y == 0), x, y));
                        }
                        break;
                    case 1, 6:
                        this.getField(x, y).setChessPiece(new Pawn((y == 1), x, y));
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

    private boolean isPieceInWay(int numFromInputX, int fromInputY, int numToInputX, int toInputY) {
        // cannot jump over other figures
        boolean pieceInWay = false;
        int countFieldsOfX = numToInputX - numFromInputX;
        int countFieldsOfY = toInputY - fromInputY;
        int xNow = numFromInputX;
        int yNow = fromInputY;
        while (countFieldsOfX != 0 || countFieldsOfY != 0) {
            if (countFieldsOfX != 0) {
                xNow = numFromInputX + (countFieldsOfX < 0 ? ++countFieldsOfX : --countFieldsOfX);
            }
            if (countFieldsOfY != 0) {
                yNow = fromInputY + (countFieldsOfY < 0 ? ++countFieldsOfY : --countFieldsOfY);
            }
            if (this.getField(numFromInputX, fromInputY).getChessPiece().canMove(xNow, yNow, false) &&
                    this.getField(xNow, yNow).getChessPiece() != null) {
                pieceInWay = true;
            }
        }
        return pieceInWay;
    }

    public boolean movePieceOnBoard(int numFromInputX, int fromInputY, int numToInputX, int toInputY) {
        ChessField actualField = this.getField(numFromInputX, fromInputY);
        ChessField newField = this.getField(numToInputX, toInputY);

        if ((actualField.getChessPiece() != null) &&
                actualField.getChessPiece().canMove(numToInputX, toInputY, (newField.getChessPiece() != null)) && // aktuelles Feld nicht leer
                (!this.isPieceInWay(numFromInputX, fromInputY, numToInputX, toInputY)) && // Keine Figur im Weg
                (actualField.getChessPiece().isWhite() == this.isWhiteTurn()) && // richtige Farbe ausgewählt?
                // neues Feld muss leer sein oder eine Figur einer anderen Farbe beinhalten
                (newField.getChessPiece() == null ||
                        actualField.getChessPiece().isWhite() != newField.getChessPiece().isWhite())) {

            actualField.getChessPiece().move(numToInputX, toInputY, (newField.getChessPiece() != null));
        } else {
            return false;
        }

        // beschreibe die Felder
        newField.setChessPiece(actualField.getChessPiece());
        actualField.setChessPiece(null);
        // erster Schritt der Figur beendet (z.B. für Bauer oder Rochade)
        newField.getChessPiece().setFirstStep(false);
        // nächste Farbe ist am Zug
        this.setWhiteTurn(!this.isWhiteTurn());
        return true;
    }

    public boolean isWhiteTurn() {
        return whiteTurn;
    }

    public void setWhiteTurn(boolean whiteTurn) {
        this.whiteTurn = whiteTurn;
    }

    public ChessField[][] getField() {
        return field;
    }

    public boolean checkWin() {
        int count = (int) Arrays.stream(this.getField()).flatMap(Arrays::stream).filter(chessField -> chessField.getChessPiece() != null && chessField.getChessPiece().getName().equals(King.CHESS_PIECE_KING_NAME)).count();
        return (count == 1);
    }

    public List<ChessField> getFieldsOfPossibleMovements(int x, int y) {
        List<ChessField> result = new ArrayList<>();
        ChessField actualField = this.getField(x, y);
        for (ChessField[] chessFields : this.getField()) {
            for (ChessField chessField : chessFields) {
                if (actualField.getChessPiece().canMove(chessField.getX(), chessField.getY(), (
                        chessField.getChessPiece() != null &&
                                chessField.getChessPiece().isWhite() != actualField.getChessPiece().isWhite())) &&
                        !this.isPieceInWay(x, y, chessField.getX(), chessField.getY()) &&
                        (chessField.getChessPiece() == null ||
                                chessField.getChessPiece().isWhite() != actualField.getChessPiece().isWhite())) {
                    result.add(chessField);
                }
            }
        }
        return result;
    }
}
