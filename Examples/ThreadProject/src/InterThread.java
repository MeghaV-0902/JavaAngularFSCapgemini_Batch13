class Q
{
    int n;
    boolean valueSet = false;
    public synchronized void put(int n)
    {
        while(valueSet)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("put: "+n);
        valueSet = true;
        this.n=n;
        notify();
    }
    public synchronized void get()
    {
        while (!valueSet)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("get: "+n);
        valueSet=false;
        notify();
    }
}

class producer implements Runnable
{
    Q q;

    producer(Q q)
    {
        this.q = q;
        Thread t = new Thread(this,"Producer");
        t.start();
    }
    @Override
    public void run()
    {
     int i =0;
     while(true)
     {
         q.put(i++);
         try
         {
             Thread.sleep(1000);
         }
         catch(Exception e)
         {

         }
     }
    }
}
class Consumer implements Runnable
{
    Q q;
    Consumer(Q q)
    {
        this.q = q;
        Thread t = new Thread(this,"Consumer");
        t.start();
    }
    @Override
    public void run()
    {
        int i =0;
        while(true)
        {
            q.get();
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }
        }
    }
}

public class InterThread
{
    public static void main(String[] args)
    {
        Q q = new Q();
        new producer(q);
        new Consumer(q);
    }
}
