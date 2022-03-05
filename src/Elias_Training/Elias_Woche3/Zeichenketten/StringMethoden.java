package Elias_Training.Elias_Woche3.Zeichenketten;

public class StringMethoden {
    public static void main(String[] args) {
        String textString = "Alle sagten, das geht nicht. Dann kam einer, der wusste das nicht " +
                "und hat es einfach gemacht.";

        trenner("1. Großbuchstaben filtern");
        System.out.println("Anzahl der gesamten Buchstaben: "+textString.length());
        for (int i = 0; i < textString.length(); i++) {
            if (Character.isUpperCase(textString.charAt(i))) {
                char ergebnis = textString.charAt(i);
                System.out.println("Index " + i + ": " + ergebnis);
            }
        }

        trenner("2. Vergleich des Textes mit meinem Namen");
        String nachname = "Akbari";
        String vorname = "Elias";
        System.out.println(textString.compareTo(nachname));
        System.out.println("k steht im Alphabet einen Buchstaben vor l ");

        trenner("3. Verkettung meines Vor- mit meines Nachnamens");
        System.out.println(vorname.concat(nachname));
        //System.out.println(vorname+nachname);

        trenner("4. Finde die Wörter \"Java\" und \"gemacht\"");
        if (textString.contains("java")){
            System.out.println("Das Wort Java ist im String enthalten");
        } else if (textString.contains("gemacht")){
            System.out.println("Das Wort \"gemacht\" ist im String enthalten!");
        }

        trenner("5. Zeichenketten_Wiederholung auf Gleichheit vergleichen");
        String textStringZwei = "Alle sagten, das geht nicht. Dann kam einer, der wusste das " +
                "nicht und hat es einfach nicht gemacht.";
        if (textString.equals(textStringZwei))
            System.out.println("Beide Zeichenketten_Wiederholung sind gleich");
        else System.out.println("Die Zeichenketten_Wiederholung sind nicht gleich");

        trenner("6. Index vom 1. Buchstaben \"d\"");
        System.out.println(textString.indexOf('d'));

        trenner("7. Leerstrings finden");
        String leerStr = "";
        String[] ary = {textString, leerStr};
        for (String str: ary
             ) {
            if (str.isEmpty()) System.out.println("Ich bin leer :( --- LeerStr");
             else System.out.println("Ich bin voll :D --- Original-String");
        }

        trenner("8. String auf null prüfen");
        System.out.println((vorname == null) + ": Vorname ist nicht null");

        trenner("9. Länge des Textes");
        System.out.println("Der Text hat eine Länge von: " + textString.length());

        trenner("10. Die Wörter \"sagten\" und \"gemacht\" auslesen");
        System.out.println("die gesuchten Wörter sind:\n" + textString.substring(5,11)
                + "\n" + textString.substring(85,92));




    }

    public static void trenner(String titel){
        System.out.println("*************** "+titel+" ***************");
    }


}
