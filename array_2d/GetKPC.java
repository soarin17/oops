import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class GetKPC {
    public static void main(String[] args) {
        ArrayList<String[]> listOfArrays = new ArrayList<>();

        // 2. Create some sample arrays
        String[] row1 = {"1"};
        String[] row2 = {"2"};
        String[] row3 = {"A", "B", "C"};
        String[] row4 = {"3"};
        String[] row5 = {"D", "E", "F"};
        String[] row6 = {"4"};
        String[] row7 = {"G", "H", "I"};
        String[] row8 = {"5"};
        String[] row9 = {"J", "K", "L"};
        String[] row10 = {"6"};
        String[] row11 = {"M", "N", "O"};
        String[] row12 = {"7"};
        String[] row13 = {"P", "Q", "R", "S"};
        String[] row14 = {"8"};
        String[] row15 = {"T", "U", "V"};
        String[] row16 = {"9"};
        String[] row17 = {"W", "X", "Y", "Z"};
        String[] row18 = {"*"};
        String[] row19 = {"0"};
        String[] row20 = {"#"};

        // 3. Add the arrays to the ArrayList
        listOfArrays.add(row1);
        listOfArrays.add(row2);
        listOfArrays.add(row3);
        listOfArrays.add(row4);
        listOfArrays.add(row5);
        listOfArrays.add(row6);
        listOfArrays.add(row7);
        listOfArrays.add(row8);
        listOfArrays.add(row9);
        listOfArrays.add(row10);
        listOfArrays.add(row11);
        listOfArrays.add(row12);
        listOfArrays.add(row13);
        listOfArrays.add(row14);
        listOfArrays.add(row15);
        listOfArrays.add(row16);
        listOfArrays.add(row17);
        listOfArrays.add(row18);
        listOfArrays.add(row19);
        listOfArrays.add(row20);

        // 4. Access the data
        // Get the first array and print its second element ("Banana")
        //String item = listOfArrays.get(3)[4]; 
        //System.out.println(item);

        // 5. Loop through everything
        System.out.println("\nAll items:");
        for (String[] array : listOfArrays) {
            System.out.println(Arrays.toString(array));
        }
    }
}