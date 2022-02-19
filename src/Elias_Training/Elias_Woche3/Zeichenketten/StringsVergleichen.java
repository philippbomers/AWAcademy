package Elias_Training.Elias_Woche3.Zeichenketten;

public class StringsVergleichen {
    public static void main(String[] args) {

        // hier werden die beiden Strings jeweils auf Gleichheit und Objektidentität geprüft
        String str1 = "Vergleich";
        String str2 = "Vergleich";
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
        System.out.println("--------");
        String stringKonstruktor1= new String("Hallo");
        String stringKonstruktor2= new String("Hallo");
        System.out.println(stringKonstruktor1 == stringKonstruktor2);
        System.out.println(stringKonstruktor1.equals(stringKonstruktor2));
    }
}
