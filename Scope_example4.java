class Scope_example4
{
	public static void main(String[]args)
	{
		System.out.println("this is example to understand|Scope of variable");
		int i;
		i=15;
		{
			System.out.println("we are in anew black");
			int j;
			 j=10;
			j=i*i;
			System.out.println("iandj in new black are"+i+" "+j);
		}
		int k;
		k=i+2;
		int j;
		j=k+100;
		System.out.println("iandj out of the new black are"+i+" "+j);
	}
}