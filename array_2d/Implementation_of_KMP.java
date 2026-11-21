import java.util.Scanner;

public class Implementation_of_KMP {
    void kmpsearch(String pat, String txt){
        int M = pat.length();
        int N = txt.length();
        int[] lps = new int[M];
        int j = 0;
        computeLPSarray(pat, M, lps);
        int i = 0;
        while(i < N){
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                System.out.println("Found pattern at " + (i - j));
            }
            else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                }else
                    i = i + 1;                
            }
        }
    }

    void computeLPSarray(String pat, int M, int[] lps){
        int len = 0;
        int i = 1;
        lps[0] = 0;
        while(i < M){
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else{
                if (len != 0) {
                    len = lps[len - 1];
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the text to search in: ");
        String txt = scn.nextLine();
        System.out.print("Enter the pattern to search for");
        String pat = scn.nextLine();
        new Implementation_of_KMP().kmpsearch(pat, txt);
    }
}
