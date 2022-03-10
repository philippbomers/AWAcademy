package Philipp_Training.Philipp_Woche6.Day3.Exceptions;

import java.io.IOException;

public class ExceptionHandlingTraining {

    public static void main(String[] args) throws IOException {
        System.out.println(toUpperCaseWandler("Peter"));
        System.out.println(toUpperCaseWandler(null));

        System.out.println(toUpperCaseWandler2("\n\nPeter"));
        try {
            System.out.println(toUpperCaseWandler2(null));
        } catch (NullPointerException e) {
            System.out.println("Dies ist nicht möglich.");
        }

        try {
            System.out.println(getFileExceptionCreator1());
        }catch (IOException e) {
            System.out.println("\n\n"+e.getMessage());
        }

    }

    private static String toUpperCaseWandler(String string) {
        try {
            return string.toUpperCase();
        } catch (NullPointerException e) {
            return "Dies ist nicht möglich.";
        }
    }

    private static String toUpperCaseWandler2(String string) throws NullPointerException {
        return string.toUpperCase();
    }

    private static int getFileExceptionCreator1() throws IOException {
        throw new IOException("Dateizugriff unmöglich");
    }
}
