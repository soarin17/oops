import java.util.Scanner;

public class RecursionArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " elements of the array");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        printArray(arr, 0);
    }

    public static void printArray(int[] arr, int index){
        if(index == arr.length){
            return;
        }
        System.out.println(arr[index]);
        printArray(arr, index + 1);
    }
}
