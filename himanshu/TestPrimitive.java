class TestPrimitive
{
	public static void display(String a)
	{
		System.out.println(a);
	}
	public static void main(String arr[])
	{
		int a=10;
		boolean b=false;
		char c='A';
		double d=12.67;
		display(Integer.toString(a));
		display(Boolean.toString(b));
		display(Character.toString(c));
		display(Double.toString(d));	
	}
}