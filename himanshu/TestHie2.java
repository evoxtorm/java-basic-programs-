class A
{
	int a=20;
	int b=30;
	public void presents()
	{
		System.out.println("A "+a+"\nB "+b);
	}
}
class B extends A
{
	int sum=a+b;
	public void presents()
	{
		System.out.println("Sum "+sum);
	}
}
class C extends A
{
	double div=(a+b)/2;
	public void presents()
	{
		System.out.println("Divide "+div);
	}
}
class TestHie2
{
	public static void main(String[] args) 
	{
		A a=new A();
		a.presents();
		B b=new B();
		b.presents();
		C c=new C();
		c.presents();	
	}
}