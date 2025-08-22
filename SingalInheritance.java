class employee{
    int id;
    String name;
    String org;


    void getDetails(){
        System.out.println("name"+name+"id "+id+"org "+org);
    }

}

class Faculty extends employee{
    String department;
    String subject;

    void facultyDetails(){
        System.out.println("Depart "+department+"Subject "+subject);
    }


}
public class SingalInheritance {

    public static void main(String[] args) {
        Faculty f = new Faculty();
        f.id = 102;
        f.name ="same";
        f.org ="kiet";
        f.department ="cseaiml";
        f.subject ="java";
        f.facultyDetails();
        f.getDetails();
    }




    
}


