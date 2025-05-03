class fun_overloading
{
	int fun(int a, int b)
	{
		return (a+b);
	}
	float fun(float a,int b)
	{
		return (a+b);
	}
	double fun(int a, float b)
	{
		return (a+b);
	}
	public static void main(String[] args)
	{
		fun_overloading obj=new fun_overloading();
		System.out.println(obj.fun(4,5));
		System.out.println(obj.fun(4.8f,95));
		System.out.println(obj.fun(40,15.9f));
		
	}

}