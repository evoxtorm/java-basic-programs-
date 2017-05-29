class TestVarArgs
{
	public void display(int... value)
	{
		for(int i=0;i<value.length;i++)
		{
			System.out.println(value[i]);
		}
	}
	public static void main(String arr[])
	{
		TestVarArgs v=new TestVarArgs();
		v.display(10,20,30,50,60,70);
		v.display(100,200);
		v.display(1000);
	}
}