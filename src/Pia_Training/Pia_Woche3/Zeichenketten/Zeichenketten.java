package Pia_Training.Pia_Woche3.Zeichenketten;

public class Zeichenketten {
    public static void main(String[] args) {
        // METHODEN DES STRING
        String originalText = "Alle sagten, das geht nicht. Dann kam einer, der wusste das nicht " +
                "und hat es einfach gemacht.";
        System.out.println(originalText);
        System.out.println("\n");
        // 1. Großbuchstaben auslesen
        char c;
        for (int i = 0; i < originalText.length(); i++) {
            c = originalText.charAt(i);
            if (Character.isUpperCase(c)) {
                System.out.print(c);
            }
        }
        System.out.println("\n");
        // 2. Vergleich mit meinem Namen
        String myName = "Pia Stitzing";
        System.out.println("Ich heiße " + myName + ".");
        System.out.println("\n");
        if (originalText.compareTo(myName) > 0) {
            System.out.println("Der Original-Text steht lexikografisch nach meinem Namen.");
        } else {
            System.out.println("Der Original-Text steht lexikografisch vor meinem Namen.");
        }
        System.out.println("\n");
        // 3. Verkettung Vor- und Nachname
        String firstName = "Pia";
        String lastName = "Stitzing";
        System.out.println(firstName.concat(lastName));
        System.out.println("\n");
        // 4. Kommen "gemacht" und "Java" vor?
        System.out.println("Enthält der Original-Text das Wort 'gemacht'? (true/false)");
        System.out.println(originalText.contains("gemacht"));
        System.out.println("Enthält der Original-Text das Wort 'Java'? (true/false)");
        System.out.println(originalText.contains("Java"));
        System.out.println("\n");
        // 5. Vergleich auf Gleichheit mit "equals"
        String myString = "Na klar geht das!";
        System.out.println("Stimmt mein Text mit dem Original-Text überein? (true/false)");
        System.out.println(originalText.equals(myString));
        System.out.println("\n");
        // 6. Gib den Index des ersten “d”s aus.
        System.out.println("Der Index von 'd' ist:");
        System.out.println(originalText.indexOf('d'));
        System.out.println("\n");
        // 7. Prüfe auf den Leerstring
        System.out.println("Handelt es sich um einen Leerstring?");
        System.out.println(originalText.isEmpty());
        System.out.println("\n");
        // 8. Prüfe auf null
        System.out.println("Was ergibt die Prüfung auf 'null'?");
        System.out.println(originalText == null);
        System.out.println("\n");
        // 9. Gib die Länge des Textes aus
        System.out.println("Der Text hat " + originalText.length() + " Zeichen.");
        System.out.println("\n");
        // 10 Lese die Wörter “sagten” und “gemacht” aus
        System.out.println(originalText.substring(5, 11) + " &" +
                originalText.substring(originalText.length() - 9, originalText.length() - 1));
        System.out.println("\n");

        // VERGLEICHE VON STRINGS
        String str1 = "Vergleich";
        String str2 = "Vergleich";
        String str3 = "Vergleich";
        String str4 = "Vergleich";

        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        /*Interpretation: '==' überprüft, ob die Referenz identisch ist.
         '.equals()' hingegen testet, ob der Inhalt identisch ist. Die Referenz kann unterschiedlich sein.
         Da es sich bei str3 und str4 technisch gesehen um zwei verschiedene String-Objekte handelt,
         können sie nicht dieselbe Referenz haben. Daher wird 'false' ausgegeben,
         sofern sie mit dem '=='-Operator verglichen werden.
         --> Objekte nicht mit '==' vergleichen!
         */
        System.out.println("\n");

        // BONUSAUFGABE: WÖRTER ZÄHLEN
        String text = "Weit draußen in den unerforschten Einöden eines total aus der Mode gekommenen " +
                "Ausläufers des westlichen Spiralarms der Galaxis leuchtet unbeachtet eine kleine gelbe " +
                "Sonne. Um sie kreist in einer Entfernung von ungefähr auchtundneunzig Millionen Meilen " +
                "ein absolut unbedeutender, kleiner blaugrüner Planet, dessen vom Affen stammende " +
                "Bioformen so erstaunlich primitiv sind, daß sie Digitaluhren noch immer für eine " +
                "unwahrscheinlich tolle Erfindung halten.";

        String[] numberWords = text.split(" ");
        System.out.println("Der Text hat " + numberWords.length + " Wörter.");
    }
}
