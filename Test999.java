import java.util.Scanner;
class Test999
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		Double principal,rate,time;
		principal=sc.nextDouble();
		rate=sc.nextDouble();
		time=sc.nextDouble();
		Double CI=principal*(Math.pow((1+rate/100),time));
		System.out.println("compound intrest is="+CI);
	}
}
