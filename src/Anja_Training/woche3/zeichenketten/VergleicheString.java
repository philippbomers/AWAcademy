package Anja_Training.woche3.zeichenketten;



public class VergleicheString {
    public static void main(String[] args) {

        // Mit direkter Zuweisung
        String str1 = "Vergleich";
        String str = "Vergleich";


        boolean compare = str1.equals(str);
        System.out.println(compare);

        boolean compare2 = str1 == str;
        System.out.println(compare2);

        // Mit Konstruktior
        String str2 = new String("Vergleich");
        String str3 = new String ("Vergleich");

        boolean compare3 = str2.equals(str3);
        System.out.println(compare3);

        boolean compare4 = str2 == str3;
        System.out.println(compare4);
    }
}

/* Interpretation des Ergebnis:
          Mit der equals-Methode wird der Inhalt des Objektes miteinander verglichen. Sprich Vergleich = Vergleich ? -> true
          Mit '==' Operator wird der Variablenname  und nicht der Inhalt verglichen -> str1 = str ? -> false
 */
