package Eleventh_ExecutorService_Callable;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * Created by Никита Мельник on 21.09.2017.
 */
public class CalcCallable implements Callable<Number> {

    @Override
    public Number call() throws Exception {
        return new Random().nextGaussian();
    }
}
