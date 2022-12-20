import java.util.Random;
import java.util.random.*;

class Even extends Thread
{
	int rNumber;
	public void run()
	{
		while(true)
		{
		if(rNumber%2==0)
		{
			System.out.println(" The number " +rNumber+" is even");
		}
		}
	}
}

class Odd extends Thread
{
	int rNumber;
	public void run()
	{
		while(true)
		{
		if(rNumber%2!=0)
		{
			System.out.println(" The number " +rNumber+" is odd");
		}
		}
	}
}
public class Thread3
{

	public static void main(String[] args)
	{
		Even even = new Even();
		even.start();
		Odd odd = new Odd();
		odd.start();
		Random rand = new Random();
		for(int i=0; i<10;i++)
		{
		even.rNumber = rand.nextInt(10000);
	    }
	}
}