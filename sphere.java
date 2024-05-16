import java.util.*;
class sphere
{
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	int r;
	double pie,volume;
	System.out.println("enter the r value");
	r=sc.nextInt();
	System.out.println("enter the pie value");
	pie=sc.nextDouble();
	volume=(1.3)*pie*r*r*r;
	System.out.println("volume of square="+volume);
	}
}
	