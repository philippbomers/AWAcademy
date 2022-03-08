package David_Training.Training_Week01.Training_Day02;

public class BedingteOperatoren {
    public static void main(String[] args) {

        // Aufgabe 1
        System.out.println("Aufgabe 1: ");
        for(int i = 0; i < 100; i++) {
            //if(i >= 5 && i <=10) {
            //    System.out.println(i);
            //}

            if(!(i < 5 || i >10)) {
                System.out.println(i);
            }
        }

        // Aufgabe 2
        System.out.println("\nAufgabe 2: ");
        for(int i = 0; i < 100; i++) {
            //if((i >= 5 && i <=10) || i == 42) {
            //    System.out.println(i);
            //}

            if((i >= 5 && i <=10) || !(i != 42)) {
                System.out.println(i);
            }
        }


    }
}
