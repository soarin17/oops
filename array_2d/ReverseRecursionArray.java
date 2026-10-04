import java.util.Scanner;

public class ReverseRecursionArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Eneter the " + n + " elements of the array");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        ReverseArray(arr, 0);
    }

    public static void ReverseArray(int[] arr, int index){
        if(index == arr.length){
            return;
        }
        ReverseArray(arr, index + 1);
        System.out.println(arr[index]);
    }
}
