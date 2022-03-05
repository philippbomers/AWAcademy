import java.util.Scanner;

public class Zeichenketten {
    public static void main(String[] args) {
        //Aufgabe: Methoden des String
        String spielZeug = "Alle sagten, das geht nicht. Dann kam einer, der wusste das nicht " +
                "und hat es einfach gemacht.";

        //Aufgabe: Teil 1
        String nurGroßbuchstaben = spielZeug.replaceAll("[^A-Z]", "");
        System.out.println("Die Großbuchstaben im Text sind wie folgt:");
        for (int i = 0; i < nurGroßbuchstaben.length(); i++) {
            System.out.print(nurGroßbuchstaben.charAt(i) + " ");
        }
        System.out.println();

        //Aufgabe: Teil 2
        String vorname = "Mehmet";
        String nachname = "Katran";
        System.out.println("Ergebnis des Textvergleichs ist: " + spielZeug.compareTo(vorname));

        //Aufgabe: Teil 3
        String vollname = vorname.concat(" " + nachname);
        System.out.println("Vollname ist: " + vollname);

        //Aufgabe: Teil 4
        boolean containsGemacht = spielZeug.contains("gemacht");
        boolean containsJava = spielZeug.contains("Java");
        System.out.println("Kommt das Wort \"gemacht\" im Text vor?\n" + containsGemacht);
        System.out.println("Kommt das Wort \"Java\" im Text vor?\n" + containsJava);

        //Aufgabe: Teil 5
        boolean stringVergleich = vorname.equals(nachname);
        System.out.println("Ist der Text \"" + vorname + "\" gleich wie der Text \"" + nachname + "\"?\n" + stringVergleich);

        //Aufgabe: Teil 6
        int indexErstesD = spielZeug.indexOf('d');
        System.out.println("Der Index des ersten \"d\" im Text ist: " + indexErstesD);

        //Aufgabe: Teil 7
        boolean leerPrüfung = spielZeug.isEmpty();
        System.out.println("Ist der Text leer?\n" + leerPrüfung);

        //Aufgabe: Teil 8
        boolean nullPrüfung = (spielZeug == null);
        System.out.println("Ist der Text null?\n" + nullPrüfung);

        //Aufgabe: Teil 9
        int längeDesTextes = spielZeug.length();
        System.out.println("Die Länge des Textes ist: " + längeDesTextes);

        //Aufgabe: Teil 10
        String wort1 = "sagten";
        String wort2 = "gemacht";
        String wort3 = "mehmet";
        System.out.println("Enter a word to search in the given Text:");
        Scanner sc = new Scanner(System.in);
        String wort4 = sc.nextLine();

        woerterSucher(spielZeug, wort1);
        woerterSucher(spielZeug, wort2);
        woerterSucher(spielZeug, wort3);
        woerterSucher(spielZeug, wort4);
        System.out.println();


        //Aufgabe: Vergleiche von Zeichenketten_Wiederholung
        System.out.println("Aufgabe: Vergleich von Zeichenketten_Wiederholung");
        String str1 = "Katran";
        String str2 = "Katran";
        String str3 = new String("Katran");
        String str4 = new String("Katran");
        boolean vergleich1, vergleich2, vergleich3, vergleich4; //Variablen für die Ergebnisse der Vergleiche
        vergleich1 = (str1 == str2);
        vergleich2 = str1.equals(str2);
        vergleich3 = (str3 == str4);
        vergleich4 = str3.equals(str4);
        System.out.println("\"Katran\" == \"Katran\" --> " + vergleich1);
        System.out.println("\"Katran\".equals(\"Katran\") --> " + vergleich2);
        System.out.println("new String(\"Katran\") == new String(\"Katran\") --> " + vergleich3);
        System.out.println("new String(\"Katran\").equals(new String(\"Katran\")) --> " + vergleich4);
        System.out.println();

        //Aufgabe: Wörterzählen
        System.out.println("Aufgabe: Wörterzahlen");
        String text = "Weit draußen in den unerforschten Einöden eines total aus der Mode gekommenen " +
                "Ausläufers des westlichen Spiralarms der Galaxis leuchtet unbeachtet eine kleine gelbe " +
                "Sonne. Um sie kreist in einer Entfernung von ungefähr auchtundneunzig Millionen Meilen " +
                "ein absolut unbedeutender, kleiner blaugrüner Planet, dessen vom Affen stammende " +
                "Bioformen so erstaunlich primitiv sind, daß sie Digitaluhren noch immer für eine " +
                "unwahrscheinlich tolle Erfindung halten.";
        int wörterZähler = 0;
        //Falls der Text leer ist, oder nur von Leerzeichen besteht
        if (text.trim().isEmpty() || text == null) {
            System.out.println("Im Text gibt es keine Wörter");
            //Falls im Text eigentlich Wörter gibt
        } else {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') {
                    wörterZähler++;
                }
            }
            System.out.println("Anzahl der Wörter im Text ist: " + (wörterZähler + 1));
        }
    }

    //Die Methode sucht nacht einem bestimmten Wort(gesuchtesWort) in einem Text(mainText)
    public static void woerterSucher(String mainText, String gesuchtesWort) {

        for (int i = 0; i < (mainText.length() - gesuchtesWort.length() + 1); i++) {
            String tempText = mainText.substring(i, (i + gesuchtesWort.length()));
            if (tempText.equals(gesuchtesWort)) {
                System.out.println("Das Wort \"" + gesuchtesWort + "\" befindet sich im Text innerhalb der Indizes: " +
                        i + "-" + (i + gesuchtesWort.length()));
                break;
            } else if (i == (mainText.length() - gesuchtesWort.length())) {
                System.out.println("Das gesuchte Wort \"" + gesuchtesWort + "\" ist im Text nicht zu finden.");
            }
        }
    }
}