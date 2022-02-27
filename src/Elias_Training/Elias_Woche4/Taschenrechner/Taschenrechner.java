package Elias_Training.Elias_Woche4.Taschenrechner;

public class Taschenrechner {

    private int result;

    public Taschenrechner(){
        this.result = 0;
    }

    public int addition(int num){
        return result+=num;
    }

    public int subtraction(int num){
        return result-=num;
    }

    public int multiplication(int num){
        return result*=num;
    }

    public int division(int num){
        return result/=num;
    }

    public int getResult() {
        return result;
    }
}
