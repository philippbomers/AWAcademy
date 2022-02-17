package Christian_Training.Christian_woche3;

public class einMalEins {
    public static void main(String[] args) {
        int[] zahlen = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[][] mult = new int[10][10];

        for (int i = 0; i<zahlen.length; i++){
            System.out.println("i: " + zahlen[i]);
            for (int y = 0; y < zahlen.length; y++) {
                System.out.println("y: " +zahlen[y]);
                mult[y][i] = i * y;
                System.out.println("mult: " + mult[y][i]);
                System.out.println("product:" + (i * y));
            }
        }

        for(int i = 0; i < mult.length; i++)
        {
            for(int j = 0; j < mult[0].length; j++)
            {
                System.out.printf("%s ", mult[i][j]);
            }
            System.out.println();
        }
    }
}
