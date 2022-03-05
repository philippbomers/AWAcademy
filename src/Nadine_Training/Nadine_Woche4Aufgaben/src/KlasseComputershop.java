public class KlasseComputershop {

    //Eigenschaften
    private String herstellername;
    private int prozessorgeschwindigkeitMhZ;
    private int arbeitsspeicherGB;
    private int festplattengrößteGB;
    private byte anzahlUSBPorts;
    private int bildschirmgrößeInZoll;
    private String computertyp;
    private boolean vorinstalliertesBetriebssystem;
    private double einkaufsPreis;
    private double verkaufsPreis;
    private double gewinn;
    private String einkaufskaufdatum;
    private String prozessor;
    private KlasseComputershop[] computer;


    //Konstruktor
    public KlasseComputershop(){

    }

    public KlasseComputershop(String herstellername, int bildschirmgrößeInZoll, boolean vorinstalliertesBetriebssystem){
    this.herstellername = herstellername;
    this.bildschirmgrößeInZoll = bildschirmgrößeInZoll;
    this.vorinstalliertesBetriebssystem = vorinstalliertesBetriebssystem;
    }

    //Methoden

    public static void einfuegen(){

    }


    @Override
    public String toString() {
        return "KlasseComputershop{" +
                "herstellername='" + herstellername + '\'' +
                ", prozessorgeschwindigkeitMhZ=" + prozessorgeschwindigkeitMhZ +
                ", arbeitsspeicherGB=" + arbeitsspeicherGB +
                ", festplattengrößteGB=" + festplattengrößteGB +
                ", anzahlUSBPorts=" + anzahlUSBPorts +
                ", bildschirmgrößeInZoll=" + bildschirmgrößeInZoll +
                ", computertyp='" + computertyp + '\'' +
                ", vorinstalliertesBetriebssystem=" + vorinstalliertesBetriebssystem +
                ", einkaufsPreis=" + einkaufsPreis +
                ", verkaufsPreis=" + verkaufsPreis +
                ", gewinn=" + gewinn +
                ", einkaufskaufdatum='" + einkaufskaufdatum + '\'' +
                ", prozessor='" + prozessor + '\'' +
                '}';
    }

    public int doSpeicherErweiterung(){
        arbeitsspeicherGB *= 2;
        return arbeitsspeicherGB;
    }


    public String getHerstellername() {
        return herstellername;
    }

    public void setHerstellername(String herstellername) {
        this.herstellername = herstellername;
    }

    public int getProzessorgeschwindigkeitMhZ() {
        return prozessorgeschwindigkeitMhZ;
    }

    public void setProzessorgeschwindigkeitMhZ(int prozessorgeschwindigkeitMhZ) {
        this.prozessorgeschwindigkeitMhZ = prozessorgeschwindigkeitMhZ;
    }

    public int getArbeitsspeicherGB() {
        return arbeitsspeicherGB;
    }

    public void setArbeitsspeicherGB(int arbeitsspeicherGB) {
        this.arbeitsspeicherGB = arbeitsspeicherGB;
    }

    public int getFestplattengrößteGB() {
        return festplattengrößteGB;
    }

    public void setFestplattengrößteGB(int festplattengrößteGB) {
        this.festplattengrößteGB = festplattengrößteGB;
    }

    public byte getAnzahlUSBPorts() {
        return anzahlUSBPorts;
    }

    public void setAnzahlUSBPorts(byte anzahlUSBPorts) {
        this.anzahlUSBPorts = anzahlUSBPorts;
    }

    public int getBildschirmgrößeInZoll() {
        return bildschirmgrößeInZoll;
    }

    public void setBildschirmgrößeInZoll(int bildschirmgrößeInZoll) {
        this.bildschirmgrößeInZoll = bildschirmgrößeInZoll;
    }

    public String getComputertyp() {
        return computertyp;
    }

    public void setComputertyp(String computertyp) {
        this.computertyp = computertyp;
    }

    public boolean isVorinstalliertesBetriebssystem() {
        return vorinstalliertesBetriebssystem;
    }

    public void setVorinstalliertesBetriebssystem(boolean vorinstalliertesBetriebssystem) {
        this.vorinstalliertesBetriebssystem = vorinstalliertesBetriebssystem;
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

    public double getGewinn() {
        gewinn = verkaufsPreis - einkaufsPreis;
        return gewinn;
    }

    public String getEinkaufskaufdatum() {
        return einkaufskaufdatum;
    }

    public void setEinkaufskaufdatum(String einkaufskaufdatum) {
        this.einkaufskaufdatum = einkaufskaufdatum;
    }

    public String getProzessor() {
        return prozessor;
    }

    public void setProzessor(String prozessor) {
        this.prozessor = prozessor;
    }
}
