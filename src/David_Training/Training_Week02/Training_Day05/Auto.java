package David_Training.Training_Week02.Training_Day05;

public class Auto {

    private Rad[] raeder;
    private Tuer[] tueren;
    private float gewicht;

    public Auto(Rad[] raeder, Tuer[] tueren, float gewicht) {
        this.raeder = raeder;
        this.tueren = tueren;
        this.gewicht = gewicht;
    }

    public float getGesamtGewicht() {

        // TODO Implementiere die Ermittlung des Gewichtes
        float gesamtGewicht = 0F;

        for(Rad rad : raeder) {
            gesamtGewicht += rad.getGewicht();
        }

        for(Tuer tuer : tueren) {
            gesamtGewicht += tuer.getGewicht();
        }

        gesamtGewicht += this.gewicht;

        return gesamtGewicht;
    }
}
