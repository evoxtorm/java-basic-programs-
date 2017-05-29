interface A
{
	static final int Z=10;
	abstract public void show();

}
interface B
{
	abstract public void display();
}
class TestInterface2 implements A,B
{
	public void show()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=0;l<i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void display()
	{
		for(int i=5;i<0;i++)
		{
			for(int j=1;j>=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k--)
			{
				System.out.print("*");
			}
			for(int l=0;l<i;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String arr[])
	{
		System.out.println("see this");
		TestInterface2 i=new TestInterface2();
		i.show();
		i.display();
	}
}	