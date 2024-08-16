package ImportantPrograms;

public class MultiThreading 
{

	public static void main(String[] args)
	{
		  
		        MyThread thread1 = new MyThread();
		        MyThread thread2 = new MyThread();

		        thread1.start(); // Start thread1
		        thread2.start(); // Start thread2
		    }
		}
		class MyThread extends Thread 
		{
		    public void run() {
		        for (int i = 1; i <= 5; i++) 
		        {
		            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
		            try {
		                Thread.sleep(500); // Pause for 500 milliseconds
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        }
		    }
		}

		 


