package package_1;

public class Day1 {
	int roll_no;
	int age;
	public void display1() 
	{
		System.out.println("Welcome to automation");
	}
	public void display2() 
	{
		System.out.println("Automation is very easy");
	}
	public static void main (String[] args) {
		Day1 d = new Day1();
		d.display1();
		d.display2();
		d.roll_no=23;
		d.age=30;
		System.out.println(d.roll_no);
		System.out.println(d.age);
	}
		

}
