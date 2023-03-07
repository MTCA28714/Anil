import java.util.*;
public class Sumofeven
{
 public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int sumeven=0;
		System.out.println("Enter 10 array elements");
		int Arr[]=new int[10];
		for(int i=0;i<Arr.length;i++)
			Arr[i]=sc.nextInt();
		for(int j=0;j<Arr.length;j++)
		{
			if(Arr[j]%2==0)
		{
		sumeven=sumeven+Arr[j];
	}
}
System.out.println("sum of even numbers:"+sumeven);
}
}
