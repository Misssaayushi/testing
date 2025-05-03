class item
{
	String name;
	double code;
	float price;
	int quantity;

	item(String name,double code,float price,int quantity)
	{
		this.name=name;
		System.out.println("your item name="+name);
		this.code=code;
		System.out.println("your item code="+code);
		this.price=price;
		System.out.println("your item price="+price);
		this.quantity=quantity;
		System.out.println("your item quantity="+quantity);
		
	}

	public static void main(String[] args)
	{
		item obj=new item("laptop",749018369,890000f,50);
	}
}