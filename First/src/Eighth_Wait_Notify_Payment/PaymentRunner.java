package Eighth_Wait_Notify_Payment;

public class PaymentRunner {

    public static void main(String[] args) {
        final Payment payment = new Payment();

        new Thread() {
            @Override
            public void run() {
                payment.doPayment();
            }
        }.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (payment) {
            System.out.println("Init amount: ");
            payment.initAmount();
            payment.notify();
        }

        synchronized (payment) {
            try {
                payment.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Amount: " + payment.getAmount() );
            System.out.println("OK");
        }

    }


}
