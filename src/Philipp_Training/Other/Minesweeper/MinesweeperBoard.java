package Philipp_Training.Other.Minesweeper;

public class MinesweeperBoard {
    final private int width;
    final private int bombs;
    final private boolean[][] bombFields;
    private final boolean[][] openFields;
    private final boolean[][] markedFields;
    private final boolean[][] fields;

    public MinesweeperBoard(int width, int bombs) {
        this.width = width;
        this.bombs = bombs;
        this.openFields = new boolean[width][width];
        this.bombFields = new boolean[width][width];
        this.markedFields = new boolean[width][width];
        this.fields = new boolean[width][width];
        this.setStartConfiguration();
    }

    private void setStartConfiguration() {
        int randomRow, randomColumn;
        this.setOpenFields(getRandomNumber(), getRandomNumber());
        for (int i = 0; i < this.bombs; i++) {
            randomRow = getRandomNumber();
            randomColumn = getRandomNumber();
            if (!this.getBombFields(randomRow, randomColumn) && !this.getOpenFields(randomRow, randomColumn)) {
                this.setBombFields(randomRow, randomColumn);
            } else {
                i--;
            }
        }
    }

    private int getBombsAround(int row, int col) {
        int numberOfBombs = 0;

        if (this.isFieldExisting((row - 1), (col - 1))) {
            if (this.getBombFields((row - 1), (col - 1))) {
                numberOfBombs++;
            }
        }

        if (this.isFieldExisting(row, (col - 1))) {
            if (this.getBombFields(row, (col - 1))) {
                numberOfBombs++;
            }
        }

        if (this.isFieldExisting((row - 1), col)) {
            if (this.getBombFields((row - 1), col)) {
                numberOfBombs++;
            }
        }

        if (this.isFieldExisting((row + 1), (col + 1))) {
            if (this.getBombFields((row + 1), (col + 1))) {
                numberOfBombs++;
            }
        }

        if (this.isFieldExisting(row, (col + 1))) {
            if (this.getBombFields(row, (col + 1))) {
                numberOfBombs++;
            }
        }

        if (this.isFieldExisting((row + 1), col)) {
            if (this.getBombFields((row + 1), col)) {
                numberOfBombs++;
            }
        }

        if (this.isFieldExisting((row + 1), (col - 1))) {
            if (this.getBombFields((row + 1), (col - 1))) {
                numberOfBombs++;
            }
        }

        if (this.isFieldExisting((row - 1), (col + 1))) {
            if (this.getBombFields((row - 1), (col + 1))) {
                numberOfBombs++;
            }
        }

        return numberOfBombs;
    }

    private boolean isFieldExisting(int row, int col) {
        return (row < this.getWidth() && col < this.getWidth() && row >= 0 && col >= 0);
    }

    protected String getSign(int row, int col) {
        String result = "X";
        if (getOpenFields(row, col)) {
            result = getBombFields(row, col) ? "B" : String.valueOf(this.getBombsAround(row, col));
        } else if (getMarkedFields(row, col)) {
            result = "M";
        }
        return result;
    }

    protected void openAllFields() {
        for (int row = 0; row < this.getWidth(); row++) {
            for (int col = 0; col < this.getWidth(); col++) {
                this.openFields[row][col] = true;
            }
        }
    }

    private int getRandomNumber() {
        return (int) (Math.random() * this.getWidth());
    }

    private void setBombFields(int row, int col) {
        this.bombFields[row][col] = true;
    }

    protected boolean getBombFields(int row, int col) {
        return this.bombFields[row][col];
    }

    protected void setOpenFields(int row, int col) {
        this.openFields[row][col] = true;
    }

    protected boolean getOpenFields(int row, int col) {
        return this.openFields[row][col];
    }

    protected boolean getMarkedFields(int row, int col) {
        return this.markedFields[row][col];
    }

    protected void setMarkedFields(int row, int col) {
        this.markedFields[row][col] = !this.markedFields[row][col];
    }

    protected boolean isCompletedFields() {
        for (boolean[] openFields : this.getOpenFields()) {
            for (boolean openField : openFields) {
                if (!openField) {
                    return false;
                }
            }
        }
        return true;
    }

    protected int getWidth() {
        return this.width;
    }

    protected int getBombs() {
        return this.bombs;
    }

    protected boolean[][] getBombFields() {
        return this.bombFields;
    }

    protected boolean[][] getOpenFields() {
        return this.openFields;
    }

    protected boolean[][] getMarkedFields() {
        return this.markedFields;
    }

    protected boolean[][] getFields() {
        return this.fields;
    }


}
