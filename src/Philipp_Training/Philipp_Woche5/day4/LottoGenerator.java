package Philipp_Training.Philipp_Woche5.day4;

public class LottoGenerator {
    public static void main(String[] args) {
        System.out.println("Heutige Lottoziehung");
        int i = 1;
        int[] lottoNumbers = generateNumbers();
        for (int number : lottoNumbers) {
            System.out.println("Ziehung " + (i++) + ": " + number);
        }

        int[] myNumbers = new int[]{1, 2, 3, 4, 5};
        System.out.println("Du hast " + getCorrectNumbers(myNumbers, lottoNumbers) + " richtige Zahlen geraten");
    }

    public static int[] generateNumbers() {
        int[] numberArray = new int[6];
        int number;
        boolean doubleNumber = false;
        //6 Zahlen 1-49
        for (int i = 0; i < numberArray.length; i++) {
            while (true) {
                number = (int) (Math.random() * 49) + 1;
                for (int oldNumber : numberArray) {
                    if (number == oldNumber) {
                        doubleNumber = true;
                        break;
                    }
                }
                if (!doubleNumber) {
                    numberArray[i] = number;
                    break;
                }
                doubleNumber = false;
            }

        }
        return numberArray;
    }

    public static int getCorrectNumbers(int[] myNumbers, int[] lottoNumbers) {
        int correctNumbers = 0;
        for (int lottoNumber : lottoNumbers) {
            for (int myNumber : myNumbers) {
                if (myNumber == lottoNumber) correctNumbers++;
            }
        }
        return correctNumbers;
    }
}
