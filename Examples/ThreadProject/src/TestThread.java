import javax.swing.plaf.TableHeaderUI;

public class TestThread implements Runnable
{

    @Override
    public void run() {
        System.out.println("thread created is running");
        for(int i =1;i<=5;i++)
        {
            System.out.println(i);
        }
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestThread re1 = new TestThread();
        TestThread re2 = new TestThread();
        Thread th1 = new Thread(re1);
        Thread.currentThread().setName("th1");
        th1.start();
        System.out.println(Thread.currentThread());
        Thread th2 = new Thread(re2);
        Thread.currentThread().setName("th2");
        th2.start();
        System.out.println(Thread.currentThread());

        //th1.stop();

    }
}
