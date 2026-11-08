import java.util.*;

public class Stringmethods {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scn.nextLine();
        if(isPalindrome(input))
        {
            System.out.println(input + " is a palindrome.");
        }else{
            System.out.println(input + " is not a palindrome.");
        }

    }

    public static boolean isPalindrome(String str){
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;                
            }
            left++;
            right--;
        }
        return true;
    }
}
