package t009;

public class ThreadExt extends Thread {
    private int begin;
    private String name;

    public ThreadExt(String name, int begin) {
        this.begin = begin;
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
