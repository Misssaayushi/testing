import java.util.Scanner;

class InvalidNumberOfArguements extends Exception
{
	InvalidNumberOfArguements(String msg)
	{
		super(msg);
	}
		
}

class arm
{
	Scanner s=new Scanner(System.in);
	
	void input()
	{
		System.out.print("enter any number=");
		int n=s.nextInt();
	
		int l=String.valueOf(n).length();
		int temp=n;
		double sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+Math.pow(rem,l);
			n=n/10;
		}
		try
		{
			if(temp==sum)
				System.out.println(temp+" is arm strong number");
			else
				throw new InvalidNumberOfArguements(temp+" is not arm strong number");
		}
		catch(InvalidNumberOfArguements e)
		{
			System.out.print("caught exception "+e);
		}	
		
	}
	public static void main(String[] args)
	{
		arm obj=new arm();
		obj.input();
	}
}