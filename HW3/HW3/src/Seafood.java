public class Seafood extends Food{

    public Seafood() {
        super.name = "Seafood";
    }

    public Seafood(String n) {
        super.name = n;
    }

    @Override
    public void prepare() {
        System.out.println("Peel the " + super.name);
    }
}
