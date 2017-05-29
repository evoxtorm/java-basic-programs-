public class DivideException 
{
	public static void main(String arr[])
	{
		int c=0;
		try
		{
			int a=Integer.parseInt(arr[0]);
			int b=Integer.parseInt(arr[1]);
			c=a/b;
		}
		catch (ArithmeticException aie) 
		{
			System.out.println("Second no must not be zero");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Both no must not be numeric");
		}
		catch(ArrayIndexOutOfBoundsException aiobe)
		{
			System.out.println("Please enter two no to divide");
		}
		catch(Exception e)
		{
			System.out.println("There is some Exception"+e);
		}
		finally
		{
			System.out.println("Inside Finally Block");
			System.out.println("Divide Result:"+c);
		}
			
	}
}
