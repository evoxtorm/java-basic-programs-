final class A
{
	public void display()
	{
		System.out.println("Inside A");
	}
}
class B extends A
{
	public void display()
	{
		System.out.println("Inside B");
	}
}
class TestFinal2
{
	public static void main(String arr[])
	{
		B b=new B();
		b.display();
	}
}