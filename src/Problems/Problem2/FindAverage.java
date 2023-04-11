package Problems.Problem2;

import java.util.Scanner;

public class FindAverage {
    public static void average() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of elements: ");

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(findAverage(arr, n));
    }
    private static double findAverage(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        double sum = findAverage(arr, n - 1) + arr[n - 1]; // corrected sum calculation
        return sum / n;
    }
}
