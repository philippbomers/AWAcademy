package Philipp_Training.Other.Minesweeper;

public class MinesweeperBoard {
    final private int width;
    final private int height;
    final private int bombs;
    final private boolean[][] bombFields;
    private final boolean[][] openFields;
    private final boolean[][] markedFields;
    private final boolean[][] fields;

    public MinesweeperBoard(int width, int bombs) {
        this.width = width;
        this.height = width;
        this.bombs = bombs;
        this.openFields = new boolean[width][width];
        this.bombFields = new boolean[width][width];
        this.markedFields = new boolean[width][width];
        this.fields = new boolean[width][width];

        this.setStartConfiguration();
    }

    private void setStartConfiguration() {
        int randomRow;
        int randomColumn;
        this.setOpenFields(getRandomNumber(), getRandomNumber());

        for (int i = 0; i < this.bombs; i++) {
            randomRow = getRandomNumber();
            randomColumn = getRandomNumber();
            if (!this.getBombFields(randomRow, randomColumn)
                    && !this.getOpenFields(randomRow, randomColumn)) {
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
        return (row < this.getWidth() && col < this.getHeight() && row >= 0 && col >= 0);
    }

    protected String getSign(int row, int col) {
        String result = "X";
        if (getOpenFields(row, col)) {
            result = String.valueOf(this.getBombsAround(row, col));
            if (getBombFields(row, col)) {
                result = "B";
            }
        } else {
            if (getMarkedFields(row, col)) {
                result = "M";
            }
        }
        return result;
    }

    protected void openAllFields() {
        for (int row = 0; row < this.height; row++) {
            for (int col = 0; col < this.width; col++) {
                this.openFields[row][col] = true;
            }
        }
    }

    private int getRandomNumber() {
        return (int) (Math.random() * this.width);
    }

    private void setBombFields(int row, int col) {
        this.bombFields[row][col] = true;
    }

    boolean getBombFields(int row, int col) {
        return this.bombFields[row][col];
    }

    public void setOpenFields(int row, int col) {
        if (!this.openFields[row][col]) this.openFields[row][col] = true;
        if (this.getBombFields(row, col)) {
            this.openAllFields();
        }
    }

    private boolean getOpenFields(int row, int col) {
        return this.openFields[row][col];
    }

    public boolean getMarkedFields(int row, int col) {
        return this.markedFields[row][col];
    }

    public void setMarkedFields(int row, int col) {
        this.markedFields[row][col] = !this.markedFields[row][col];
    }

    public boolean isCompletedFields() {
        for (boolean[] openFields : this.openFields) {
            for (boolean openField : openFields) {
                if (!openField) return false;
            }
        }
        return true;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getBombs() {
        return bombs;
    }

    public boolean[][] getBombFields() {
        return bombFields;
    }

    public boolean[][] getOpenFields() {
        return openFields;
    }

    public boolean[][] getMarkedFields() {
        return markedFields;
    }

    public boolean[][] getFields() {
        return fields;
    }
}
