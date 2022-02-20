package Philipp_Training.Philipp_Woche3.Strings;

public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "Vergleich",
                str2 = "Vergleich",
                str3 = new String("Vergleich"),
                str4 = new String("Vergleich");

        System.out.println("String 1 und 2 wurden mit = 'text' erstellt,\n" +
                "während String 3 und 4 mit einer neuen String-Instanz erstellt wurden:\n" +
                "\nString 1 == String 2: " + (str1 == str2) +
                "\nString 2 == String 3: " + (str2 == str3) +
                "\nString 3 == String 4: " + (str3 == str4) +
                "\nString 1 equals String 2: " + (str1.equals(str2)) +
                "\nString 2 equals String 3: " + (str2.equals(str3)) +
                "\nString 3 equals String 4: " + (str3.equals(str4)) +
                "\n\nErgebnis:\n" +
                "Der ==-Operator prüft, ob es sich um den selben String (eine Objektinstanz) handelt,\n" +
                "während der equals-Operator lediglich den Inhalt vergleicht."
        );
    }
}
