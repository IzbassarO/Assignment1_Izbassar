package Problems.Problem1;

import java.util.Scanner;

public class FindMin {
    public static void input() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findMin(n, arr));
    }

    private static int findMin(int n, int[] arr) {
        if (n == 1) {
            return arr[0];
        }
        int min = findMin(n - 1, arr);
        return Math.min(min, arr[n - 1]);
    }
}
