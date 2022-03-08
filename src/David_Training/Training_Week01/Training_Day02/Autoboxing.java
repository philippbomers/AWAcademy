package David_Training.Training_Week01.Training_Day02;

public class Autoboxing {
    public static void main(String[] args) {

        // Autoboxing
        int x = 3;
        Integer iInteger = x;

        double y = 5.0;
        Double dDouble = y;

        System.out.println("Mit Autoboxing: " + String.valueOf((iInteger * 4) - (dDouble / 8) + 7));

        // Extra Aufgabe mit explizitem Boxing
        Integer a = Integer.valueOf(3);
        Double b = Double.valueOf(5.0);

        double c = Double.valueOf((a.intValue() * 4) - (b.doubleValue() / 8) + 7);

        System.out.println("c = " + c);


    }
}
