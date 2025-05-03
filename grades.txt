import java.util.Scanner;

class grades
{
	
	void input()
	{
		Scanner s=new Scanner(System.in);
		String grade;
		System.out.print("enter  your grade=");
		grade=s.next();
		
		String c=grade.toUpperCase();
		
		if(c=="F")
		{

			System.out.println("not allowed");
		}
		else
		{
			System.out.println("your grade is ="+c);
		}
	}
	public static void main(String[] args)
	{
		grades obj=new grades();
		obj.input();
	}

}