package extThreadClsAndRunInterface;

public class MyRunnableThread implements Runnable {

	 public void run()
	 {
	  System.out.println("New thread running ");
	  for(int i = 1; i <= 5; i++)
	  {
	   System.out.println(i);  
	  }
	 System.out.println(Thread.currentThread());
	}
	public static void main(String[] args)
	{
	 System.out.println("Main thread running");	 

	   MyRunnableThread th = new MyRunnableThread();

	   Thread t = new Thread(th);
	   
	   t.start(); 
	   // This thread will execute statements inside run() method of MyThread object.
	 }
	}