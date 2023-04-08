package Problems.Problem7;

public class FindPermutation {
    public static void generatePermutations(String str) {
        generatePermutationsHelper("", str);
    }

    private static void generatePermutationsHelper(String prefix, String remaining) {
        if (remaining.isEmpty()) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                generatePermutationsHelper(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1));
            }
        }
    }
}
