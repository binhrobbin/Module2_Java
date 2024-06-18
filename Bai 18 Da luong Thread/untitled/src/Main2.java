class Account {
    public String name;
    public int amount;

    public Account(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public synchronized void withDraw(int a) {
        if(this.amount >= a) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.amount = this.amount - a;
            System.out.println("Amount: " + amount);
        } else {
            System.out.println("NOT ENOUGH MONEY!!");
        }
    }
}

class WithDrawTask implements Runnable{
    Account account;
    WithDrawTask(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        this.account.withDraw(15);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Account account = new Account("Linh", 20);
        Runnable r1 = new WithDrawTask(account);
        Thread thread1 = new Thread(r1);
        Runnable r2 = new WithDrawTask(account);
        Thread thread2 = new Thread(r2);
        thread1.start();
        thread2.start();
    }
}

