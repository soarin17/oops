import java.util.Scanner;

public class Getsubsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        makesubsequence(arr, 0, "");
    }

    public static void makesubsequence(int[] arr, int index, String current){
        if(index == arr.length){
            System.out.println(current);
            return;
        }
        makesubsequence(arr, index + 1, current + arr[index]);

        makesubsequence(arr, index + 1, current);
    }
}
