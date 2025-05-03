import java.util.Scanner;

class staticEmp
{
	Scanner s=new Scanner(System.in);
	static int total=0;
	static String company="jio";
	String name[];
	int n;
	void input()
	{
		System.out.print("enter how many employees:");
		n=s.nextInt();
		name=new String[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("enter name of "+(i+1)+" employee name=");
			name[i]=s.next();	
			total=total+1;
		}
	}
	void display()
	{	
		for(int j=0;j<n;j++)	
		{
			System.out.print("name of "+(j+1)+" employee="+name[j]);
			System.out.println(" "+"company name="+company);
			
		}
		System.out.println("total employee="+total);
	}
	public static void main(String[] args)
	{
		staticEmp obj=new staticEmp();
		obj.input();
		obj.display();
	}

}