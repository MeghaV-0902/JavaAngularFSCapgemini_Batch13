
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExcecutorsExample
{
    public static void main(String[] args) {
        System.out.println("Inside: "+Thread.currentThread().getName());

        System.out.println("Creating executor service");

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        System.out.println("Creating new runnable");

        Runnable runnable = () -> {
            Thread.currentThread().setName("runnable1");
            System.out.println("Inside: "+Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };
        Runnable runnable2 = () -> {
            Thread.currentThread().setName("runnable2");
            System.out.println("Inside: "+Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };
        Runnable runnable3 = () -> {
            Thread.currentThread().setName("runnable3");
            System.out.println("Inside: "+Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };
        System.out.println("Submit the task specified by the runnable to the executor");
        executorService.submit(runnable);

        executorService.submit(runnable2);
        executorService.submit(runnable3);
    }
}
