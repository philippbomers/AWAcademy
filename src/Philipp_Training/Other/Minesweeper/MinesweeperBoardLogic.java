package Philipp_Training.Other.Minesweeper;

/**
 * Minesweeper
 * 1. Generiert ein Feld mit der Größe x * x mit n Bomben auf zufälligen Feldern
 * 2. Öffnet zu Beginn ein zufälliges Feld, welches keine Bombe beinhaltet
 * 3. Der Benutzer flagged ein Feld und dann öffnet er es
 * A: Bombe: Das Spiel ist verloren
 * B: Keine Bombe: Das Feld zeigt die Anzahl der Bomben im Umkreis an
 * 4. Das Spiel ist zu Ende, wenn alle Felder geöffnet sind.
 * Punkte: Alle an Bomben angrenzenden Felder werden zusammen gezählt. Geflaggte Bomben zählen 1 Punkt.
 */
public class MinesweeperBoardLogic {
    final private int width;
    final private int bombs;
    final private boolean[][] bombFields;
    private final boolean[][] openFields;
    private final boolean[][] flaggedFields;
    private final boolean[][] fields;

    /**
     * Generiert das Feld und ruft die Initialisierung ab
     *
     * @param width Anzahl der Reihen und Spalte
     * @param bombs Anzahl der Bomben
     */
    public MinesweeperBoardLogic(int width, int bombs) {
        this.width = width;
        this.bombs = bombs;
        this.openFields = new boolean[width][width];
        this.bombFields = new boolean[width][width];
        this.flaggedFields = new boolean[width][width];
        this.fields = new boolean[width][width];
        this.generateNewField();
    }

    /**
     * Initialisierung:
     * Generiert das Feld.
     * Öffnet ein zufälliges Feld ohne Bomben.
     * Verteilt die Bomben auf zufällige Felder, die nicht offen sind.
     */
    private void generateNewField() {
        int randomRow, randomColumn;
        this.setOpenField(generateRandomNumber(), generateRandomNumber());
        for (int i = 0; i < this.bombs; i++) {
            randomRow = generateRandomNumber();
            randomColumn = generateRandomNumber();
            if (!this.isBombField(randomRow, randomColumn) && !this.isOpenField(randomRow, randomColumn)) {
                this.setBombField(randomRow, randomColumn);
            } else {
                i--;
            }
        }
    }

    /**
     * @param row Reihe
     * @param col Spalte
     * @return Anzahl der Bomben im Umkreis
     */
    private int getNumberOfBombsAround(int row, int col) {
        int numberOfBombs = 0;

        /*
         * B X X
         * X O X
         * X X X
         */
        if (this.isFieldExisting((row - 1), (col - 1))) {
            if (this.isBombField((row - 1), (col - 1))) {
                numberOfBombs++;
            }
        }

        /*
         * X B X
         * X O X
         * X X X
         */
        if (this.isFieldExisting(row, (col - 1))) {
            if (this.isBombField(row, (col - 1))) {
                numberOfBombs++;
            }
        }

        /*
         * X X X
         * B O X
         * X X X
         */
        if (this.isFieldExisting((row - 1), col)) {
            if (this.isBombField((row - 1), col)) {
                numberOfBombs++;
            }
        }

        /*
         * X X X
         * X O X
         * X X B
         */
        if (this.isFieldExisting((row + 1), (col + 1))) {
            if (this.isBombField((row + 1), (col + 1))) {
                numberOfBombs++;
            }
        }

        /*
         * X X X
         * X O B
         * X X X
         */
        if (this.isFieldExisting(row, (col + 1))) {
            if (this.isBombField(row, (col + 1))) {
                numberOfBombs++;
            }
        }

        /*
         * X X X
         * X O X
         * X B X
         */
        if (this.isFieldExisting((row + 1), col)) {
            if (this.isBombField((row + 1), col)) {
                numberOfBombs++;
            }
        }

        /*
         * X X X
         * X O X
         * B X X
         */
        if (this.isFieldExisting((row + 1), (col - 1))) {
            if (this.isBombField((row + 1), (col - 1))) {
                numberOfBombs++;
            }
        }

        /*
         * X X B
         * X O X
         * X X X
         */
        if (this.isFieldExisting((row - 1), (col + 1))) {
            if (this.isBombField((row - 1), (col + 1))) {
                numberOfBombs++;
            }
        }

        return numberOfBombs;
    }

