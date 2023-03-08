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
	public boolean checkprime()
	{
		if(this.num==1||this.num==2)
			return true;
		for(int i=2;i<this.num;i++)
		{
			if(this.num%i==0)
				return false;
		}
		return true;
	}
}
	class Test147
	{
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int Count=0;
		System.out.println("Enter a no:");
		int Size=sc.nextInt();
		int[]numList=new int[Size];
		int[]numPrime=new int[Size];
		System.out.println("Enter"+Size+"nos:");
		for(int i=0;i<Size;i++)
			{
			numList[i]=sc.nextInt();
			}
		Number ob1=new Number();
		for(int i=0;i<Size;i++)
			{
		ob1.setNum(numList[i]);
		if(ob1.checkprime())
				{
			numPrime[i]=ob1.getNum();
			Count++;
				}
			else
				{
				numPrime[i]=0;
				}
			}
			for(int i=0;i<Size;i++)
			{
				if(numPrime[i]!=0)
					System.out.println(numPrime[i]+",");
			}
			System.out.println("\n total Prime numbers in input array is"+Count);
	}
}


