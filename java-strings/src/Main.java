import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] res = deleteNth(new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3);
        Arrays.stream(res).forEach(e -> System.out.println(e));
        // System.out.println(res);
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        return Arrays.stream(elements)
                .distinct()
                .mapToObj(e -> Arrays.stream(elements).filter(el -> el == e)
                        .limit(maxOccurrences))
                .reduce((a, b) -> IntStream.concat(a, b))
                .orElse(IntStream.of(new int[]{}))
                .toArray();
    }

    public static boolean isIsogram(String str) {
        return str.toLowerCase().chars().distinct().count() == str.length();
    }

    public static long findNextSquare(long sq) {
        long root = (long) Math.sqrt(sq);
        return root * root == sq ? (root + 1) * (root + 1) : -1;
    }

    /**
     * A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
     * <p>
     * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
     *
     * @param sentence
     * @return
     */
    public static boolean DetectPangram(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        String[] cahrs = sentence.split("");
        for (String e : cahrs) {
            String small = e.toLowerCase();
            if (alphabet.contains(small) && sb.indexOf(small) < 0) {
                sb.append(small);
            }
        }
        return alphabet.length() == sb.length();
    }

    public static boolean DetectPangram2(String sentence) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (!sentence.toLowerCase().contains("" + c)) return false;
        }
        return true;
    }

    public static boolean DetectPangram3(String sentence) {
        return sentence.chars()
                .map(Character::toLowerCase)
                .filter(Character::isAlphabetic)
                .distinct()
                .count() == 26;
    }

    public static int findShort(String s) {
        return Stream.of(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }


}
