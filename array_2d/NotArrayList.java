import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotArrayList{
    public static void main(String[] args) {
        String[] friends = {"John", "Kyle", "Paul"};
        ArrayList<String> names = new ArrayList<>();
        names.add("tim");
        names.add("ron");

        names.add(0, "wisley");
        names.add(1, "frank");

        names.remove("Frank");
        names.remove(0);

        System.out.println(names.get(0));

        names.set(1, "Larry");

        names.addAll(1, Arrays.asList("Ranger", "Jack", "Harry"));
        names.addAll(List.of("James", "Jackie", "Moana"));

        // clear
        // names.clear()

        System.out.println(friends.length);

        System.out.println(names.size());

        System.out.println(names.isEmpty());

        System.out.println(names.contains("Kim"));

        System.out.println(names.contains("tim"));

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
        for(String name: names){
            System.out.println(name);
        }
        System.out.println(names);
    }
}