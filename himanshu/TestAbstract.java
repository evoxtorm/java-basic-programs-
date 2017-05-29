abstract class A
{
	abstract public void display();
	public static void show()
	{
		System.out.println("Inside Show");
	}
}
class TestAbstract extends A
{
	public void display()
	{
		System.out.println("Inside display");
	}
	public static void main(String[] args)
	{
		show();
	}	
}