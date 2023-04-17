package mamathaQuestion19;

public class ThreadImplementation02 {
	public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start(); // starts the thread
    }
}
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
}
