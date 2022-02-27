package Anja_Training.woche3.zeichenketten;

import java.util.Locale;

public class MethodenString {
    public static void main(String[] args) {


        String text = "Alle sagten, das geht nicht. Dann kam einer, der wusste das nicht \n" +
                "und hat es einfach gemacht.";
        // 1)
       großbuchstaben(text);

        // 2)
        compareTextName(text);

        // 3)
        String myName = "Anja";
        myName = myName.concat(" Schiebel");
        System.out.println(myName);

        // 4)
        doContain(text);

        // 5)
        vergleich("Ist der Satz gleich?", "Ist der Satz gleich?");

        // 6)
       System.out.println(text.indexOf('d'));

        // 7)
        System.out.println(text.isEmpty()); // prüft ob String leer ist

        // 8)
        // System.out.println(text == null); ?
        System.out.println(text.equals(null));

        // 9)
        System.out.println(text.length());

        // 10)
        System.out.println(text.substring(text.indexOf("sagten"),text.indexOf("sagten")+6));
        System.out.println(text.substring(text.indexOf("gemacht"), text.indexOf("gemacht")+7));
        
    }

    public static void großbuchstaben(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                System.out.println(text.charAt(i));
            }
        }
    }

    public static void compareTextName(String text) {
        String name = "Anja Schiebel";
        int x = text.compareTo(name);
        if (x == 0) {
            System.out.println("Der Text ist identisch mit dem Namen.");
        } else if (x < 0) {
            System.out.println("Text ist nicht gleich mit dem Namen. " +
                    "Bei der 1. Unterscheidung hat der Text einen kleineren lexicographischen Wert.");

        } else {
            System.out.println("Text ist nicht gleich mit dem Namen." +
                    "Bei der 1. Unterscheidung hat der Text einen größeren lexicographischen Wert.");

        }

    }

    public static void doContain(String text) {
        if (text.contains("gemacht") && text.contains("Java")) {
            System.out.println("Im Satz kommt das Wort \"gemacht\" und \"Java\" vor");
        } else if (text.contains("Java")) {
            System.out.println("Im Satz kommt das Wort \"Java\" vor");

        } else if (text.contains("gemacht")) {
            System.out.println("Im Satz kommt das Wort \"gemacht\" vor");

        } else {
            System.out.println("Im Satz kommt weder das Wort \"gemacht\" noch das Wort \"Java\" vor");
        }
    }

    public static void vergleich(String text1, String text2) {
        if (text1.toLowerCase(Locale.ROOT).equals(text2.toLowerCase(Locale.ROOT))) {
            System.out.println("Die beiden Texte sind gleich");
        }else{
            System.out.println("Die Texte sind nicht gleich");
        }
    }
}

