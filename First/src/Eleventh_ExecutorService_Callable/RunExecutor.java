package Eleventh_ExecutorService_Callable;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Никита Мельник on 21.09.2017.
 */
public class RunExecutor {

    public static void main(String[] args) throws Exception{

        ArrayList<Future<String>> list = new ArrayList<Future<String>>();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
                    list.add(executorService.submit(new BaseCallable()));
        }
        executorService.shutdown();

        for (Future<String> future : list) {
            System.out.println(future.get() + " result fixed");
        }
    }
}
