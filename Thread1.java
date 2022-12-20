class ThreadA extends Thread
{
	public void run()
	{
		System.out.println("I am Thread A");
	}
}

class ThreadB extends Thread
{
	public void run()
	{
		System.out.println("I am Thread B");
	}
}
public class Thread1 
 {
   public static void main(String[] args)
   {
	   ThreadA threadA = new ThreadA();
	   ThreadB threadB = new ThreadB();
	   threadA.start();
	   threadB.start();
   }
}
