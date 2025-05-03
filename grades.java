import java.util.Scanner;

class NotAllowed extends Exception
{
	NotAllowed(String m)
	{		
		super(m);	
	}
}

class grades
{
	
	void input()
	{
		Scanner s=new Scanner(System.in);
		String grade;
		System.out.print("enter  your grade=");
		grade=s.next();
		
		String c=grade.toUpperCase();
		
		try
		{

			if(c.equals("F"))
			{

				throw new NotAllowed("caught an exception : you are not allowed");
			}
			else
			{
				System.out.println("your grade is ="+c);
			}
		}
		catch(NotAllowed e)
		{
			System.out.println(e);
		}
		
	}
	public static void main(String[] args)
	{
		grades obj=new grades();
		obj.input();
	}

}