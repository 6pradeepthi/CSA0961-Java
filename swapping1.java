import java.util.*;
class swapping1
{
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	int x,y;
	System.out.println("enter the value of x");
	x=sc.nextInt();
	System.out.println("enter the value of y");
	y=sc.nextInt();
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("after swapping="+x);
	System.out.println("after swapping="+y);
	}
}
