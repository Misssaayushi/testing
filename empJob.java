import java.util.Scanner;

class empJob
{
	Scanner s=new Scanner(System.in);
	int marks;
	void input()
	{
		
		System.out.print("enter your 12th percentage:");
		marks=s.nextInt();

	}
	void check()
	{
		if(marks>75)
		{
			System.out.print("congratulations you are selected!!");
		}
		else
		{
			System.out.print("Oops! better luck next time");
		}
	}
	
	public static void main(String[] args)
	{
		empJob obj=new empJob();
		obj.input();
		obj.check();
	}

}