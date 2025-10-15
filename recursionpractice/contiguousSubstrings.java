package recursionpractice;

public class contiguousSubstrings {
    // counts substrings starting from index 'start'
    public static int countSubstringsFrom(String s, int start, int end) {
        if (end == s.length()) {
            return 0;  // reached end of string
        }

        int count = 0;
        if (s.charAt(start) == s.charAt(end)) {
            count = 1; // found one substring that starts and ends same
        }

        // explore longer substrings starting at same 'start'
        return count + countSubstringsFrom(s, start, end + 1);
    }

    // shifts the start index across the string
    public static int countAll(String s, int start) {
        if (start == s.length()) {
            return 0;  // base case
        }

        // count all substrings beginning at 'start' + rest of the string
        return countSubstringsFrom(s, start, start) + countAll(s, start + 1);
    }

    public static void main(String[] args) {
        String s = "aba";
        System.out.println(countAll(s, 0));  // Output: 7
    }
}
