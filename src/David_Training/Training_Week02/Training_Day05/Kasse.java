package David_Training.Training_Week02.Training_Day05;

public class Kasse {

    private int zwischensumme = 0;

    public void scan(Produkt produkt) {
        zwischensumme += produkt.getPreis();
    }

    public int getZwischensumme() {
        return this.zwischensumme;
    }

    public int bezahlen() {
        int returnVar = this.getZwischensumme();
        this.zwischensumme = 0;

        return returnVar;
    }

    public int bezahlen(int geld) {
        int returnVar = this.getZwischensumme() - geld;
        this.zwischensumme = 0;

        return returnVar;
    }
}
