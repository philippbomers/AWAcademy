package Philipp_Training.Philipp_Woche5.day4;

public class Auto {
    private String farbe = "";
    private int leistung;
    private String nameFahrer = "";

    public Auto() {
    }

    public Auto(String nameFahrer) {
        this.nameFahrer = nameFahrer;
    }

    public Auto(String farbe, int leistung, String nameFahrer) {
        this(nameFahrer);
        this.farbe = farbe;
        this.leistung = leistung;
    }

    public static void main(String[] args) {
        Auto meinAuto = new Auto();
        System.out.println("meinAuto = " + meinAuto);

        Auto meinAuto2 = new Auto("Philipp");
        System.out.println("meinAuto2 = " + meinAuto2);

        Auto meinAuto3 = new Auto("Rot", 132, "Philipp");
        System.out.println("meinAuto3 = " + meinAuto3);
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public String getNameFahrer() {
        return nameFahrer;
    }

    public void setNameFahrer(String nameFahrer) {
        this.nameFahrer = nameFahrer;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "farbe='" + farbe + '\'' +
                ", leistung=" + leistung +
                ", nameFahrer='" + nameFahrer + '\'' +
                '}';
    }
}
