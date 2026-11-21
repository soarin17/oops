// Basic idea
// Instead of comparing every character immediately, Rabin-Karp compares the hash values of the pattern and text windows.

// A hash is a numerical representation of a string.

// for example:

// Pattern = "ABC"

// Hash    = 123

// Suppose a part of the text also has hash 123.

// Then we compare the actual characters to confirm whether they match.

// # Why compare actual characters?

// Because two different strings can sometimes have the same hash. This is called a hash collision.

// # How does it work?

// String text = "ABCDE";
// String pattern = "CD";

// We take windows of length 2:

// AB

// BC

// CD

// DE

public class RabinKarp {

    static final int d = 256;
    static final int q = 101;

    static void search(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        if (m == 0 || m > n) {
            return;
        }

        int p = 0; // Pattern hash
        int t = 0; // Text window hash
        int h = 1;

        // Calculate d^(m-1) % q
        for (int i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }

        // Calculate initial hashes
        for (int i = 0; i < m; i++) {

            p = (d * p + pattern.charAt(i)) % q;

            t = (d * t + text.charAt(i)) % q;
        }

        // Slide the pattern over the text
        for (int i = 0; i <= n - m; i++) {

            // Check hash values
            if (p == t) {

                // Verify actual characters
                int j;

                for (j = 0; j < m; j++) {

                    if (text.charAt(i + j) !=
                        pattern.charAt(j)) {
                        break;
                    }
                }

                if (j == m) {
                    System.out.println(
                        "Pattern found at index: " + i
                    );
                }
            }

            // Calculate next window hash
            if (i < n - m) {

                t = (d * (t -
                     text.charAt(i) * h)
                     + text.charAt(i + m)) % q;

                if (t < 0) {
                    t += q;
                }
            }
        }
    }

    public static void main(String[] args) {

        String text = "ABCDE";
        String pattern = "CD";

        search(text, pattern);
    }
}
