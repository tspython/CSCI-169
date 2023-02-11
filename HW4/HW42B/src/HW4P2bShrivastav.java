import java.util.Iterator;

public class HW4P2bShrivastav {
    public static void main(String[] args) {
        SortedList s = new SortedList();
        s.insert(5);
        s.insert(1);
        s.insert(4);
        s.insert(2);
        s.insert(3);

        System.out.println("Contents of the SortedList:");
        for (int num : s) {
            System.out.println(num);
        }
    }
}


