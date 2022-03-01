import java.io.DataOutputStream;
import java.io.*;

public class serialexample
{
    public static void main(String[] args) throws Exception{

        save obj = new save();
        obj.i=10;
        File f = new File("obj.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos =  new ObjectOutputStream(fos);
        oos.writeObject(obj);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        save obj1 =(save) ois.readObject();
        System.out.println(obj1.i);
    }
}


class save implements Serializable
{
    int i;
}
