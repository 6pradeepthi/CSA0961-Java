import java.util.*;
class simple1
{
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	int p,t;
	double r,interest;
	System.out.println("enter the p value");
	p=sc.nextInt();
	System.out.println("enter the t value");
	t=sc.nextInt();
	System.out.println("enter the r value");
	r=sc.nextDouble();
	interest=(p*t*r)/100;
	System.out.println("simple interest="+interest);
	}
}