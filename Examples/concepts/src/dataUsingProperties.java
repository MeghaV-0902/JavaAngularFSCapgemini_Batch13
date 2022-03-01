import java.io.*;
import java.util.Properties;

public class dataUsingProperties
{
    public static void main(String[] args)throws Exception {
        Properties p = new Properties();
        OutputStream os = new FileOutputStream("properties.config");
        p.setProperty("url","localhost");
        p.setProperty("name","megha");
        p.setProperty("pass","0000");
        p.store(os,null);


        InputStream is = new FileInputStream("properties.config");
        p.load(is);

        System.out.println(p.getProperty("url"));
        p.list(System.out);
    }
}