    /**
     * Prüft die Existenz eines Feldes
     *
     * @param row Reihe
     * @param col Spalte
     * @return boolischer Wahrheitswert über die Existenz
     */
    private boolean isFieldExisting(int row, int col) {
        return (row < this.getWidth() && col < this.getWidth() && row >= 0 && col >= 0);
    }

    /**
     * Erhalte das Zeichen eines Feldes.
     * X = Neutral
     * B = Bombe
     * M = Markiert
     * 0-8 = Bomben im Umkreis
     *
     * @param row reihe
     * @param col Spalte
     * @return Feldzeichen (X, B, M, 0-8)
     */
    protected String getSign(int row, int col) {
        String result = "X";
        if (isOpenField(row, col)) {
            result = isBombField(row, col) ? "B" : String.valueOf(this.getNumberOfBombsAround(row, col));
        } else if (isFlaggedField(row, col)) {
            result = "F";
        }
        return result;
    }

    /**
     * Öffnet alle Felder
     * (Beispielsweise beim Gewinnen oder Verlieren)
     */
    protected void openAllFields() {
        for (int row = 0; row < this.getWidth(); row++) {
            for (int col = 0; col < this.getWidth(); col++) {
                this.openFields[row][col] = true;
                this.flaggedFields[row][col] = false;
            }
        }
    }

    /**
     * Erhalte eine Zufallszahl für ein Feld
     *
     * @return Zufallszahl nach Anzahl der Felder
     */
    private int generateRandomNumber() {
        return (int) (Math.random() * this.getWidth());
    }

    /**
     * Setze ein Bombenfeld
     *
     * @param row reihe
     * @param col spalte
     */
    private void setBombField(int row, int col) {
        this.bombFields[row][col] = true;
    }

    /**
     * Beinhaltet ein Feld eine Bombe?
     *
     * @param row Reihe
     * @param col Spalte
     * @return Bombe vorhanden? (true, false)
     */
    protected boolean isBombField(int row, int col) {
        return this.bombFields[row][col];
    }

    /**
     * Öffne ein Feld
     *
     * @param row Reihe
     * @param col Spalte
     */
    protected void setOpenField(int row, int col) {
        this.openFields[row][col] = true;
        this.flaggedFields[row][col] = false;
    }

    /**
     * Ist ein Feld offen?
     *
     * @param row Reihe
     * @param col Spalte
     * @return Feld offen? (true, false)
     */
    protected boolean isOpenField(int row, int col) {
        return this.openFields[row][col];
    }

    /**
     * Ist ein Feld markiert?
     *
     * @param row Reihe
     * @param col Spalte
     * @return Feld markiert? (true, false)
     */
    protected boolean isFlaggedField(int row, int col) {
        return this.flaggedFields[row][col];
    }

    /**
     * Setze oder entferne ein markiertes Feld
     * - Das Feld wird invertiert
     *
     * @param row Reihe
     * @param col Spalte
     */
    protected void setFlaggedField(int row, int col) {
        this.flaggedFields[row][col] = !this.flaggedFields[row][col];
    }

    /**
     * Wurden alle Felder geöffnet oder sind markiert?
     *
     * @return Brett fertig? (true, false)
     */
    protected boolean isCompletedFields() {
        for (int row = 0; row < this.getWidth(); row++) {
            for (int col = 0; col < this.getWidth(); col++) {
                if (!this.isOpenField(row, col) && !this.isFlaggedField(row, col) && !this.isBombField(row, col)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Erhalte die Anzahl der Felder pro Reihe oder Spalte
     *
     * @return Anzahl der Felder pro Reihe oder Spalte
     */
    protected int getWidth() {
        return this.width;
    }

    /**
     * Erhalte die Anzahl der Bomben
     *
     * @return Gesamtzahl der Bomben
     */
    protected int getBombs() {
        return this.bombs;
    }

    /**
     * Prüfe ein Feld, ob es eine Bombe beinhaltet
     *
     * @return Bombe vorhanden?
     */
    protected boolean[][] isBombField() {
        return this.bombFields;
    }

    /**
     * Prüfe, ob ein Feld geöffnet wurde
     *
     * @return Feld geöffnet?
     */
    protected boolean[][] isOpenField() {
        return this.openFields;
    }

    /**
     * Prüfe, ob ein Feld markiert wurde
     *
     * @return Feld markiert?
     */
    protected boolean[][] isFlaggedField() {
        return this.flaggedFields;
    }

    /**
     * Erhalte einen Array mit allen Feldern
     *
     * @return Array mit allen Feldern
     */
    protected boolean[][] getFields() {
        return this.fields;
    }
}
