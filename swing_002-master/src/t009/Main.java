package t009;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
//    public static void main(String[] args) {
//        ClassA.ClassB classB = new ClassA.ClassB();
//    }
//
//    static void shutdownAndAwaitTermination(ExecutorService pool) {
//        pool.shutdown();
//        try {
//            if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
//                pool.shutdownNow();
//                if (!pool.awaitTermination(60, TimeUnit.SECONDS))
//                    System.err.println("Pool did not terminate");
//            }
//        } catch (Exception e) {
//        }
//    }
//
//}
//
//class AppendableRunnable<T extends Appendable> implements Runnable {
//    static long time = 0;
//    T appendable;
//
//    public AppendableRunnable(T appendable) {
//        this.appendable = appendable;
//    }
//
//    @Override
//    public void run() {
//        long time = System.currentTimeMillis();
//        for (int j = 0; j < 100000; j++) {
//            try {
//                appendable.append("append string ");
//            } catch (IOException e) {
//            }
//        }
//        AppendableRunnable.time += (System.currentTimeMillis() - time);
//    }
//
//    // 99999 * 14 phần tử =
}
