package Problems.Problem8;

import java.util.Scanner;

public class StringOfDigits {
    public static String inputParameters() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return (isNumeric(str)) ? "True" : "False";
    }

    private static boolean isNumeric(String number) {
        if (number.isEmpty()) {return true;}
        if (!Character.isDigit(number.charAt(0))) {return false;}

        return isNumeric(number.substring(1));
    }
}
