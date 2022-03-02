package Mehmet_Training.Woche1;

public class TypUmwandlung {
    public static void main(String[] args) {
        int a = 130;
        // explizites Casting, Aufgabe 1
        byte b = (byte)a;
        System.out.println(b);
        // implizites Casting, Aufgabe 2
        short c = 123;
        float d = c;
        System.out.println(d);
        // Aufgabe 4. einschränkende, implizite Typumwandlung
        float g = 23.12f;
        //short f = g/4;
        // erweiternde, explizite Typumwandlung
        short k = 2030;
        int j = (short)k;
        System.out.println(j);
    }
}
