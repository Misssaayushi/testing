class animal
{
	void move()
	{
		System.out.println("animal is moving");
	}
}
class dog extends animal
{
	void move()
	{	
		super.move();
		System.out.println("dog is moving");
	}
}

class fun_overriding
{

	public static void main(String[] args)
	{
		dog obj=new dog();
		obj.move();
	}
}