import java.util.Date;

public class Fruit extends Food {
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
}
