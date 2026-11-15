import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the main string (str1): ");
        String str1 = scn.nextLine();
        System.out.println("Enter the substring: ");
        String str2 = scn.nextLine();
        if (str1.contains(str2)) {
            System.out.println(str2 + " is a substring of " + str1);
        } else{
            System.out.println(str2 + " is not a substring of " + str1);
        }
    }
}
