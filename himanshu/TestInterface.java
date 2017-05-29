interface A
{
	static final int ABC=10;
	abstract public void display();
}
interface B
{
	abstract public void show();
}
class TestInterface implements A,B
{
	public void display()
	{
		System.out.println("Inside Display()");
	}
	public void show()
	{
		System.out.println("Inside show()");
	}
	public static void main(String arr[])
	{
		System.out.println("Inside TestInterface class");
		TestInterface i=new TestInterface();
		i.display();
		i.show(); 	
	}
}