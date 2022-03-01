import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class InputStremExample
{
    public static void main(String[] args) throws FileNotFoundException {
        char[] stream = new char[70];
        try {
            FileInputStream f1 = new FileInputStream("D:\\MEGHA files\\Capgemini\\CAMP\\JavaAngularFSCapgemini_Batch13\\Examples\\hello.txt");
            InputStreamReader isr = new InputStreamReader(f1);
            isr.read(stream);
            System.out.println(stream);
            isr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
