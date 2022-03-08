package David_Training.Training_Week01.Training_Day03;

public class FizzBuzz {
    public static void main(String[] args) {
        // Fizz durch 3
        // Buzz durch 5
        // FizzBuzz wenn durch 3 & durch 5
        // Ansonsten die Zahl

        for (int i = 0; i <= 100; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


    }
}
