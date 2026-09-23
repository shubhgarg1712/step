class ExamTask implements Runnable {
    private String activity;
    private int delay;

    public ExamTask(String activity, int delay) {
        this.activity = activity;
        this.delay = delay;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + activity);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Thread timeThread = new Thread(new ExamTask("Displaying remaining time", 1000));
        Thread saveThread = new Thread(new ExamTask("Auto-saving student's answers", 1500));
        Thread networkThread = new Thread(new ExamTask("Checking network connection", 2000));

        timeThread.setName("Time Display Thread");
        saveThread.setName("Auto Save Thread");
        networkThread.setName("Network Check Thread");

        timeThread.start();
        saveThread.start();
        networkThread.start();
    }
}
