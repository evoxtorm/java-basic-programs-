class TestOverloading
{
	public void display()
	{
		System.out.println("Inside default method");
	}
	public void display(int a)
	{
		System.out.println("Inside One Parameterized method, A: "+a);
	}
	public void display(double a)
	{
		System.out.println("Inside One Parameterized method, A: "+a);
	}
	public void display(int a,int b)
	{
		System.out.println("Inside Two Parameterized method, A: "+a+ "B: "+b);
	}
	public static void main(String arr[])
	{
		TestOverloading a=new TestOverloading();
		a.display();
		a.display(10);	
		a.display(10.78);
		a.display(20,30);
	}
}