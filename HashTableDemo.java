import java.util.Hashtable;
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> table = new Hashtable<>();

        table.put(1,"abc");
        table.put(2,"jdbc");
        table.put(3,"jdbsd");

        System.out.println("Our hashtable is:"+table);

        System.out.println(table.putIfAbsent(4,"djcwb"));
        
        
    }
    
}
