package mamathaQuestion18;

public class ThreadTwiceDemo {
	public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // starts the thread
        t.start(); // tries to start the same thread again
    }
}
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread started");
    }
}
