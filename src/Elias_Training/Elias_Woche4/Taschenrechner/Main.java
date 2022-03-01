package Elias_Training.Elias_Woche4.Taschenrechner;

public class Main {

    public static void main(String[] args) {

        Taschenrechner taschenrechner = new Taschenrechner();
        taschenrechner.addition(8);
        taschenrechner.multiplication(2);
        taschenrechner.division(4);
        System.out.println("The result of the above operations: "+taschenrechner.getResult());


    }
}
