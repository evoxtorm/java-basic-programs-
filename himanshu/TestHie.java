class A
{
	int a=10;
	int b=20;
	public void display()
	{
		System.out.println("A "+a+"\nB "+b);
	}
}
class B extends A
{
	int sum=a+b;
	public void display()
	{
		System.out.println("Sum "+sum);
	}
}
class C extends A
{
	double avg=(a+b)/2;
	public void display()
	{
		System.out.println("Average "+avg);	
	}
}
class TestHie
{
	public static void main(String arr[])
	{
		A a=new A();
		a.display();
		B b=new B();
		b.display();
		C c=new C();
		c.display();
	}
}