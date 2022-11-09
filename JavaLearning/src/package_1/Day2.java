package package_1;
// (((((10+2)+2)-2)*2)/2)

public class Day2 
{
	public int addition(int a, int b) 
		{
			return a+b;
		}
	public int subtraction(int c, int d)
		{
			return c-d;
		}
	public int multiply(int e, int f)
	{
		return e*f;
	}
	public int division(int g, int h)
	{
		return g/h;
	}	
	public static void main (String[] args)
	{
		Day2 d2= new Day2();
		int sum=d2.addition(10, 2);
		int result1=d2.addition(sum, 2);
		int result2=d2.subtraction(result1, 2);
		int result3=d2.multiply(result2, 2);
		System.out.println(d2.division(result3, 2));
	}
}
