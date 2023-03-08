import java.util.Scanner;
class Number
{
	private int num;
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return this.num;
	}
	public int checkLength()
	{
		int n=this.num;
		if(n<0)n=-n;
		if(n==0)return 1;
		int len=0;
		while(n>0)
		{
			n=n/10;
			len++;
		}
		return len;
	}
}
class Test258
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int temp=sc.nextInt();
		Number ob1=new Number();
		ob1.setNum(temp);
		System.out.println("\n"+ob1.checkLength());
}
}