import java.util.Scanner;

public class Longest_palindrome {
    public String longestPalindrome(String str){
        int n = str.length;
        boolean[][] isPalindrome = new boolean[n][n];
        for(int i = 0; i < n; i++){
            isPalindrome[i][i] == true;
        }

        for(int i = 0; i < n - 1; i++){
            if (str.charAt(i) == str.charAt(i + 1)) {
                isPalindrome[i][i + 1] = true;
            }
        }

        for(int len = 3; len <= n; len++){
            for(int i = 0; i < n - len; i++){
                if(str.charAt(i) == str.charAt(i + len - 1) && isPalindrome[i + 1][i + len - 2]){
                    isPalindrome[i][i + len - 1] = true;
                }
            }
        }

        int start = 0;
        int end = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if (isPalindrome[i][j] && j - i > end - start) {
                    start = i;
                    end = j;
                }
            }
        }

        return str.substring(start, end + 1);
    }

    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
            Longest_palindrome obj = new Longest_palindrome();
            System.out.print("Enter a string to find its longest palindrome substring: ");
            String input = scn.nextLine();
            String result = obj.longestPalindrome(input);
            System.out.println("Longest palindrome substring " + result);
        }
    }
}
