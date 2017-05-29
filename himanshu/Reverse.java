class Reverse
{
	int a=12213;
	int rev=0;
	int rem=0;
	public static void main(String arr[])
	{
		System.out.println("aa");
		Reverse r=new Reverse();
		r.reverse();
	}
	public void reverse()
	{
		while(a>0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;	
		}
		System.out.println("Reverse of a number is: "+rev);
	}
}