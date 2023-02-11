import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
public class HW42AShrivastav {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit(new Date(2022, 11, 1), "Apple"));
        fruits.add(new Fruit(new Date(2022, 10, 20), "Banana"));
        fruits.add(new Fruit(new Date(2022, 9, 15), "Peach"));

        System.out.println("Before sorting: ");
        for (Fruit fruit : fruits) {
            System.out.println(fruit.name + " ripe on " + fruit.ripe);
        }

        Collections.sort(fruits);

        System.out.println("\nAfter sorting: ");
        for (Fruit fruit : fruits) {
            System.out.println(fruit.name + " ripe on " + fruit.ripe);
        }
    }
}