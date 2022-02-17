package Christian_Training.Christian_woche3;

public class EinMalEins_Vorschlag {
    public static void main(String[] args) {
        byte[] zahlen = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        byte[][] mult = new byte[8][8];

        for (byte i : zahlen){
            for (byte n = 0; n<zahlen.length; n++) {
                mult[i][n] = (byte) ((i)*(n));
            }
        }

        for (byte[] bytes : mult) {
            for (byte j : bytes) {
                System.out.printf("%4s ", j);
            }
            System.out.println();
        }
    }
}
