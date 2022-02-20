package Philipp_Training.Philipp_Woche4.Classes_And_Objects.Autos;

public class AutosLogik {
    private int ps, tueren;
    private String farbe, marke, modell;
    private boolean automatik, diesel;

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

    public boolean isAutomatik() {
        return automatik;
    }

    public void setAutomatik(boolean automatik) {
        this.automatik = automatik;
    }

    public String isDiesel() {
        if(this.diesel)
            return "Das Auto ist ein Diesel";
        else
            return  "Das Auto ist ein Benziner";
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }

    @Override
    public String toString() {
        return "Die Werte meines Autos sind:\n" +
                "PS: =" + ps +
                "\n tueren=" + tueren +
                "\n  farbe='" + farbe + '\'' +
                "\n  marke='" + marke + '\'' +
                "\n  Modellnummer ='" + modell + '\'' +
                "\n  automatik=" + automatik +
                "\n  diesel=" + this.isDiesel()
                ;
    }
}
