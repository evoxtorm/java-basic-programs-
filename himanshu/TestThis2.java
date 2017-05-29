class TestThis2
{
	int a,b,c;
	public TestThis2(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;		
	}
	public TestThis2(int a)
	{
		this(a,20,30);
	}
	public TestThis2(int a,int b)
	{
		this(a,b,90);
	}
	public TestThis2()
	{
		this(40,50,60);	
	}
	public void display()
	{
		System.out.println("A "+a);
		System.out.println("B "+b);
		System.out.println("C "+c);
	}
	public static void main(String arr[])
	{
		TestThis2 a=new TestThis2();
		a.display();
		TestThis2 b=new TestThis2(10);
		b.display();
		TestThis2 c=new TestThis2(70,80);
		c.display();
	}
}