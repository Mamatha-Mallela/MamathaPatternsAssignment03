package mamathaQuestion19;

public class ThreadImplementation01 {
	 public static void main(String[] args) {
	        MyThread t = new MyThread();
	        t.start(); // starts the thread
	    }
}
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}
