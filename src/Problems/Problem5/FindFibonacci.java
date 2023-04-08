package Problems.Problem5;

import java.util.Scanner;

public class FindFibonacci {
    public static void inputIndexOfFibonacciNumber() {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        System.out.println(fibonacci(index));
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
