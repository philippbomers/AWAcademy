package Philipp_Training.Philipp_Woche6.Day1.SchonWiederEineAutoAufgabe;

public class SchonWiederEinAuto {
    private final Rad[] raeder;
    private final Tuer[] tueren;
    private final float gewicht;

    public SchonWiederEinAuto(Rad[] raeder, Tuer[] tueren, float gewicht) {
        this.raeder = raeder;
        this.tueren = tueren;
        this.gewicht = gewicht;
    }

    public double getGesamtGewicht() {
        double gesamtGewicht = this.getGewicht();

        for (Rad rad : this.raeder) {
            gesamtGewicht += rad.getGewicht();
        }
        for (Tuer tuer : this.tueren) {
            gesamtGewicht += tuer.getGewicht();
        }

        return gesamtGewicht;
    }

    private double getGewicht() {
        return this.gewicht;
    }
}
