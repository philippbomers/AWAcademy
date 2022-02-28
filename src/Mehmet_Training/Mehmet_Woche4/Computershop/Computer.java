package Mehmet.Vorbereitung.Aufgaben.Mehmet_Woche4.Computershop;

public class Computer {

    //Eigenschaften
    private String herstellerName;
    private double prozessorGeschwindigkeit;
    private int arbeitsSpeicher;
    private int festPlattenGroesse;
    private int anzahlUsbPorts;
    private double bildschirmGroesse;
    private String computerTyp;
    private boolean mitBetriebsSystem;

    //Zusätzliche Eigenschaften
    private String cpuHersteller;
    private String grafikKartenHersteller;
    private int grafikKartenSpeicher;
    private boolean mitTouchScreen;
    private double gewicht;
    private double einkaufsPreis;
    private double verkaufsPreis;


    //Konstruktor(en)
    public Computer() {
    }

    public Computer(String herstellerName, double bildschirmGroesse, boolean mitBetriebsSystem) {
        this.herstellerName = herstellerName;
        this.bildschirmGroesse = bildschirmGroesse;
        this.mitBetriebsSystem = mitBetriebsSystem;
    }

    public Computer(double einkaufsPreis, double verkaufsPreis) {
        this.einkaufsPreis = einkaufsPreis;
        this.verkaufsPreis = verkaufsPreis;
    }

    //Getter/Setter

    public String getHerstellerName() {
        return herstellerName;
    }

    public void setHerstellerName(String herstellerName) {
        this.herstellerName = herstellerName;
    }

    public double getProzessorGeschwindigkeit() {
        return prozessorGeschwindigkeit;
    }

    public void setProzessorGeschwindigkeit(double prozessorGeschwindigkeit) {
        this.prozessorGeschwindigkeit = prozessorGeschwindigkeit;
    }

    public int getArbeitSpeicher() {
        return arbeitsSpeicher;
    }

    public void setArbeitSpeicher(int arbeitSpeicher) {
        this.arbeitsSpeicher = arbeitSpeicher;
    }

    public int getFestPlattenGroesse() {
        return festPlattenGroesse;
    }

    public void setFestPlattenGroesse(int festPlattenGroesse) {
        this.festPlattenGroesse = festPlattenGroesse;
    }

    public int getAnzahlUsbPorts() {
        return anzahlUsbPorts;
    }

    public void setAnzahlUsbPorts(int anzahlUsbPorts) {
        this.anzahlUsbPorts = anzahlUsbPorts;
    }

    public double getBildschirmGroesse() {
        return bildschirmGroesse;
    }

    public void setBildschirmGroesse(double bildschirmGroesse) {
        this.bildschirmGroesse = bildschirmGroesse;
    }

    public String getComputerTyp() {
        return computerTyp;
    }

    public void setComputerTyp(String computerTyp) {
        this.computerTyp = computerTyp;
    }

    public boolean isMitBetriebSystem() {
        return mitBetriebsSystem;
    }

    public void setMitBetriebSystem(boolean mitBetriebSystem) {
        this.mitBetriebsSystem = mitBetriebSystem;
    }

    public String getCpuHersteller() {
        return cpuHersteller;
    }

    public void setCpuHersteller(String cpuHersteller) {
        this.cpuHersteller = cpuHersteller;
    }

    public String getGrafikKartenHersteller() {
        return grafikKartenHersteller;
    }

    public void setGrafikKartenHersteller(String grafikKartenHersteller) {
        this.grafikKartenHersteller = grafikKartenHersteller;
    }

    public int getGrafikKartenSpeicher() {
        return grafikKartenSpeicher;
    }

    public void setGrafikKartenSpeicher(int grafikKartenSpeicher) {
        this.grafikKartenSpeicher = grafikKartenSpeicher;
    }

    public boolean isMitTouchScreen() {
        return mitTouchScreen;
    }

    public void setMitTouchScreen(boolean mitTouchScreen) {
        this.mitTouchScreen = mitTouchScreen;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public double getEinkaufsPreis() {
        return einkaufsPreis;
    }

    public void setEinkaufsPreis(double einkaufsPreis) {
        this.einkaufsPreis = einkaufsPreis;
    }

    public double getVerkaufsPreis() {
        return verkaufsPreis;
    }

    public void setVerkaufsPreis(double verkaufsPreis) {
        this.verkaufsPreis = verkaufsPreis;
    }


    //Methode(n)

    //Computereigenschaften als Text
    //Hier wird es geprüft, ob die Werte für die Variablen zugewiesen sind.
    //Eigenschaften mit den Werten "leer, null, 0 oder 0,0" werden nicht ausgegeben.

    public String toString() {
        String computerEigenschaften = "EIGENSCHAFTEN DES COMPUTERS" + "\n";
        if (herstellerName != "" && herstellerName != null) {
            computerEigenschaften = (computerEigenschaften + "Hersteller: " + herstellerName + "\n");
        }
        if (prozessorGeschwindigkeit != 0) {
            computerEigenschaften = (computerEigenschaften + "Prozessorgeschwindigkeit: " + prozessorGeschwindigkeit + "MHz\n");
        }
        if (arbeitsSpeicher != 0) {
            computerEigenschaften = (computerEigenschaften + "Arbeitsspeicher: " + arbeitsSpeicher + "GB\n");
        }
        if (festPlattenGroesse != 0) {
            computerEigenschaften = (computerEigenschaften + "Festplattenkapazität: " + festPlattenGroesse + "GB\n");
        }
        if (anzahlUsbPorts != 0) {
            computerEigenschaften = (computerEigenschaften + "Anzahl USB-Ports: " + anzahlUsbPorts + "\n");
        }
        if (bildschirmGroesse != 0) {
            computerEigenschaften = (computerEigenschaften + "Bildschirmgröße: " + bildschirmGroesse + "\"\n");
        }
        if (computerTyp != "" && computerTyp != null) {
            computerEigenschaften = (computerEigenschaften + "Computer Typ: " + computerTyp + "\n");
        }
        if (mitBetriebsSystem) {
            computerEigenschaften = (computerEigenschaften + "Betriebssystem ist vorhanden\n");
        }
        if (cpuHersteller != "" && cpuHersteller != null) {
            computerEigenschaften = (computerEigenschaften + "CPU-Hersteller: " + cpuHersteller + "\n");
        }
        if (grafikKartenHersteller != "" && grafikKartenHersteller != null) {
            computerEigenschaften = (computerEigenschaften + "GPU-Hersteller: " + grafikKartenHersteller + "\n");
        }
        if (grafikKartenSpeicher != 0) {
            computerEigenschaften = (computerEigenschaften + "Grafikkartenspeicher: " + grafikKartenSpeicher + "GB\n");
        }
        if (mitTouchScreen) {
            computerEigenschaften = (computerEigenschaften + "Touchscreen ist vorhanden\n");
        }
        if (gewicht != 0) {
            computerEigenschaften = (computerEigenschaften + "Total Gewicht: " + gewicht + "kg\n");
        }
        if (verkaufsPreis != 0) {
            computerEigenschaften = (computerEigenschaften + "Unser Preis: " + verkaufsPreis + "€\n");
        }
        return computerEigenschaften;
    }


    //Gewinn pro Computer
    //Die Methode ist zwar kurz, aber sie mach den Code mehr lesbar

    public double gewinnProComputer() {

        return verkaufsPreis - einkaufsPreis;
    }
}