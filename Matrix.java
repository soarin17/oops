import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("enter number of columns: ");
        int colums = scanner.nextInt();

        int matrix[][] = new int[rows][colums];
        System.out.print("enter " + rows*colums + " values ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < colums; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("the 2d array is:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < colums; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
