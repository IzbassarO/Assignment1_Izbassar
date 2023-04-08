package Problems.Problem10;

import java.util.Scanner;

public class Find_GCD {
    public static int input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' and 'b' numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        return findGCD(a, b);
    }

    private static int findGCD(int a, int b) {
        if (a == b) {
            return a; // base case: when a and b are equal, return either of them as the GCD
        } else if (a > b) {
            return findGCD(a - b, b); // recursive case: if a is greater than b, subtract b from a and call the function again
        } else {
            return findGCD(a, b - a); // recursive case: if b is greater than a, subtract a from b and call the function again
        }
    }
}
