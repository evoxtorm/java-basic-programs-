class A
{
	int a=10;
	public void display()
	{
		System.out.println("A "+a);
	}
}
class B extends A
{
	int a=20;
	
	public void display()
	{
		super.display();
		//System.out.println("Value of Parent Data Menber"+super.a);
		System.out.println("Value of Child Data Menber"+a);
	}	
}
class TestSuper1
{
	public static void main(String arr[])
	{
		B b=new B();
		b.display();
	}
}