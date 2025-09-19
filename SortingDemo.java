
import java.util.*;
import java.util.Comparator;

public class SortingDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(22);
        al.add(24);
        al.add(25);
        al.add(28);

        System.out.println("ArrayList is:"+al);

        Collections.sort(al);
        System.out.println("After sorting arrayList is: "+al);

        Integer[] array = {1,8,3,7,5,6};
        System.out.println("Arrays is: "+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("after sorting arrray is: "+Arrays.toString(array));

        Collections.sort(al,Comparator.reverseOrder());
        System.out.println("After sorting in revesre: "+Arrays.toString(array));

        Arrays.sort(array,Comparator.reverseOrder());
        System.out.println("After revesreing sorted Arrays: "+Arrays.toString(array));
        
       
    }
    
}
