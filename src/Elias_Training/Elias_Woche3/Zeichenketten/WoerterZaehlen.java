package Elias_Training.Elias_Woche3.Zeichenketten;

public class WoerterZaehlen {
    public static void main(String[] args) {

        String text = "Weit draußen in den unerforschten Einöden eines total " +
                "aus der Mode gekommenen " +
                "Ausläufers des westlichen Spiralarms der Galaxis leuchtet " +
                "unbeachtet eine kleine gelbe " +
                "Sonne. Um sie kreist in einer Entfernung von ungefähr " +
                "auchtundneunzig Millionen Meilen " +
                "ein absolut unbedeutender, kleiner blaugrüner Planet, dessen " +
                "vom Affen stammende " +
                "Bioformen so erstaunlich primitiv sind, daß sie Digitaluhren " +
                "noch immer für eine " +
                "unwahrscheinlich tolle Erfindung halten.";

        String anzahlWoerter[] = text.split(" ");
        System.out.println("Anzahl der Wörter im Text: "+anzahlWoerter.length);
    }
}
