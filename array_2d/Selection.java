import java.util.Scanner;

public class Selection {
    void sort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int min_index = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min_index])
                    min_index = j;
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();


    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        Selection ob = new Selection();
        ob.sort(arr);
        System.out.println("Sorted array: ");
        ob.printArray(arr);
    }
}
