//implements Runnable
public class MyTask extends Thread {
    private String name;
    private int number;

    public MyTask(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        for (int i = 0; i < this.number; i++) {
            Thread.yield();
//            System.out.println(name);
        }

    }
}
