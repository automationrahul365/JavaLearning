package package_1;

public class Day3 
{
	public Day3()
	{
		this(1,2,3,4);
		System.out.println("Default constructor");
	}
	public Day3(int a)
	{
		this();
		System.out.println("One parameterized constructor");
	}
	public Day3(int a, int b)
	{
		this(1,2,3);
		System.out.println("Two parameterized constructor");
	}
	public Day3(int a, int b, int c)
	{
		this(1);
		System.out.println("Three parameterized constructor");
	}
	public Day3(int a, int b, int c, int d)
	{
		
		System.out.println("Four parameterized constructor");
	}
public static void main(String[] args) {
	Day3 object= new Day3(3,3);
}
}
