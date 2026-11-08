import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class GetKPC {
    public static void main(Stringmethods[] args) {
        ArrayList<Stringmethods[]> listOfArrays = new ArrayList<>();

        // 2. Create some sample arrays
        Stringmethods[] row1 = {"1"};
        Stringmethods[] row2 = {"2"};
        Stringmethods[] row3 = {"A", "B", "C"};
        Stringmethods[] row4 = {"3"};
        Stringmethods[] row5 = {"D", "E", "F"};
        Stringmethods[] row6 = {"4"};
        Stringmethods[] row7 = {"G", "H", "I"};
        Stringmethods[] row8 = {"5"};
        Stringmethods[] row9 = {"J", "K", "L"};
        Stringmethods[] row10 = {"6"};
        Stringmethods[] row11 = {"M", "N", "O"};
        Stringmethods[] row12 = {"7"};
        Stringmethods[] row13 = {"P", "Q", "R", "S"};
        Stringmethods[] row14 = {"8"};
        Stringmethods[] row15 = {"T", "U", "V"};
        Stringmethods[] row16 = {"9"};
        Stringmethods[] row17 = {"W", "X", "Y", "Z"};
        Stringmethods[] row18 = {"*"};
        Stringmethods[] row19 = {"0"};
        Stringmethods[] row20 = {"#"};

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
        for (Stringmethods[] array : listOfArrays) {
            System.out.println(Arrays.toString(array));
        }
    }
}