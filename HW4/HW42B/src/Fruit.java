import java.util.Date;

public class Fruit extends Food implements Comparable {
    protected Date ripe;
    public Fruit() {
        super.name = "Fruit";
        ripe = new Date();
    }

    public Fruit(Date r, String n) {
        super.name = n;
        ripe = r;
    }

    public void ripeTime() {
        System.out.println(ripe);
    }

    @Override
    public int compareTo(Object obj) {
        Fruit f = (Fruit) obj;
        return this.ripe.compareTo(f.ripe);
    }
}
