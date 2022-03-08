package David_Training.Training_Week01.Training_Day03;

import java.util.Arrays;

public class ASCII {
    public static void main(String[] args) {

        String[][] asciiTable = new String[17][9];

        // "Seitenleisten" füllen
        int counterHorizontal = 1;
        int counterVertikal = 1;

        for (int i = 0; i <= 16; i++) {
            for (int j = 0; j <= 8; j++) {

                if (i == 0 && j == 0) {
                    asciiTable[i][j] = " ";
                }

                if (i == 0 && j != 0) {
                    String inhalt = String.valueOf(counterHorizontal);
                    asciiTable[i][j] = inhalt.concat("\tHex");
                    counterHorizontal++;
                }

                if (i != 0 && j == 0) {
                    asciiTable[i][j] = String.valueOf(counterVertikal);
                    counterVertikal++;
                }
            }
        }

        //Ascii-Zeichen in ascii-Tabelle einfügen
        for (int i = 1; i <= 16; i++) {
            for (int j = 1; j <= 8; j++) {

                int zeichenNummer = (i-1)*8 + j;

                char zeichen = (char) (zeichenNummer);

                if (zeichenNummer <= 32 || zeichenNummer >= 127) {
                    asciiTable[i][j] = ".";
                } else {
                    asciiTable[i][j] = String.valueOf(zeichen);
                }
            }
        }

        for (int i = 0; i <= 16; i++) {
            for (int j = 0; j <= 8; j++) {

                int zeichenNummer = i*8 + j + 1;

                if (j == 0) {
                    System.out.print(asciiTable[i][j] + "\t");
                } else if (i == 0 && j != 8) {
                    System.out.print(asciiTable[i][j] + "\t");
                } else if (i == 0 && j == 8) {
                    System.out.println(asciiTable[i][j] + "\t");
                } else if (j != 8 ) {
                    System.out.print(asciiTable[i][j] + "\t" + Integer.toHexString(zeichenNummer) + "\t");
                } else {
                    System.out.println(asciiTable[i][j] + "\t" + Integer.toHexString(zeichenNummer) + "\t");
                }
            }
        }
    }
}