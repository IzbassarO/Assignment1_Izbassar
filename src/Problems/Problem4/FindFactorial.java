package Problems.Problem4;

import java.util.Scanner;

public class FindFactorial {
    public static void findFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int fact = scanner.nextInt();
        System.out.println(factorial(fact));
    }
    public static int factorial(int fact) {
        if(fact == 1) {return 1;}
        return factorial(fact - 1) * fact;
    }
}
