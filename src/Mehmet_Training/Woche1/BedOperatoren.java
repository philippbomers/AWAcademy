package Mehmet_Training.Woche1;

public class BedOperatoren {
    public static void main(String[] args) {

        //Aufgabe 1
        System.out.println("Aufgabe 1");
        for (int i = 0; i < 100; i++) {
            if (!(i < 5 || i > 10)) {
                System.out.println(i);
            }
        }

        //Aufgabe 2
        System.out.println("Aufgabe 2");
        for (int i = 0; i < 100; i++) {
            if (!(i < 5 || i > 10 && i != 42)) {
                System.out.println(i);
            }
        }

    }
}
