final class parent
{
	void show()
	{
		System.out.println("parent class");
	}
}
class child extends parent
{
	final void see()
	{
		System.out.println("child class");
	}
}
class child2 extends child
{
	void see()
	{
		System.out.println("child1 class");

	}
}
class finalConcept
{
	public static void main(String[] args)
	{
		final int a=10;
		a=a+10;
		System.out.println(a);
		child2 obj=new child2();
		obj.show();
		obj.see();
	}

}