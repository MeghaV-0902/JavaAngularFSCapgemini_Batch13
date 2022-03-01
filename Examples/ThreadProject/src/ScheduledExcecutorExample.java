import java.util.concurrent.*;

public class ScheduledExcecutorExample
{
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        Runnable task = ()-> {
            System.out.println("Executing at " + System.nanoTime());
        };
        System.out.println("Submitting task at " + System.nanoTime() + " to be executed after 5 seconds.");
        scheduledExecutorService.schedule(task, 5, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();

}
}
