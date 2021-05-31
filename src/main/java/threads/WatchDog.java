package threads;

public class WatchDog {
    public static void main(String... args) {
        Reader reader = new Reader();
        Thread reader1 = new Thread(reader);
        reader1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        reader.setKeepReading(false);
    }
}