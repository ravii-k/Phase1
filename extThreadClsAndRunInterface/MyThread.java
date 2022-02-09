package extThreadClsAndRunInterface;
public class MyThread extends Thread {
	
	 public void run()
	 {
	   System.out.println("Running New thread");
	 }
	 public static void main(String[] args)
	 {
	  System.out.println("Running Main thread");	 

	// Creating an object of MyThread class	 
	   MyThread th = new MyThread();

	// Creating an object of Thread class and pass the object reference variable th.   
	   Thread t = new Thread(th);
	   
	// Now run thread on the object.
	   t.start();
	   // This thread will execute statements inside run() method of MyThread object.
	 }
	}