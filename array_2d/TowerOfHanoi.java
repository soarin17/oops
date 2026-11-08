import java.util.Scanner;
public class TowerOfHanoi {
    public static void main(Stringmethods[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of disk: ");
        int n = scn.nextInt();
        towerofHanoi(n, "from_rod", "to_rod", "aux_rod");
        scn.close();
    }
    public static void towerofHanoi(int n, Stringmethods from_rod, Stringmethods to_rod, Stringmethods aux_rod){
        if(n == 0){
            return;
        }
        towerofHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from " + from_rod + " to " + to_rod);
        towerofHanoi(n - 1, aux_rod, to_rod, from_rod);
    }
}
