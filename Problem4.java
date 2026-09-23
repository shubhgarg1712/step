class BankingTask implements Runnable {
    private String activity;
    private int delay;

    public BankingTask(String activity, int delay) {
        this.activity = activity;
        this.delay = delay;
    }

    public void run() {
        try {
            for (int count = 1; count <= 3; count++) {
                System.out.println(
                    Thread.currentThread().getName()
                    + " - " + activity
                    + " - Execution " + count
                );
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Thread transactionThread =
            new Thread(new BankingTask("Processing transaction", 1000));

        Thread balanceThread =
            new Thread(new BankingTask("Updating balance", 1500));

        Thread smsThread =
            new Thread(new BankingTask("Sending SMS notification", 2000));

        transactionThread.setName("Transaction Thread");
        balanceThread.setName("Balance Update Thread");
        smsThread.setName("SMS Notification Thread");

        transactionThread.start();
        balanceThread.start();
        smsThread.start();
    }
}
