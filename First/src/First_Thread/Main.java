package First_Thread;

public class Main {
    public static void main(String[] args) {

        TalkThread talkThread = new TalkThread();
        Thread walk = new Thread(new WalkRunnable());

        System.out.println(talkThread.getState()); //NEW Thread

        talkThread.start();
        walk.start();

        System.out.println(walk.getState()); //RUNNABLE Thread

    }
}
