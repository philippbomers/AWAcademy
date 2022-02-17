package Christian_Training.Christian_Woche2.Loops;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie hoch soll der Baum sein?");
        int hoehe = scanner.nextInt();

        for (int i = 0; i < hoehe; i++ ){
            // linke Seite
            String linkeSeite = "";
            for (int j = 0; j < hoehe; j++){
                if (j < hoehe - i){
                    linkeSeite += " ";
                } else {
                    linkeSeite += "*";
                }
            }
            // rechte Seite
            String rechteSeite = "";
            for (int k = 0; k <= i; k++){
                rechteSeite += "*";
            }

            String zeile = linkeSeite + rechteSeite ;
            System.out.println(zeile);
        }
        String baumStamm = "";
        for (int s = 0; s <= hoehe; s++){
            if (s < hoehe ){
                baumStamm += " ";
            } else {
                baumStamm += "I";
            }
        }
        System.out.println(baumStamm);
    }

}

