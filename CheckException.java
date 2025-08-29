import java.io.File;
import java.io.FileInputStream;

public class CheckException {
    public static void main(String[] args) {
        try{
        FileInputStream fis = new FileInputStream(null);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
