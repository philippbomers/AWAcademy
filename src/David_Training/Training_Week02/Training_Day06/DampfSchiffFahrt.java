package David_Training.Training_Week02.Training_Day06;

public class DampfSchiffFahrt {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i%2 == 0 && i%3 == 0 && i%5 == 0) {
                System.out.println("DampfSchiffFahrt");
            } else if (i%2 == 0 && i%3 == 0) {
                System.out.println("DampfSchiff");
            } else if (i%3 == 0 && i%5 == 0) {
                System.out.println("SchiffFahrt");
            } else {
                System.out.println(i);
            }
        }
    }
}
