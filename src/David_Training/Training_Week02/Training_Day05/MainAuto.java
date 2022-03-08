package David_Training.Training_Week02.Training_Day05;

public class MainAuto {
    public static void main(String[] args) {

        Rad[] raeder = new Rad[]{new Rad(100), new Rad(100), new Rad(100), new Rad(100)};

        Tuer[] tueren = new Tuer[]{new Tuer(150), new Tuer(150), new Tuer(150), new Tuer(150)};

        Auto Lumi = new Auto(raeder, tueren, 1000);

        System.out.println("Lumi.getGesamtGewicht() = " + Lumi.getGesamtGewicht());
    }
}
