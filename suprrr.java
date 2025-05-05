class Parent
{
	String name="Abc";
	Parent(String color)
	{
		System.out.println("Color:"+color);
	}
	void display()
	{
		System.out.println("parent class");
	}
	
}
class Child extends Parent
{
	String name="chg";
	Child()
	{
		super("white");
		System.out.println("child constructor");
	}
	void display()
	{
		super.display();  //super method
		System.out.println("child class");
		
	}
	void Naam()
	{
		System.out.println(super.name); //super variable
		System.out.println(name);
	}*9+
 

}

class suprrr
{
	
	public  static void main(String[] args)
	{
		Child obj=new Child();
		obj.display();
		obj.Naam();
	}

}