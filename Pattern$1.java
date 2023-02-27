class Pattern$1
{
	static void printpatternoneRow(char ch,int nc)
{
		for(int i=0;i<nc;i++)
	{
			System.out.print(ch);
	}
	System.out.print("\n");
}
static void printpattern(int nr,char ch)
	{
	for(int i=nr;i>0;i--)
		{
		printpatternoneRow(ch,i);
		}
}
public static void main(String[]args)
	{
	printpattern(6,'$');
	}
}
