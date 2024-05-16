import java.util.*;
class swapping
{
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	int temp,a,b;
	System.out.println("enter the a value");
	a=sc.nextInt();
	System.out.println("enter the b value");
	b=sc.nextInt();
	temp=a;
	a=b;
	b=temp;
	System.out.println("after swapping="+a);
	System.out.println("after swapping="+b);
	}
}