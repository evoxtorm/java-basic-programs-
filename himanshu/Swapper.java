class Swapper
{
	int a,b;
	public Swapper(int a,int b)
	{
		this.a=a;
		this.b=b;	
	}
	public Swapper swap()
	{
		a=a+b;
		b=a-b;
		a=a-b;	
		return this;
	}
	public Swapper display()
	{
		System.out.println("A"+a);
		System.out.println("B"+b);
		return this;
	}
	public static void main(String arr[])
	{
		//Swapper s=new Swapper(10,20);
		//s.display();
		//s.swap();
		//s.display();	
		new Swapper(10,20).display().swap().display();	
	}
}