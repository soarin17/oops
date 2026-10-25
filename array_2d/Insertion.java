import java.util.Scanner;

public class Insertion {
    void sort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;

            }

            arr[j + 1] = key;
        }
    }
    
    static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        Insertion ob = new Insertion();
        ob.sort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}

