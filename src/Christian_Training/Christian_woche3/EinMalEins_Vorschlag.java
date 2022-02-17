package Christian_Training.Christian_woche3;

public class EinMalEins_Vorschlag {
    public static void main(String[] args) {

        // Möglichkeit: kann noch entfernt werden. Stattdessen in der ersten For-Schleife iterieren.
        byte[] zahlen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        byte[][] mult = new byte[10][10];

        for (byte i : zahlen){
            for (byte n : zahlen) {
                mult[i-1][n-1] = (byte) ((i)*(n));
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
