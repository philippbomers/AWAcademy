package Philipp_Training.Philipp_Woche3.Strings;

public class StringMethods {

    public static void main(String[] args) {
        String myString = "Alle sagten, das geht nicht. Dann kam einer, " +
                "der wusste das nicht und hat es einfach gemacht.",
                firstName = "Philipp",
                lastName = "Bomers",
                secondString = "Alle sagten, das geht nicht. Dann kamen zwei, " +
                        "die wussten das nicht und haben es einfach gemacht.";

        System.out.println(
                "1. Großbuchstaben:" + findUppercaseLetters(myString) +
                        "\n2. Vergleiche mit Namen: Mein Name hat " +
                        compareWithName(firstName + " " + lastName, myString) + " Wörter weniger als der String." +
                        "\n3. Vor- und Nachname verketten: " + firstName.concat(lastName) +
                        "\n4.1 Suche nach 'gemacht': " + myString.contains("gemacht") +
                        "\n4.2 und 'Java': " + myString.contains("Java") +
                        "\n5. Vergleiche zwei Strings: " + myString.equals(secondString) +
                        "\n6. Index von 'd': " + myString.indexOf('d') +
                        "\n7. Prüfe auf Leerstring: " + myString.isEmpty() +
                        "\n8. Prüfe auf null: " + (myString == null) +
                        "\n9. Länge des Textes: " + myString.length() +
                        "\n10. Lese die Wörter 'sagten' und 'gemacht' aus: " + myString.substring(5, 11) + "\n" +
                        myString.substring(myString.length() - 9, myString.length() - 1)
        );
    }

    private static int compareWithName(String name, String myString) {
        int numberOfWords = myString.compareTo(name);
        return numberOfWords * (-1);
    }

    public static String findUppercaseLetters(String myString) {
        StringBuilder letters = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (Character.isUpperCase(c)) {
                letters.append(c);
            }
        }
        return letters.toString();
    }
}
