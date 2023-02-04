import java.util.Date;

public class Apple extends Fruit {

    public Apple() {
        super.name = "Apple";
        super.ripe = new Date();
    }
    public Apple(Date r) {
        super.name = "Apple";
        super.ripe = r;
    }

    public void prepare(){
        System.out.println("Core the " + super.name);
    }
}