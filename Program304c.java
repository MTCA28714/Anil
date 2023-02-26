import java.util.Scanner;
public class Program304c
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=(a+b)-(b=a);
		System.out.println("Number after Swapping:"+a+" "+b);
	}
}
		
