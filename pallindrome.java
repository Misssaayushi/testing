class pallindrome
{
	public static void main(String[] args)
	{
		int l=args.length;
		String num=args[0];
		int left=0;
		int right=num.length() -1;
		while(left<right)
		{
			if(num.charAt(left)!=num.charAt(right))
			{
				System.out.println(num+" is not pallindrome");
				return;
			}
			left++;
			right--;
		}
			System.out.println(num+" is  pallindrome");

	}
}