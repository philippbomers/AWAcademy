package David_Training.Training_Week02.Training_Day06;

import static java.lang.Character.getNumericValue;

public class BonusAufgabeZaehlen {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i%2 == 0 && i%3 == 0 && i%5 == 0) {
                System.out.println("DampfSchiffFahrt");
            } else if (i%2 == 0 && i%3 == 0) {
                System.out.println("DampfSchiff");
            } else if (i%3 == 0 && i%5 == 0) {
                System.out.println("SchiffFahrt");
            } else {
                System.out.println(zahlZuWort(i));
            }
        }

    }

    private static String zahlZuWort(int zahl) {

        String[] einer =
                {"", "ein", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun"};
        String[] zehner =
                {"", "zehn", "zwanzig", "dreißig", "vierzig", "fünfzig", "sechzig", "siebzig", "achtzig", "neunzig"};

        switch (zahl) {
            case 1:
                return "eins";
            case 11:
                return "elf";
            case 12:
                return "zwölf";
            case 16:
                return "sechzehn";
            case 17:
                return "siebzehn";
            case 100:
                return "einhundert";
        }

        if (zahl >= 10) {
            String zahlString = Integer.toString(zahl);

            // Alternative: Integer zahlEiner = Integer.parseInt(String.valueOf(zahlString.charAt(1)));
            int zahlEiner = getNumericValue(zahlString.charAt(1));
            int zahlZehner = getNumericValue(zahlString.charAt(0));

            if (zahlEiner == 0) {
                return zehner[zahlZehner];
            } else if (zahl < 20) {
                return einer[zahlEiner] + zehner[zahlZehner];
            } else {
                return einer[zahlEiner] + "und" + zehner[zahlZehner];
            }
        } else {
            return einer[zahl];
        }

    }

}
