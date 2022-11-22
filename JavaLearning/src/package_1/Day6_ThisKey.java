package package_1;

public class Day6_ThisKey 
{
	int num;
	public void m1(int num) {
		this.num=num;
	}
	public static void main(String[] args) {
		Day6_ThisKey obj = new Day6_ThisKey();
		int number=obj.num=10;
		System.out.println("Value of num "+number);
	}

}
