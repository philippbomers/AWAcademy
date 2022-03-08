package Philipp_Training.Philipp_Woche6.Day1.SchonWiederEineAutoAufgabe;

public class SchonWiederEinAutoMain {
    public static void main(String[] args) {

        Tuer[] tueren1 = {
                new Tuer(10.3),
                new Tuer(10.4)
        };

        Rad[] raeder1 = {
                new Rad(10.2),
                new Rad(10),
                new Rad(10),
                new Rad(10.1)
        };
        SchonWiederEinAuto Auto1 = new SchonWiederEinAuto(raeder1, tueren1, 1203.44f);
        System.out.printf("%.2f", Auto1.getGesamtGewicht());
        System.out.println();

        Tuer[] tueren2 = {
                new Tuer(150),
                new Tuer(150),
                new Tuer(150),
                new Tuer(150)
        };

        Rad[] raeder2 = {
                new Rad(100),
                new Rad(100),
                new Rad(100),
                new Rad(100)
        };
        SchonWiederEinAuto Auto2 = new SchonWiederEinAuto(raeder2, tueren2, 1000F);
        System.out.println("Beispielaufgabe: " + Auto2.getGesamtGewicht());
    }
}
