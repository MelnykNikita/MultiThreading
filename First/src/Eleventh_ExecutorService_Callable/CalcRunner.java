package Eleventh_ExecutorService_Callable;

import java.util.concurrent.*;

/**
 * Created by Никита Мельник on 21.09.2017.
 */
public class CalcRunner {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Number> future = executorService.submit(new CalcCallable());
        executorService.shutdown();
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
