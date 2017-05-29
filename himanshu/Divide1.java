class Divide1
{
	public static int divide(int x,int y)
	{
	try
	{
		return (x/y);
	}
	catch(ArithmeticException e)
	{
	System.out.println("Arithmetic Exception cought in divide, rethrowing..");
	throw(e);
	}
	}
	public static void main(String srr[])
	{
		try
		{
		int x= Integer.parseInt(srr[0]);
		int y= Integer.parseInt(srr[1]);
		int z= divide(x,y);
		System.out.println("Result :"+ z);
	}
	catch(Exception e)
	{
		System.out.println("Following exception cougth in main...");
		System.out.println(e);
	}
}
}
