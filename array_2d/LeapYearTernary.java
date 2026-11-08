import java.util.Scanner;

public class LeapYearTernary {
    public static void main(Stringmethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        Stringmethods result = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                ? "Leap Year"
                : "Not a Leap Year";
        System.out.println(result);
        sc.close();
    }
}