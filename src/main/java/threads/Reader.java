package threads;

public class Reader implements Runnable {
    private boolean keepReading = true;

    public void setKeepReading(boolean keepReading) {
        this.keepReading = keepReading;
    }

    @Override
    public void run() {
        System.out.print("Reading...");
        while (keepReading) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println("... done");
    }
}