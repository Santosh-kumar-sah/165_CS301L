import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args)throws IOException {
        Properties props = new Properties();

        // set properties
        props.setProperty("db.ser", "Laxmi");
        props.setProperty("db.password", "secret");

        // Save file
        FileOutputStream fos = new FileOutputStream("config.properties");
        props.store(fos,"database Configuration");
        System.out.println("info has been store in file ");
        fos.close();


        // load file
        Properties loadProps = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        loadProps.load(fis);
        System.out.println("File has been loaded");
        fis.close(); 

        // print loaded value
        System.out.println("User "+ loadProps.getProperty("db.user"));
        System.out.println("password: "+loadProps.getProperty("db.password"));

        // print via output values
        props.list(System.out);
    }
}
