import java.util.Scanner;

public class Factorial {
/*/
    public static int factorials(int num){
        if(num == 0 || num == 1){
            return 1;
        } else{
            return factorials(num - 1) * num;
        }
    }
*/
    public static void main(String[] args)throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print("Number you want to input: ");
        /*int num = scn.nextInt();
        System.out.println(factorials(num));*/
        int n = scn.nextInt();
        printDecreasing(n);

    }
    public static void printDecreasing(int n){
        if(n == 0) return;
        System.out.println(n);
        printDecreasing(n-1);
    }
}