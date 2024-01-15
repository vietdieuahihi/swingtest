package t009;

public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("time = " + System.currentTimeMillis() / 1000);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("time = " + System.currentTimeMillis() / 1000);
        System.out.println("Run");
    }
}
