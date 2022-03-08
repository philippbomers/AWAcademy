package Philipp_Training.Philipp_Woche6.Day1.Kasse;

public class Kasse {
    private int sum;

    public void bezahlen(int value) {
        if(value==0){
            this.sum = 0;
        }else{
            this.sum -= value;
        }
    }

    public void scan(Produkt produkt) {
        sum += produkt.getPreis();
    }

    public int getZwischensumme() {
        return sum;
    }
}
