package homework020623.task2;

import java.util.ArrayList;
import java.util.List;

public class StringTest {
    public static void main(String[] args) {
        String string = "QWR";
        List<String> arrayString = getAllPermutations(string);
        arrayString.forEach(System.out::println);

    }

    public static List<String>  getAllPermutations(String str) {
        List<String> permutations = new ArrayList<>();
        generatePermutations("", str, permutations);
        return permutations;

    }

    public static void generatePermutations(String prefix, String remaining, List<String> permutations) {
        int length = remaining.length();
        if (length == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < length; i++) {
                generatePermutations(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, length), permutations);
            }
        }
    }
}
