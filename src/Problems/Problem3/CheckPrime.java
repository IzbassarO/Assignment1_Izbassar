package Problems.Problem3;

import java.util.Scanner;

public class CheckPrime {
    public static void inputPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        System.out.println(isPrime(n, 2));
    }

    private static String isPrime(int n, int divisor) {
        if(n == divisor) {
            return "Prime";
        } else if (n % divisor == 0) {
            return "Composite";
        }
        return isPrime(n, divisor + 1);
    }
}