import java.util.*;
import java.util.Collections;
import java.util.Iterator;
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

        System.out.println(fruits.get(2));
        System.out.println(fruits.set(2,"Guava"));
        System.out.println(fruits);
        System.out.println("-------------------------Iterator---------------------------");
        Iterator itr=fruits.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        fruits.add(1,"Mango");
        System.out.println(fruits);
        fruits.remove(2);
        System.out.println(fruits);
        System.out.println("-------------------------size-----------------------------");
        int s=fruits.size();
        System.out.println(s);
        System.out.println("-------------------------Contains----------------------------");
        System.out.println(fruits.contains("Apple"));  //boolean return
        System.out.println("-------------------------------sort---------------------------");
        Collections.sort(fruits);
        System.out.println(fruits);


        System.out.println(Collections.binarySearch);
    }

}
