package Problems.Problem6;

import java.util.Scanner;

public class FindPower {
    public static void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        double n = scanner.nextInt();
        System.out.print("Enter power: ");
        int power = scanner.nextInt();
        System.out.println(findPower(n, power));
    }
    private static double findPower(double n, int power) {
        if (power == 0) {
            return 1;
        }

        if (power < 0) {
            n = 1 / n;
            power = -power;
        }

        if (power % 2 == 0) {
            return findPower(n * n, power / 2);
        } else {
            return n * findPower(n * n, (power - 1) / 2);
        }
    }
}
