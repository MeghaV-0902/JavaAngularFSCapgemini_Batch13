public class ThreadDemo
{
    public static void main(String[] args) throws Exception
    {

        Thread t1 = new Thread(()->
        {
            for(int i = 0;i<=4;i++) {
                System.out.println("Hi "+Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        });
        Thread t2 = new Thread(()->
        {
            for (int i = 0; i <= 4; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        });
        t1.setPriority(1);
        t2.setPriority(10);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());

        System.out.println("bye");
    }

}
