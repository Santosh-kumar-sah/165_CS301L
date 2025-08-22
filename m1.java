import java.util.Scanner;

public class m1 {
    int salary;
    String name;

    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        this.salary = sc.nextInt();
        sc.nextLine();
        this.name = sc.nextLine();
    }

    public void display(){
        System.out.println(this.salary+" "+this.name);
    }

    public static void main(String[] args) {

        m1 m = new m1();
        m.getDetails();
        m.display();

       
        
        
       

        
        }
    
}
