import java.util.*;
public class HashSetExample {

    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<>();

        number.add(1);
        number.add(11);
        number.add(2);

        System.out.println("hashSet 2 : "+number);

        HashSet<Integer> number1 = new HashSet<>();

        number1.add(21);
        number1.add(12);
        number1.add(111);
        number1.add(23);

        number.addAll(number1);
        number.retainAll(number1);
        number.removeAll(number1);
    }
    
}
