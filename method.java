public class method{

    int id;
    String name;
    //  method() {
    //     // id =11;
    //     // name="sjkdfnv";
    //     // this.id =id;
    //     // this.name =name;

    //     System.out.println("call from constructor");

    // }

    method(int id= 100, String name= "Default"){
        this.id = id;
        this.name = name;
        

        System.out.println("constructor " + id + " "+name);


    }



    public void displayMethod() {
        System.out.println("Detials are :"+id+" "+name);
        
    }
    public static void main(String[] args ){
        

        // method m1 = new method();
        // method m2 = new method();
        method m3 = new method();
        m3.displayMethod();
        // m2.id =103;
        // m2.name="xyz";
        // m2.displayMethod();
        // m1.id =10;
        // m1.name ="laxmi";
        // m1.displayMethod();
    }
}