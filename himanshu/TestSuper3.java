class A extends Object
{
	public A()
	{
		super();
		System.out.println("Inside A");
	}
}
class B extends A
{
	public B()
	{
		super();
		System.out.println("Inside B");
	}
}
class C extends B
{
	public C()
	{
		super();
		System.out.println("Inside C");
	}
}
class TestSuper3
{
	public static void main(String arr[])
	{
		A a=new A();
		B b=new B();
		C c=new C();
	}
}