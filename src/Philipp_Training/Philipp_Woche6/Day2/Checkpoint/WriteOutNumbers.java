package Philipp_Training.Philipp_Woche6.Day2.Checkpoint;

public class WriteOutNumbers {
    public static void main(String[] args) {
        //Die Methode soll Zahlen von 1 bis 100 in das entsprechende Zahlwort übersetzen, zum Beispiel:
        for (int i = 1; i <= 100; i++) {
            System.out.println(zahlZuWort(i));
        }
    }

    //Erstelle eine statische (static) Methode zahlZuWort, welche eine Zahl (int) als Parameter erwartet und einen String zurück gibt.
    public static String zahlZuWort(int number) {
        String word;

        //Hierbei solltest du nicht 100 verschiedene if oder switch/case Anweisungen erstellen sondern ähnliche Fälle
        String[] einer = {"ein", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun"};
        String[] zehner = {"zehn", "zwanzig", "dreißig", "vierzig", "fünfzig", "sechzig", "siebzig", "achtzig", "neunzig"};

        if (number == 1) {
            word = "eins";
        } else if (number < 10) {
            word = einer[number - 1];
        } else if (number == 100) {
            word = "einhundert";
        } else if (number % 10 == 0) {
            word = zehner[number / 10 - 1];
        } else {
            String zehnerString = zehner[Math.abs(number / 10 - 1)];
            if (number < 20) {
                word = switch (number) {
                    case 11 -> "elf";
                    case 12 -> "zwölf";
                    default -> einer[(number - 1) % 10] + zehnerString;
                };
            } else {
                word = einer[(number - 1) % 10] + "und" + zehnerString;
            }
        }

        return word.replaceFirst(word.substring(0, 1), word.substring(0, 1).toUpperCase());
    }
}
