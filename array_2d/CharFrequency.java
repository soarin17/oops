import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       System.out.println("Enter the string");
       String str = scn.nextLine();
    int[] freq = new int[256];
    for(int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);
        freq[ch]++;
    }

    for(int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);
        
        if(freq[ch] > 0){
            System.out.println(ch + " = " + freq[ch]);
            freq[ch] = 0;
        }  
    }
    }
}