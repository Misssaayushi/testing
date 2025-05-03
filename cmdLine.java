import java.util.Scanner;

class InvalidNumberOfArguements extends Exception
{
	InvalidNumberOfArguements(String msg)
	{
		super(msg);
	}
		
}

class cmdLine 
{
	public static void main(String[] args)
	{
		int l=args.length;
		try
		{
			if(l>2)
			throw new InvalidNumberOfArguements("more than 2 values are not allowed");
		else
			System.out.println("you entered"+args[0]+" & "+args[1]);
		}
		catch(InvalidNumberOfArguements e)
		{
			System.out.print("caught an exception "+e);
		}
		

	}
	
}