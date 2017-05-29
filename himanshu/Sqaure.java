class InvalidRangeException extends Exception
{
	public InvalidRangeException()
	{
		super();
	}
	public InvalidRangeException(String desc)
	{
		super(desc);
	}
}
class Sqaure
{
	public static void main(String arr[]){
	try
	{
		int a= Integer.parseInt(arr[0]);
		if (a<10||a>50)
		throw (new InvalidRangeException ("Number must be between 10 to 50"));
		int s=a*a;
		System.out.println("Squre is :"+ s);
	}
	catch(Exception e)
	{
		System.out.println(e);
}}}
