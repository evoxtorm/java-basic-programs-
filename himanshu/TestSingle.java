class A
{
	int a=10;
	public void display()
	{
		System.out.println("A: "+a);
	}
}
class B extends A
{
	int b=20;
	public void display()
	{
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		System.out.println("Sum "+(a+b));
	}
}
class TestSingle
{
	public static void main(String arr[])
	{
		B b=new B();
		b.display();
		A a=new A();
		a.display();
	}
}