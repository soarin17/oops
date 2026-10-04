import java.util.Scanner;

public class IndiceFinder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements for the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter the number to find the indices: ");
        int target = scn.nextInt();
        int index = findIndex(arr, target, 0);
        System.out.println(index);
    }

    public static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }

        return findIndex(arr, target, index + 1);
    }
}
