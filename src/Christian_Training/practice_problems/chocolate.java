package Christian_Training.practice_problems;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        boolean divisible = false;

        for (int i = 1; i <= n; i ++){
            if ( i * m == k){
                divisible = true;
                break;
            }
        }
        for (int j = 1; j <= m; j++){
            if (j * n == k){
                divisible = true;
                break;
            }
        }

        if (divisible){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
