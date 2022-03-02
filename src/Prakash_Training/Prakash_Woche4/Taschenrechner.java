package Prakash_Training.Prakash_Woche4;

public class Taschenrechner {
    private int ergebnis;
    public Taschenrechner(){ergebnis=0; }

    /**
     *This Method adds a to the final result
     *
     * @param a input the integer a to add with result
     * @return returns the sum after adding result with a
     */
    public int plus(int a){
        System.out.println(ergebnis+" Plus "+a+" = "+(ergebnis+a));
        return ergebnis=ergebnis+a;
    }
    public int minus(int a){
        System.out.println(ergebnis+" Minus "+a+" = "+(ergebnis-a));
        return ergebnis=ergebnis-a;
    }public int mal(int a){
        System.out.println(ergebnis+" Mal "+a+" = "+(ergebnis*a));
        return ergebnis=ergebnis*a;
    }public int geteilt(int a){
        if (a==0){
            System.out.println(ergebnis+" Geteilt "+a);
            System.out.println("Teilen durch 0 ist nicht möglich");
            return ergebnis;
        }else {
            System.out.println(ergebnis+" Geteilt "+a+" = "+(ergebnis/a));
            return ergebnis = ergebnis / a;
        }
    }
    public int getErgebnis() {
        return ergebnis;
    }
}