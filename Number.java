import java.util.Scanner;
class Number    
{
	public static int sumDigit(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[]args)
	{
		Number ob1=new Number();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int temp=sc.nextInt();
	    int res=ob1.sumDigit(temp);
		System.out.println("sum of digets of"+temp+"is"+res);
	}
}