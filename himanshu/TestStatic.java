class TestStatic
{
	static int a;
	int b;
	static
	{
		a=10;
	}
	
	public static void main(String arr[])
	{
		//System.out.println("A "+a);
		TestStatic.display();
		TestStatic s=new TestStatic();
		s.display();
	}
	public static void display()
	{
		System.out.println("A "+a);
	}
}