import java.util.Scanner;
class MyDate
{
	public int day;
	public int month;
	public int year;
}
class Test6
{
	public static void main(String[]args)
	{
		int day,month,year;
		MyDate ob1=new MyDate();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day");
		ob1.day=sc.nextInt();
		System.out.println("Enter the month");
		ob1.month=sc.nextInt();
		System.out.println("Enter the year");
		ob1.year=sc.nextInt();
		System.out.println(ob1.day+"-"+ob1.month+"-"+ob1.year);
	}
}