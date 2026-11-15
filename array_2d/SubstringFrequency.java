import java.util.Scanner;

public class SubstringFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the main string: ");
        String str1 = scn.nextLine();
        System.out.println("Enter the substring: ");
        String str2 = scn.nextLine();

        int[] freq = new int[256];
        for(int i = 0; i < str1.length();){
            char ch = str1.charAt(i);
            freq[ch]++;
        }
        int counter = 0;
        int[] freq2 = new int [256];
        for(int i = 0; i < str2.length();){
            char ch2 = str2.charAt(i);
            freq2[ch2]++;
        }

        
    }
}