class TestThis1
{
	int a=10,b=20;
	public TestThis1(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void display()
	{
		System.out.println("A "+a+"\nB "+b);
	}
	public static void main(String arr[])
	{
		TestThis1 a=new TestThis1(30,40);
		a.display();
	}
}