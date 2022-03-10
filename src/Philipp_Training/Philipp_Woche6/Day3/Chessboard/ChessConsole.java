package Philipp_Training.Philipp_Woche6.Day3.Chessboard;

public class ChessConsole {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();

        for (int y = 0; y < 8; y++) {
            System.out.print("\n");
            for (int x = 0; x < 8; x++) {
                if(chessBoard.getField(x, y).getChessPiece() != null){
                    System.out.printf("%10s", chessBoard.getField(x, y).getChessPiece().getName());
                }else {
                    System.out.printf("%10s", chessBoard.getField(x,y).getName());
                }
            }
        }
    }
}
