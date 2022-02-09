package SleepAndWait;

public class SleepNwait {
		private static Object o = new Object();	
		public static void main(String[] args) throws InterruptedException
		{
			System.out.println("Thread Going to sleep...");
			Thread.sleep(1000);
			System.out.println("Thread woke up after 1 second.");
			
			synchronized(o)
			{
				System.out.println("Thread will wait for notify...");
				o.wait();
			}
			
			System.out.println("Thread woken up after notify() or notifyAll() or timeout.");
		}
	}