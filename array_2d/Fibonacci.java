import java.util.Scanner;

public class Fibonacci {
    static int n1 = 0, n2 = 1, n3 = 0;
    static void printFibonnaci(int count){
        if(count > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonnaci(count - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers you want to print: ");
        int count = scn.nextInt();
        System.out.print(n1 + " " + n2);
        printFibonnaci(count - 2);
    }
}
