public class BonsaufgabeArray {

    public static void main(String[] args) {
        int[][] array = new int[10][10];

        for (int i = 1; i <= array.length; i++) {
            array[i - 1][0] = i;
        }

        for (int l = 1; l < array.length; l++) {
            array[0][l] = l + 1;
        }

        for (int k = 1; k < array.length; k++) {

            for (int n = 1; n < array.length; n++) {
                array[n][k] = (array[n][0] * array[0][k]);
            }
        }
        for (int x = 0; x < array.length; x++){
            for(int z = 0; z < array.length; z++){
                System.out.printf("%-5d" ,array[x][z]);
            }
            System.out.println();
        }
    }
}
