package Philipp_Training.Philipp_Woche3.Strings;

public class CountWords {
    public static void main(String[] args) {
        String text = "Weit draußen in den unerforschten Einöden eines total aus der Mode gekommenen " +
                "Ausläufers des westlichen Spiralarms der Galaxis leuchtet unbeachtet eine kleine gelbe " +
                "Sonne. Um sie kreist in einer Entfernung von ungefähr auchtundneunzig Millionen Meilen " +
                "ein absolut unbedeutender, kleiner blaugrüner Planet, dessen vom Affen stammende " +
                "Bioformen so erstaunlich primitiv sind, daß sie Digitaluhren noch immer für eine " +
                "unwahrscheinlich tolle Erfindung halten.";
        System.out.println("Der Text hat " + countWords(text) + " Wörter.");
    }

    public static int countWords(String text) {
        if (text == null || text.isEmpty())
            return 0;

        String[] words = text.split("\\s+");
        return words.length;
    }
}
