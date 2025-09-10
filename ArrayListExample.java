
import java.util.*;
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList fruits = new ArrayList();
        // for only String type:
        ArrayList<String> str = new ArrayList<>();
        str.add("Hello");
        str.add("World");

        for(String s : str){
            System.out.println(s);
        }

        fruits.add("Apple");
        fruits.add("Banana");   
        fruits.add("Orange");
        fruits.add(123);
        fruits.add(null);
        System.out.println("Fruits: " + fruits);
    }

}
