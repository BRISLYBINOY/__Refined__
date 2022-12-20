import java.util.Random;
import java.util.random.*;

class EvenOrOdd extends Thread
{
	int rNumber;
	public void run()
	{
		if(rNumber%2==0)
		{
			System.out.println(" The number " +rNumber+" is even");
		}
		else
		{
			System.out.println(" The number " +rNumber+" is odd");
		}
	}
}

public class Thread2
{

	public static void main(String[] args)
	{
		EvenOrOdd even = new EvenOrOdd();
		even.start();
		Random rand = new Random();
		even.rNumber = rand.nextInt();
	}
}
