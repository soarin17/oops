
// KMP solves an important problem in the Naive algorithm.

// Basic idea
// When a mismatch happens, Naive starts comparing again from the beginning.

// But KMP remembers information about previously matched characters.

// It uses something called an LPS array.

// LPS stands for:

// Longest Proper Prefix which is also a Suffix.

// What is a prefix and suffix?

// Consider:

// String s = "ABAB";

// Prefix: A, AB, ABA
// Suffix: B, AB, BAB

// The common prefix and suffix is:AB

// Therefore:LPS = 2

// Let's calculate the LPS array for "ABAB":

// Explanation:

// A → No matching prefix and suffix → 0

// AB → No matching prefix and suffix → 0

// ABA → A matches A → 1

// ABAB → AB matches AB → 2

// Why do we need LPS?
// Suppose we matched some characters but encountered a mismatch.

// Instead of going back to the beginning, KMP uses the LPS value to decide where to continue.

// This saves unnecessary comparisons.



public class KMP {

        static void computeLPS(String pattern, int[] lps) {

        int len = 0;
        int i = 1;

        lps[0] = 0;

        while (i < pattern.length()) {

            if (pattern.charAt(i) == pattern.charAt(len)) {

                len++;
                lps[i] = len;
                i++;

            } else {

                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    static void KMPSearch(String text, String pattern) {

    int n = text.length();
    int m = pattern.length();

    int[] lps = new int[m];

    computeLPS(pattern, lps);

    int i = 0;
    int j = 0;

    while (i < n) {

        if (text.charAt(i) == pattern.charAt(j)) {
            i++;
            j++;
        }

        if (j == m) {

            System.out.println("Pattern found at index: "
                               + (i - j));

            j = lps[j - 1];

        } else if (i < n &&
                   text.charAt(i) != pattern.charAt(j)) {

            if (j != 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }
    }
}

    // Put computeLPS() and KMPSearch() here

    public static void main(String[] args) {

        String text = "ABABCABAB";
        String pattern = "ABAB";

        KMPSearch(text, pattern);
    }
}