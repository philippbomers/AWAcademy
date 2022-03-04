package Philipp_Training.Other.Minesweeper;

public class MinesweeperBoard {
    final private int width;
    final private int height;
    final private int bombs;
    private String[][] fields;
    private boolean[][] openFields;
    private boolean[][] bombFields;
    private boolean[][] markedFields;

    public MinesweeperBoard(int width, int height, int bombs) {
        this.width = width;
        this.height = height;
        this.bombs = bombs;
        this.fields = new String[width][height];
        this.openFields = new boolean[width][height];
        this.bombFields = new boolean[width][height];
        this.markedFields = new boolean[width][height];

        this.setStartConfiguration();
    }

    private int getRandomNumber() {
        return (int) (Math.random() * this.width);
    }

    private void setStartConfiguration() {
        this.setOpenField(getRandomNumber(), getRandomNumber());
        for (int i = 0; i < this.bombs; i++) {
            int randomRow = getRandomNumber();
            int randomColumn = getRandomNumber();
            if (!this.getBombFields(randomRow, randomColumn)) {
                this.setBombField(randomRow, randomColumn);
            } else {
                i--;
            }
        }
    }

    private void setBombField(int row, int col) {
        this.bombFields[row][col] = !this.bombFields[row][col];
    }

    private boolean getBombFields(int row, int col) {
        return this.bombFields[row][col];
    }

    private void setOpenField(int row, int col) {
        this.openFields[row][col] = !this.openFields[row][col];
    }

    private boolean getOpenField(int row, int col) {
        return this.openFields[row][col];
    }

    public void createBoard() {
        String content;
        System.out.printf("%3s", " ");
        for (int col = 0; col < this.height; col++) {
            System.out.printf("%3d", col);
        }
        for (int row = 0; row < this.height; row++) {
            System.out.printf("%n%3d", row);
            for (int col = 0; col < this.width; col++) {
                content = getSign(row, col);
                System.out.printf("%3s", content);
            }
        }
    }

    private String getSign(int row, int col) {
        String result = "X";
        if (getOpenField(row, col)) {
            result = "O";
            if (getBombFields(row, col)) {
                result = "B";
            }
        }
        return result;
    }
}
