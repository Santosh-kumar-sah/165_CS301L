
import java.util.*;
public class LinkedHashSetExample {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(21);
        set.add(12);
        set.add(111);

        System.out.println("Set elements: "+set);



        LinkedHashSet<Integer> number = new LinkedHashSet();

        number.add(1);
        number.add(2);
        number.add(10);

        System.out.println("Linked hasset:"+number);

        LinkedHashSet<Integer> number1 = new LinkedHashSet();

        number1.add(21);
        number1.add(12);
        number1.add(111);

        System.out.println("set"+number1);









        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(21);
        ts.add(12);
        ts.add(111);
        System.out.println("Treeset elements: "+ts);







    }
    
}
