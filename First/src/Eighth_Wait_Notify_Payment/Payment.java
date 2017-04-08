package Eighth_Wait_Notify_Payment;

import java.util.Scanner;

public class Payment {

    private int amount;
    private boolean close;

    public int getAmount() {
        return amount;
    }

    public boolean isClose() {
        return close;
    }

    public synchronized void doPayment() {
        System.out.println("Start payment: ");
        while (amount <=0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        close = true;
        System.out.println("Payment is closed: " + close);
    }

    public void initAmount() {
        Scanner scan = new Scanner(System.in);
        amount = scan.nextInt();
    }
}
