package Philipp_Training.Philipp_Woche1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DataTypes {

    public static void main(String[] args) throws IOException {
        System.out.println("Hallo Welt");

        float gomezGoals = 0.4F;
        byte courseDuration = (byte) 16;
        String bonusTask = "Alle _sagten_, das geht nicht. Dann kam einer, der #WUSSTE# das nicht und hat es einfach gemacht.";

        System.out.println("\nMeine Initialien (Typ: String oder zwei Characters): " + getInitials("Philipp Bomers") +
                "\nAktuelle Einwohnerzahl in Deutschland (Typ: Integer): " + getPopulation("Germany", 8) + " (Quelle: https://countrymeters.info)" +
                "\nAktuelle Einwohnerzahl auf der Erde (Typ: Long): " + getPopulation("World", 10) + " (Quelle: https://countrymeters.info)" +
                "\nIst heute ein gerader Tag? (Typ: Boolean): " + isEvenDay(LocalDate.from(LocalDateTime.now())) +
                "\nIst gerade Tag? (Typ: Boolean): " + isDay(LocalDateTime.now()) +
                "\nTrefferquote von Mario Gomez (statistische Tore pro Spiel) bei Bayern München (Typ: Float): " + gomezGoals +
                "\nDauer in Wochen des Javakurses (Typ: Byte): " + courseDuration +
                "\nDauer in Wochen des Javakurses (Typ: Double): " + Math.PI + "(with Math.PI)" +
                "\nBonusaufgabe - vorher: " + bonusTask +
                "\nBonusaufgabe - nachher: " + formatString(bonusTask));
    }

    /**
     * checks if we have day or night
     *
     * @return Boolean isDay
     */
    private static boolean isDay(LocalDateTime dateTime) {
        Byte hour = Byte.valueOf(dateTime.format(DateTimeFormatter.ofPattern("H")));
        System.out.println(hour);
        return hour > 6 && hour < 22;
    }

    /**
     * formats words between _WORD_ to upper cases
     * and words between #WORD# to lower cases
     *
     * @return String returningString
     */
    private static String formatString(String stringToReformat) {
        StringBuilder newString = new StringBuilder();
        ArrayList<Character> specialCharacter = new ArrayList<>();
        specialCharacter.add('_');
        specialCharacter.add('#');

        boolean marker = false;
        boolean returnMarker = false;

        // iterates through every character
        for (char ch : stringToReformat.toCharArray()) {

            // when a character was set, move to the next one
            for (int i = 0; i < specialCharacter.size(); i++) {
                if (returnMarker) {
                    returnMarker = false;
                    continue;
                }

                // reformat and print characters
                if (ch == specialCharacter.get(i)) {
                    marker = !marker;
                    returnMarker = true;
                } else if (marker) {
                    switch (i) {
                        case 0 -> {
                            newString.append(Character.toUpperCase(ch));
                            returnMarker = true;
                        }
                        case 1 -> {
                            newString.append(Character.toLowerCase(ch));
                            returnMarker = true;
                        }
                    }
                } else if (specialCharacter.size() - 1 == i) {
                    newString.append(ch);
                }
            }
        }

        return newString.toString();
    }

    /**
     * Only works with first and second name with space between
     * If we would divide it into two functions with first and last name,
     * we would use "char" instead of "string".
     *
     * @return String initials
     */
    public static String getInitials(String fullName) {
        return fullName.charAt(0) + "" + fullName.charAt(fullName.indexOf(" ") + 1);
    }

    /**
     * Fetches the current population from countrymeters.info.
     * The type has to be "Object" because it returns long or int
     *
     * @return int/long population
     */
    public static Object getPopulation(String country, int lengthOfNumber) throws IOException {
        StringBuilder population = getNumbersFromWebsite("https://countrymeters.info/de/" + country, "cp1", 1, lengthOfNumber + 1);

        long varPopulation = Long.parseLong(String.valueOf(population));

        if (varPopulation <= 2147483647)
            return Integer.parseInt(String.valueOf(population));

        return varPopulation;
    }

    /**
     * calculates if given date is even or not
     *
     * @param date date
     * @return boolean isDay
     */
    public static boolean isEvenDay(LocalDate date) {
        byte day = Byte.parseByte(date.format(DateTimeFormatter.ofPattern("dd")));
        return day % 2 == 0;
    }

    /**
     * gets numbers from a specific website part
     *
     * @return StringBuilder numbersFromWebsite
     */
    public static StringBuilder getNumbersFromWebsite(String website, String containingString, int fromNumber, int lengthOfNumber) throws IOException {
        StringBuilder websiteNumbers = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        // creates connection to receive the data
        URL url = new URL(website);
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line;

        // reads every HTML line
        while ((line = br.readLine()) != null) {
            // searches for the correct div id that is called cp1
            if (line.contains(containingString)) {

                for (char ch : line.toCharArray()) {
                    if (Character.isDigit(ch)) {
                        // Collect numbers
                        numbers.append(ch);
                    }
                }
                // stops searching after it receives the value
                break;
            }
        }

        // removes unnecessary numbers
        for (int i = fromNumber; i < lengthOfNumber; i++) {
            websiteNumbers.append(numbers.charAt(i));
        }

        return websiteNumbers;
    }

}
