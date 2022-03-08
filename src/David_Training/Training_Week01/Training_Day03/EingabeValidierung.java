package David_Training.Training_Week01.Training_Day03;

public class EingabeValidierung {
    public static void main(String[] args) {

        String kurzerText = "Hallo";                            // Index 0
        String langerText = "HierEinLangerText";                // Index 1
        String alternativerString = "21(Muenchen)istHier:";     // Index 2
        String allesGroß = "DAVID";                             // Index 3
        String fastAllesOK = "00 (NUERNBERGUNDMUENCHEN):";      // Index 4
        String leererString = "";                               // Index 5
        String einZeichen = "A";                                // Index 6

        String[] stringArray = new String[] {kurzerText, langerText, alternativerString, allesGroß, fastAllesOK, leererString, einZeichen};

        String testString = stringArray[5];

        // Aufgabe 1:
        System.out.println("Aufgabe 1: ");
        if (testString.length() > 10) {
            System.out.println("Eingabefehler");
        } else {
            System.out.println("OK");
        }

        // Aufgabe 2:
        System.out.println("\nAufgabe 2: ");
        System.out.println("Bedingung 1: ");
        if (testString.length() > 5) {
            System.out.println("OK");
        } else {
            System.out.println("Eingabefehler");
        }

        System.out.println("Bedingung 2: ");
        if (testString.length() > 3 && testString.length() < 9) {
            System.out.println("OK");
        } else {
            System.out.println("Eingabefehler");
        }

        System.out.println("Bedingung 3: ");
        try {
            if (Character.isDigit(testString.charAt(0)) && Character.isDigit(testString.charAt(1))) {
                System.out.println("OK");
            } else {
                System.out.println("Eingabefehler");
            }
        } catch (Exception e){
            System.out.println("Das können wir nicht überprüfen!");
        }

        System.out.println("Bedingung 4: ");
        if (testString.toLowerCase().contains("chen")) {
            System.out.println("OK");
        } else {
            System.out.println("Eingabefehler");
        }

        System.out.println("Bedingung 5: ");
        try {
            if (testString.charAt(testString.length()-1) == ':') { // Alternative Methode: String.endsWith()
                System.out.println("OK");
            } else {
                System.out.println("Eingabefehler");
            }
        } catch (Exception e) {
            System.out.println("Das können wir nicht überprüfen!");
        }

        System.out.println("Bedingung 6: ");
        if (testString.equals(testString.toUpperCase())) {
            System.out.println("OK");
        } else {
            System.out.println("Eingabefehler");
        }

        System.out.println("Bedingung 7: ");
        if (testString.contains("(") && testString.contains(")")
                && testString.indexOf('(') < testString.indexOf(')')) {
            System.out.println("OK");
        } else {
            System.out.println("Eingabefehler");
        }
    }
}
