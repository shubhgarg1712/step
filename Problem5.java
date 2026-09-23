class TrafficJunction extends Thread {
    private String trafficStatus;
    private int delay;

    public TrafficJunction(String name, String trafficStatus, int delay) {
        setName(name);
        this.trafficStatus = trafficStatus;
        this.delay = delay;
    }

    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(
                    Thread.currentThread().getName()
                    + " - Traffic Status: " + trafficStatus
                    + " - Report " + i
                );
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
    }
}

public class Problem5 {
    public static void main(String[] args) {
        TrafficJunction j1 =
            new TrafficJunction("Junction 1", "Heavy Traffic", 1000);

        TrafficJunction j2 =
            new TrafficJunction("Junction 2", "Moderate Traffic", 1500);

        TrafficJunction j3 =
            new TrafficJunction("Junction 3", "Low Traffic", 2000);

        j1.start();
        j2.start();
        j3.start();
    }
}
