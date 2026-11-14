import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
       String str = "testmail@hotmail.com";
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