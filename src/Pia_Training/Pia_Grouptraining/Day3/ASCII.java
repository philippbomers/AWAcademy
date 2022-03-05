package Pia_Training.Pia_Grouptraining.Day3;

public class ASCII {
    public static void main(String[] args) {
        System.out.println("ASCII table: ");
        for (int i = 33; i < 127; i++) {
            System.out.print((char)i + "\t");
            if ((i % 8) == 0) {
                System.out.println();
            }
        }
        System.out.println("\n\nASCII table including hexadecimal values: ");
        for (int i = 33; i < 127; i++) {
            System.out.print(Integer.toHexString((char) i) + (char) i + "\t");
            if ((i % 8) == 0) {
                System.out.println();
            }
        }
        //System.out.println("\n"+ Integer.toOctalString((char)39));
    }
}