package Philipp_Training.Uebung.Peer_Group_2002;

public class AutosLogik {
    private int ps, tueren = 4;
    private String farbe = "Weiß", marke, modell;
    private boolean automatik = false, diesel = false;

    public AutosLogik (String marke, String modell){
        this.marke = marke;
        this.modell = modell;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public int getTueren() {
        return tueren;
    }

    public void setTueren(int tueren) {
        this.tueren = tueren;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String isAutomatik() {
        if(automatik)
            return "Automatikschaltung";

        return "manuelle Schaltung";
    }

    public void setAutomatik(boolean automatik) {
        this.automatik = automatik;
    }

    public String isDiesel() {
        if(this.diesel)
            return "Diesel";

        return  "Benziner";
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }

    @Override
    public String toString() {
        return "Die Werte meines Autos sind:\n" +
                "PS: " + this.getPs() +
                "\nTüren: " + this.getTueren() +
                "\nFarbe: " + this.getFarbe() +
                "\nMarke: " + this.getMarke() +
                "\nModellnummer: " + this.getModell() +
                "\nGetriebe: " + this.isAutomatik() +
                "\nKraftstoff: " + this.isDiesel()
                ;
    }
}
