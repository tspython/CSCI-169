import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
public class HW3P4Shrivastav {
    public static ArrayList<Object> foo(ArrayList<Object> list) {
        ArrayList<String> foods = new ArrayList<>(Arrays.asList("Food", "Apple", "Fruit", "Orange"));
        ArrayList<Object> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Object item = list.get(i);
            switch (item.toString()) {
                case "Food" -> {
                    if (!foods.contains(list.get(i+1).toString())) {
                        result.add(new Food(list.get(i+1).toString()));
                        i++;
                    } else {
                        result.add(new Food());
                    }
                }
                case "Fruit" -> {
                    if(!foods.contains(list.get(i+1).toString())){
                        if (list.get(i + 2).toString().equals("now")) {
                            result.add(new Fruit(new Date(), list.get(i+1).toString()));
                        } else if (list.get(i + 2) instanceof Integer) {
                            result.add(new Fruit(new Date((long) (int) list.get(i + 2)), list.get(i+1).toString()));
                        }
                        i+=2;
                    }
                    else {
                        result.add(new Fruit());
                    }
                }
                case "Apple" -> {
                    if (list.get(i + 1).toString().equals("now")) {
                        result.add(new Apple(new Date()));
                        i++;
                    } else if (list.get(i + 1) instanceof Integer) {
                        result.add(new Apple(new Date((long) (int) list.get(i + 1))));
                        i++;
                    }
                    else {
                        result.add(new Apple());
                    }
                }
                case "Orange" -> {
                    if (list.get(i + 1).toString().equals("now")) {
                        result.add(new Orange(new Date()));
                        i++;
                    } else if (list.get(i + 1) instanceof Integer) {
                        result.add(new Orange(new Date((long) (int) list.get(i + 1))));
                        i++;
                    }
                    else {
                        result.add(new Orange());
                    }
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        ArrayList<Object> objectList = new ArrayList<Object>();
        objectList.add("Food");
        objectList.add("Orange");
        objectList.add("Fruit");
        objectList.add("Papaya");
        objectList.add(new Integer(3932728));
        objectList.add("Apple");
        objectList.add("now");
        objectList.add("Food");
        objectList.add("sandwich");
        objectList = foo(objectList);
        for(int i = 0; i < objectList.size(); i++) {
            System.out.println(objectList.get(i));
        }
    }
}
