// 0. fix any bugs
// 1. refactor the following, introducing methods with descriptive names
// 2. create a method public String numberToEnglish(int) which does this translation
// 2. try to handle < 999
// 3. use the provided String arrays (if you see how)

public class NumberToEnglish2
{
	public static void main(String[] args)
	{

		StdOut.print("Enter 0 <= N < 100: ");

		int N = StdIn.readInt();
		
		numberToEnglish(N);
		
		System.out.print("Do you want to continue? Y/N: ");
		String answer = StdIn.readString();
		
	}

	public static String numberToEnglish(int num)
	{
		for(int i=0; i<999; i++)
		{
			if(num == i)
			{
				if(i<10)
				{
					System.out.println("your number in English is --> "+onesEnglish[i]);
				}else if(i >=10 && i <= 19)
				{
					int index = i - 10;
					System.out.println("your number in English is --> "+teensEnglish[index]);
				}else if(i >=20 && i <= 90)
				{
					double index = i % 10;
					if(index==0)
					{
						double tens = (i / 10)-1;
						System.out.println("your number in English is --> "+tensEnglish[(int)tens]);
					}else if(index > 0)
					{
						double tens = (i / 10)-1;
						System.out.println("your number in English is --> "+tensEnglish[(int)tens]+onesEnglish[(int)index]);
					}
				}else if(i >= 100 && i<= 900)
				{
					double tens = i % 100; // 235 / 100 = 35
					double ones = tens % 10;
					if(tens==0)
					{
						double hundreds = (i / 100);
						System.out.println("your number in English is --> "+onesEnglish[(int)hundreds]+" hundred");
					}else if(tens > 0)
					{
						double hundreds = (i/100);
						if(tens-ones==0)
						{
							System.out.println("your number in English is --> "+onesEnglish[(int)hundreds]+" hundred and "+onesEnglish[(int)tens]);
						}else if(tens >= 10 && tens < 20)
						{
							tens = (tens %10) ;
							System.out.println("your number in English is --> "+onesEnglish[(int)hundreds]+" hundred and "+teensEnglish[(int)tens]);
						}else if(tens >=20 && tens <= 99)
						{
							tens = (tens /10) ;
							
							double noDecimal = Math.floor(tens) -1;
							if(ones==0)
							{
								System.out.println("your number in English is --> "+onesEnglish[(int)hundreds]+" hundred and "+tensEnglish[(int)noDecimal]);
							}else if(ones>0)
							{
								System.out.println("your number in English is --> "+onesEnglish[(int)hundreds]+" hundred and "+tensEnglish[(int)noDecimal]+" "+onesEnglish[(int)ones]);
							}
						}
					}
				}
			}
		}
		return "?"; // we'll refactor the above into this method...
	}
	
	
	// the following might be useful for further refactoring...
	
	public static String[] onesEnglish =
	{ "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

	public static String[] teensEnglish =
	{ "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	public static String[] tensEnglish =
	{ "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
	
}
