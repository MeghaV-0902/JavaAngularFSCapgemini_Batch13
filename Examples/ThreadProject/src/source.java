
import java.util.*;




class WalkingBoy
{
    private int stepSize;
    private int blockSize;

    public WalkingBoy(int stepSize,int blockSize)
    {
        this.stepSize = stepSize;
        this.blockSize = blockSize;
    }

    public String targetHit(String platform)throws BombBlast
    {
        int n = this.blockSize;
        List<String> results = new ArrayList<>();
        int length = platform.length();

        for (int i = 0; i < length; i += n) {
            results.add(platform.substring(i, Math.min(length, i + n)));
        }
        //System.out.println(results);
        boolean flag = false;
        String msg = "";
        for(int i =0;i<results.size();i++)
        {
            String str=results.get(i);
            if(str.contains("x"))
            {
                msg="You hit the target";
                flag=true;
                throw new BombBlast("You hit the target");
            }
        }
        return "Win";

    }
}
class BombBlast extends Exception
{
    public BombBlast(String message) {
        super("You hit target Exception");
    }
}
public class source
{
    public static void main(String[] args) {
        WalkingBoy boy = new WalkingBoy(2,3);

        try {
            System.out.println(boy.targetHit("1212121x212"));
        } catch (BombBlast e) {
            System.out.println("Bombblast : You hit the target");
           // e.printStackTrace();
        }
    }
}
