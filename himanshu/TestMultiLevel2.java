class A 
{
	int a=30;
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
class C extends B
{
	float div=sum/a;
	public void display()
	{
		System.out.println("Divide"+div);
	}
}
class TestMultiLevel2
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