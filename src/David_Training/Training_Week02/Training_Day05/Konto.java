package David_Training.Training_Week02.Training_Day05;

public class Konto {

    private String name;
    private int stand;

    public Konto(String name, int stand) {
        this.name = name;
        this.stand = stand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStand() {
        return stand;
    }

    public void setStand(int stand) {
        this.stand = stand;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "name='" + name + '\'' +
                ", stand=" + stand +
                '}';
    }
}
