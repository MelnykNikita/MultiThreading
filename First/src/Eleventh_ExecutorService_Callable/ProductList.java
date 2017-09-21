package Eleventh_ExecutorService_Callable;

import java.util.ArrayDeque;

/**
 * Created by Никита Мельник on 21.09.2017.
 */
public class ProductList {

    private static ArrayDeque<String> list = new ArrayDeque<String>() {
        {
            this.add("Product 1");
            this.add("Product 2");
            this.add("Product 3");
            this.add("Product 4");
            this.add("Product 5");
        }
    };

    public static String getProduct() {
        return list.poll();
    }
}
