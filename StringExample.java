import java.util.Scanner;
public class StringExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.next();
        String name ="Laxmi";

        int len = name.length();
        System.out.println("Length of string: "+len);

        String upper = name.toUpperCase();
        System.out.println("Uppercase: "+upper);
        String lower = name.toLowerCase();
        System.out.println("Lowercase: "+lower);

        String sub = name.substring(1,4);
        System.out.println("Substring: "+sub);
        String rep = name.replace('a', 'A');
        System.out.println("Replace: "+rep);
        boolean eq = name.equals("Laxmi");
        System.out.println("Equals: "+eq);

        boolean eqi = name.equalsIgnoreCase("laxmi");
        System.out.println("Equals Ignore Case: "+eqi);
        boolean con = name.contains("xm");
        System.out.println("Contains: "+con);
        boolean st = name.startsWith("La");
        System.out.println("Starts with: "+st);
        boolean en = name.endsWith("mi");
        System.out.println("Ends with: "+en);
        int ind = name.indexOf('x');
        System.out.println("Index of: "+ind);
        char ch = name.charAt(2);
        System.out.println("Character at index 2: "+ch);
        String trim = "  Hello World  ".trim();
        System.out.println("Trimmed string: '"+trim+"'");
        String[] words = "Java is fun".split(" ");
        System.out.println("Split string:");
        for(String w : words){
            System.out.println(w);
        }

        
        System.out.println("CompareTo: "+str.compareTo(str1));
        
        sc.close();
    }
    
}
