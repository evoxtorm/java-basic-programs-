class A
{	
	public String toString()
	{
		return "Inside A";
	}
}
class B
{
	public String toString()
	{
		return  "Inside B";
	}
}
class C
{
	public String toString()
	{
		return  "Inside C";
	}
}
class D
{
	public static void main(String arr[])
	{
		A a=new A();
		B b=new B();
		C c=new C();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}