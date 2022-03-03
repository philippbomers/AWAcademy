import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Operatoren {

    public static void main(String[] args) {

        //Zeiteinheiten
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Sekunden ein");
        long sekunden = scanner.nextLong();
        System.out.println("Die Zeit in Sekunden beträgt: " + sekunden);

        int sekundenProJahr = 365 * 24 * 60 * 60;   //Ein Jahr hat 365 Tage * 24 Stunden * 60 Minuten * 60 Sekunden
        int sekundenProTag = 24 * 60 * 60;          //Ein Tag hat 24 Stunden * 60 Minuten * 60 Sekunden
        int sekundenProStunde = 60 * 60;            //  Eine Stunde hat 60 Minuten * 60 Sekunden
        int sekundenProMinuten = 60;                //Eine Minute hat 60 Sekunden


        double jahre = (double) (sekunden / sekundenProJahr);
        long jahreInt = (int)jahre;
        System.out.print(jahreInt + " Jahr(e) ");

        long rest = sekunden%sekundenProJahr;
        if (rest != 0) {
            float tage = rest/sekundenProTag;
            System.out.print((int) tage + "Tage ");
        }

        long rest2 = rest%sekundenProTag;
        if (rest2 != 0){
            float stunden = rest2/sekundenProStunde;
            System.out.print((int) stunden + " Stunden ");
        }

        long rest3 = rest2%sekundenProStunde;
        if (rest3 != 0){
            float minuten = rest3/sekundenProMinuten;
            System.out.print((int) minuten + " Minuten ");
        }

        long rest4 = rest3%sekundenProMinuten;
        System.out.println(rest4 + " Sekunden");

        System.out.println();


       // Zylinder

        double pi = Math.PI;

        System.out.println("Bitte die Höhe des Zylinders eingeben (max. 2 Nachkommastellen)");
        double höheZylinder = scanner.nextDouble();
        System.out.println("Bitte den Umfang des Zylinders angeben (max. 2 Nachkommastellen");
        double umfangZylinder = scanner.nextDouble();

        //Durchmesser
        double durchMesser = umfangZylinder / pi;

        //Fläche Boden
        //double fb = pi * (d/2)*(d/2);
        double fb = (pi * (durchMesser/2) * (durchMesser/2));

        //Fläche Mantel
        double fm = umfangZylinder * höheZylinder;

        //Gesamtfläche des notwendigen Bleches
        //double fg = (2 * fb) + fm;
        double fg = ((2 * fb) + fm);
        System.out.println("Gesamtfläche: " + fg);

        //Volumen
        double v = (pi * ((durchMesser/2) * (durchMesser/2)) * höheZylinder);
        System.out.println("Volumen: " + v);

        System.out.println();


        //Eine Zeile Code

//        double x = 15.5;
//
//        double a = Math.sqrt(3.5 + x);
//        double b = a * 5;
//        double c = b / 3;
//
//        double d = x + 10;
//        double e = x - 4.1;
//        double f = d * e;
//        double g = c - f;
//
//        System.out.println(g);

        System.out.println(((double) ((Math.sqrt(3.5 + 15.5)*5)/3) - (double) ((15.5 + 10) * (15.5 - 4.1))));


        //Bonusaufgabe Metropolen
        System.out.println();

        String name = "Bielefeld";
        System.out.println("Name der Stadt: \n" + name);
        boolean istHauptstadt = false;

        System.out.println("Ist " + name + "eine Hauptstadt? (true or false?) \n" + istHauptstadt);
        int anzahlEinwohner = 210000;

        System.out.println("Wie viele Einwohner hat " + name + ": \n" + anzahlEinwohner);
        double steuerEinnahmenProEinwohner = 3000;

        System.out.println("Steuereinnahmen pro Einwohner \n" + steuerEinnahmenProEinwohner);
        double steuerEinkommen = steuerEinnahmenProEinwohner * (double)anzahlEinwohner;

        double zusätzlicheSteuern = ((1000000000 - steuerEinkommen) / anzahlEinwohner);

        if(istHauptstadt == true && anzahlEinwohner > 100000){
            System.out.println(name + " ist eine Metropole, denn sie ist eine Hauptstadt und hat "
                    + anzahlEinwohner + " Einwohner!");
        } else if (anzahlEinwohner > 200000 && steuerEinkommen >= 1000000000){
            System.out.println(name + " ist eine Metropole, denn sie hat " + anzahlEinwohner + " und mehr als "
                    + steuerEinkommen + "an jährlichen Steuereinkommen!");
        } else if (anzahlEinwohner > 200000 && steuerEinkommen < 1000000000){
            System.out.println(name + " ist keine Metropole");
            System.out.println(name + "muss seine Steuern um " + (int)zusätzlicheSteuern + " € pro Einwohner steigern," +
                    "um eine Metropole zu sein");
        } else {
            System.out.println(name + "ist keine Metropole");
        }

    }
}
