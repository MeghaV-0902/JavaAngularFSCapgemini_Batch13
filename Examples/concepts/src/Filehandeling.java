import java.io.*;

public class Filehandeling
{
    public static void main(String[] args) throws Exception
    {
        File f = new File("demo.txt");
        FileOutputStream fs = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fs);
        dos.writeUTF("demo");

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);
    }


}
