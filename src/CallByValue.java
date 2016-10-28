
public class CallByValue
{
	public static void passPrimitive(int param) // param is FORMAL PARAMETER
	{
		System.out.println("Before: "+param);
		param = 47;
		System.out.println("After: "+param);
	}
	
	public static void passReference(String param) // param is FORMAL PARAMETER
	{
		System.out.println(param);
	}
	
	public static void main(String[] args)
	{
		int num = 47+29*29;
		System.out.println("Before: "+num);
		passPrimitive(47+29*29); // ACTUAL PARAMETER or ARGUMENT is passed
		System.out.println("After: "+num);
		String s = "Moxie";		 // => can be any *expression* of compatible type
		passReference(s);
		System.out.println("String: "+s);
	}

}

class Mutable
{
	private int myValue = 47;
	
	public Mutable()
	{
	}
	
	public void changeMyValueTo(int newValue)
	{
		myValue = newValue;
	}
	
	public int getMyValue()
	{
		return myValue;
	}
	
}
