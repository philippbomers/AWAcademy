package Philipp_Training.Philipp_Woche5.day3;


public class AsciiII_Tasks {
    public static void main(String[] args) {
        asciiIITable();
    }

    public static void asciiIITable() {

        String output;
        for (int column = -1; column < 8; column++) {
            output = (column<0) ? "" : String.valueOf(column);
            System.out.printf("%3s", output);
        }

        int asciiVal = 0;
        for (int row = 0; row < 16; row++) {
            System.out.printf("%n%3s", row);
            for (int column = 0; column < 8; column++) {
                if(asciiVal<32){
                    asciiVal++;
                    String asciicharacter = ".";
                    System.out.printf("%3s", asciicharacter);
                }
                if(asciiVal>31 && asciiVal<127){
                    String asciicharacter = String.valueOf((char) (asciiVal++));
                    System.out.printf("%3s", asciicharacter);
                }
            }
        }


    }
}
