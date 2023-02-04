import java.util.Date;

public class Orange extends Fruit {

    public Orange(){
        super.name = "Orange";
        super.ripe = new Date();
    }

    public Orange(Date r){
        super.name = "Orange";
        super.ripe = r;
    }

    public void prepare(){
        System.out.println("Peel the " + super.name);
    }
}
