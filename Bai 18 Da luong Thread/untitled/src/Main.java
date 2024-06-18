import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        Runnable myTask1 = new MyTask("A", 50);
//        Thread thread1 = new Thread(myTask1);
//        Runnable myTask2 = new MyTask("_____________B", 50);
//        Thread thread2 = new Thread(myTask2);
//
//        thread1.start();
//        thread2.start();
//        Thread thread1 = new MyTask("A", 50);
//        Thread thread2 = new MyTask("___________B", 50);
//        thread1.start();
//        thread2.start();

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new MyTask("A", 20));
        executorService.execute(new MyTask("B", 20));
        executorService.execute(new MyTask("C", 20));


        /*
        A: -----------------------
        B: ------------------------
        E: ---------
        F --------------

         */
    }
}