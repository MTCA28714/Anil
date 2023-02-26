import java.util.*;
public class Program306c
{
	static void displaymonth(int month_no)
	{
		String s=new String();
if(month_no==0) s="january";
if(month_no==1) s="february";
if(month_no==2) s="march";
if(month_no==3) s="april";
if(month_no==4) s="may";
if(month_no==5) s="june";
if(month_no==6) s="july";
if(month_no==7) s="auguest";
if(month_no==8) s="september";
if(month_no==9) s="october";
if(month_no==10) s="november";
if(month_no==11) s="decembar";
if(month_no<0||month_no>11) s="Incorrect month number";
System.out.println("Month is:"+ s);
	}
public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the month number(0-11):");
	int month_no= sc.nextInt();
	displaymonth(month_no);
	}
}