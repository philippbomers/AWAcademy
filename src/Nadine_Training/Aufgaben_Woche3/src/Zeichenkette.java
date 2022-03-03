public class Zeichenkette {

    public static void main(String[] args) {
        //Methoden des String

        String text = "Alle sagten, das geht nicht. Dann kam einer, der wusste das nicht \n" +
                "und hat es einfach gemacht";

        //1.

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                System.out.println(text.charAt(i));
            }
        }
        System.out.println();

        //2.
        System.out.println(text.compareTo("Nadine"));
        /*Der argument string "Nadine" ist kürzer als die Variable "text" und die beiden haben
        unterschiedliche chars an unterschiedlichen Stellen. Die einzelnen chars des argument string sind
        dabei an den überschneidenden Stellen der chars mit dem text (chars[0] bspw. von text und argument string)
        lexicographically um 13 höher, als der "text".
         */

        //3.
        String name1 = "Nadine";
        String name2 = "Hemmeter";
        System.out.println();
        System.out.println(name1.concat(" " + name2));

        //4.
        String suche1 = "gemacht";
        String suche2 = "Java";
        System.out.println();
        System.out.println("Das Wort " + suche1 + " ist enthalten: " + text.contains(suche1));
        System.out.println("Das Wort " + suche2 + " ist enthalten: " + text.contains(suche2));

        //5.
        String eins = "Hallo Welt";
        String zwei = "Wie geht es dir?";
        System.out.println();
        System.out.println(eins.equals(zwei));

        //6.
        System.out.println("\nDer Index des ersten d lautet: " + text.indexOf("d"));

        //7.
        System.out.println("\nIst der String leer? " + text.isEmpty());

        //8.
        System.out.println("\nEnthält der Text 'null'? " + text.equals(null));

        //9.
        System.out.println("\nDer Text hat folgende Länge: " + text.length());

        //10.
        System.out.println();
        System.out.println(text.substring(5, 11));
        System.out.println(text.substring(86, 93));


        //Vergleiche Strings

        //1. Direkte Zuweisung
        String str1 = "Vergleich";
        String str2 = "Vergleich";

        //equals
        System.out.println("\nMit der equals Methode erhalten wir als Ergebnis: " + str1.equals(str2));

        //== Operator
        System.out.println("Mit der == Methode erhalten wir als Ergebnis: " + (str1 == str2));

        //2. Konstruktor
        String string1 = new String("Vergleich");
        String string2 = new String("Vergleich");

        //equals
        System.out.println("\nMit der equals Methode erhalten wir als Ergebnis: " + string1.equals(string2));

        //== Operator
        System.out.println("Mit der == Methode erhalten wir als Ergebnis: " + (string1 == string2));

        /*Durch direkte Zuweisung der Strings werden zwar zwei Objekte der Klasse String erstellt (str1,str2)
        allerdings verweisen beiden im sogenannten heap auf denselben Wert/value (hier: "Vergleich"). Dadurch
        erhalten wir sowohl bei der equals Methode, als auch bei der == Methode ein true.
        Wenn allerdings der Konstruktor der Klasse String verwendet wird, wird das Programm gezwungen, auch
        einen neuen, wenn auch gleichen Wert nochmal im heap zu speichern. Dadurch  erhalten wir bei Vergleich
        der unteren Zuweisungen mit der == Methode ein false, da es sich nicht um die gleichen values/Werte handelt.
        Bei der equals erhalten wir allerdings auch true, da hier der Inhalt verglichen wird und bei beiden
        jeweils die Zeichenkette "Verlgeich" gespeichert ist.
         */

    }




}
