package Philipp_Training.Philipp_Woche5.day4;

public class LottoGenerator {
    public static void main(String[] args) {
        System.out.println("Heutige Lottoziehung");
        int i=1;
        for(int number : generateNumbers()){
            System.out.println("Ziehung "+(i++)+": " + number);
        }
    }

    public static int[] generateNumbers(){
        int[] numberArray = new int[6];
        int number;
        boolean doubleNumber = false;
        //6 Zahlen 1-49
        for (int i = 0; i < 6; i++) {
            while(true){
                number = (int) (Math.random()*49);
                for(int oldNumber : numberArray){
                    if(number==oldNumber) doubleNumber=true;
                }
                if(!doubleNumber){
                    numberArray[i] = number;
                    break;
                }
                doubleNumber = false;
            }

        }
        return numberArray;
    }

}
