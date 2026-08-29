import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(Arrays.toString(cars));
        int[] marks = {42, 75, 99, 85, 100};
        double[] temp = {42.36, 78.8, 98.12};
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(matrix));
        int[][][] cube = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };
        System.out.println(Arrays.deepToString(cube));
        System.out.println(cube[0][0][1]);

        System.out.println(cars[0]);
        System.out.println(cars[1]);

        cars[1] = "Ferrari";
        System.out.println(cars[1]);
        System.out.println(cars.length);
        cars[0] = "23";
        System.out.println(cars[0]);
        String[] fruits = new String[4];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        fruits[3] = "dragonfruit";

        for(int i = 0; i < fruits.length; i++){
            System.out.println(i);
        }

        for (String fruit: fruits){
            System.out.println(fruit);
        }
    }
}
