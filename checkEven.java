import java.util.Scanner;

class Even extends Exception
{
	Even(String msg)
	{
		super(msg);
	}
}

class checkEven
{	
	Scanner s=new Scanner(System.in);
	
	void check()
	{
		System.out.print("enter any number=");
		int n=s.nextInt();
		try
		{
			if(n%2==0)
			{
				throw new Even("the number is even");
			}
			else
			{
				System.out.print("your number is odd");
			}
		}
		catch(Even e)
		{
			System.out.print("caught exception="+e);
		}
		
	}
	
	public static void main(String[] args)
	{
		checkEven obj=new checkEven();
		obj.check();
	}
}