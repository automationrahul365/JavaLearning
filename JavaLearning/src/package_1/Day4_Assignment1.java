package package_1;

public class Day4_Assignment1 extends Day4_Assignment
{

	public Day4_Assignment1()
	{
		this(1,2);
		System.out.println("Child Default constructor");
	}
	public Day4_Assignment1(int a)
	{
		this();
		System.out.println("Child One parameterized constructor");
	}
	public Day4_Assignment1(int a, int b)
	{
		super(1,2);
		System.out.println("Child Two parameterized constructor");
	}
	public Day4_Assignment1(int a, int b, int c)
	{
		
		this(1);
		System.out.println("Child Three parameterized constructor");
		
	}
	public static void main(String[] args) {
		Day4_Assignment1 obj = new Day4_Assignment1(1,2,3);
	}
}
