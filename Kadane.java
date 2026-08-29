import java.util.*;

public class Kadane {
    public static void main(String[] args){
        /*int[] numbers = {2, -1, 3, -5, 4};
        int currentsum = numbers[0];
        int maxsum = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            currentsum = Math.max(numbers[i], currentsum + numbers[i]);
            maxsum = Math.max(maxsum, currentsum);
        }

        System.out.println(maxsum);*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values in the array");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter " + n + " values: ");
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        int currentsum = array[0];
        int maxsum = array[0];

        for (int t = 1; t < array.length; t++){
            currentsum = Math.max(array[t], currentsum + array[t]);
            maxsum = Math.max(maxsum, currentsum);
        }

        System.out.println(maxsum);

    }
}