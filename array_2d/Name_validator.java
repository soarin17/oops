import java.util.Scanner;

public class Name_validator {
    public static boolean isValidIdentifier(String name){
        if (name.isEmpty()){
            return false;
        }
        char first = name.charAt(0);
        if (!Character.isLetter(first) && first != '_') {
            return false;
        }

        for(int i = 1; i < name.length(); i++){
            char ch = name.charAt(i);
            if (!Character.isLetterOrDigit(ch) && ch != '_') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an indentifier to validate (or 'exit' to quit): ");
            String name = scn.nextLine();
            if (name.equals("exit")) {
                System.out.println("Program terminated");
                break;
            }
            if (isValidIdentifier(name)) {
                System.out.println(name + " is a valid identifier");
            } else {
                System.out.println(name + " is not a valid identifier");
            }
        }
    }
}