package Philipp_Training.Other.Minesweeper;

public class MinesweeperBoard {
    final private int width;
    final private int height;
    final private int bombs;
    final private boolean[][] bombFields;
    private final boolean[][] openFields;
    private final boolean[][] markedFields;

    public MinesweeperBoard(int width, int bombs) {
        this.width = width;
        this.height = width;
        this.bombs = bombs;
        this.openFields = new boolean[width][width];
        this.bombFields = new boolean[width][width];
        this.markedFields = new boolean[width][width];

        this.setStartConfiguration();
    }

    public void createBoard() {
        String content;
        System.out.printf("%6s", " ");
        for (int col = 0; col < this.height; col++) {
            System.out.printf("%3d", col);
        }
        System.out.printf("%n");
        System.out.printf("%6s", " ");
        for (int col = 0; col < this.height; col++) {
            System.out.printf("%3s", "___");
        }
        for (int row = 0; row < this.height; row++) {
            System.out.printf("%n%3d", row);
            System.out.printf("%3s", "|");
            for (int col = 0; col < this.width; col++) {
                content = getSign(row, col);
                System.out.printf("%3s", content);
            }
        }
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

        return numberOfBombs;
    }

    private boolean isFieldExisting(int row, int col) {
        return (row < this.height && col < this.width && row >= 0 && col >= 0);
    }

    private String getSign(int row, int col) {
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

    public void openAllFields() {
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

    private boolean getBombFields(int row, int col) {
        return this.bombFields[row][col];
    }

    public void setOpenFields(int row, int col) {
        if(!this.openFields[row][col]) this.openFields[row][col] = true;
        if (this.getBombFields(row, col)) {
            this.getLoosingDialogue();
        }
    }

    public void getLoosingDialogue() {
        System.out.println("\nDU\nHAST\nVerloren\n");
        openAllFields();
        this.createBoard();
        System.exit(0);
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
}
