 class Divide{
	public static void main(String srr[])
	{
		try{
		if(srr.length<2)
		throw(new Exception ("Two arguments must be provided"));
		int a= Integer.parseInt(srr[0]);
		int b= Integer.parseInt(srr[1]);
		if(b==0)
		throw(new Exception("Second no. must be non Zero"));
		int c= a/b;
		System.out.println("Result is :"+c);
		}catch (Exception e)//generalized exception handler
		{
			System.out.println(e);}
		}}

