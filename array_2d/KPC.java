import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KPC {
    static Character[][] numberToCharMap;
    private static List<String> printWords(int[] numbers, int len, int numIndex, String s){
        if(len == numIndex){
            return new ArrayList<>(Collections.singleton(s));
        }
        List<String> stringList = new ArrayList<>();
        for(int i = 0; i < numberToCharMap[numbers[numIndex]].length; i++){
            String scopy = String.copyValueOf(s.toCharArray());
            scopy = scopy.concat(numberToCharMap[numbers[numIndex]][i].toString());

            stringList.addAll(printWords(numbers, len, numIndex + 1, scopy));
        }
        return stringList;
        
    }
    private static void printWords(int[] numbers){
        generateNumberToCharMap();
        List<String> stringList = printWords(numbers, numbers.length, 0, "");
        stringList.stream().forEach(System.out::println);

    }

    private static void generateNumberToCharMap(){
        numberToCharMap = new Character[10][5];
        numberToCharMap[0] = new Character[]{'0'};
        numberToCharMap[1] = new Character[]{'1'};
        numberToCharMap[2] = new Character[]{'A', 'B', 'C'};
        numberToCharMap[3] = new Character[]{'D', 'E', 'F'};
        numberToCharMap[4] = new Character[]{'G', 'H', 'I'};
        numberToCharMap[5] = new Character[]{'J', 'K', 'L'};
        numberToCharMap[6] = new Character[]{'M', 'N', 'O'};
        numberToCharMap[7] = new Character[]{'P', 'Q', 'R', 'S'};
        numberToCharMap[8] = new Character[]{'T', 'U', 'V'};
        numberToCharMap[9] = new Character[]{'W', 'X', 'Y', 'Z'};
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of digits: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the digits: ");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        printWords(arr);
    }
}
