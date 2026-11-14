
class math {
    int a = 10;
    int b = 5;

    void add() {
        System.out.println("Addition: " + (a + b));
    }

    void subtract() {
        System.out.println("Subtraction: " + (a - b));
    }
}

public class Calculator extends math {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.add();
        c.subtract();
    }
}
