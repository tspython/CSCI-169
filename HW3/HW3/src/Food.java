public class Food {
    protected String name;

    public Food(){
        name ="Food";
    }

    public Food(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void prepare(){
        System.out.println("Prepare the " + name);
    }
}