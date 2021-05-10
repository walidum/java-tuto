public class Main {
    public static void main(String[] args) {
        boolean res = DetectPangram("The quick brown fox jumps over the lazy dog.");
        System.out.println(res);
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
}
