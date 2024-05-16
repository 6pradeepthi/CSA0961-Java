import java.util.*;
class circle
{
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	int r;
	double pie,area;
	System.out.println("enter the value of r");
	r=sc.nextInt();
	System.out.println("enter the value of pie");
	pie=sc.nextDouble();
	area=pie*r*r;
	System.out.println("area of circle="+area);
	}
}