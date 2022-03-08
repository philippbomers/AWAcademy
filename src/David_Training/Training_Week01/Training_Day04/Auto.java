package David_Training.Training_Week01.Training_Day04;

public class Auto {

    private String farbe;
    private int leistung;
    private String nameFahrer;

    // Konstruktoren
    public Auto() {
        this.farbe = "";
        this.leistung = 0;
        this.nameFahrer = "";
    }

    public Auto(String nameFahrer) {
        this.farbe = "";
        this.leistung = 0;
        this.nameFahrer = nameFahrer;
    }

    public Auto(String farbe, int leistung, String nameFahrer) {
        this.farbe = farbe;
        this.leistung = leistung;
        this.nameFahrer = nameFahrer;
    }

    // Getter-Methoden
    public String getFarbe() {
        return farbe;
    }

    public int getLeistung() {
        return leistung;
    }

    public String getNameFahrer() {
        return nameFahrer;
    }

    // toString() Methode
    @Override
    public String toString() {
        return "Auto{" +
                "farbe='" + farbe + '\'' +
                ", leistung=" + leistung +
                ", nameFahrer='" + nameFahrer + '\'' +
                '}';
    }
}
