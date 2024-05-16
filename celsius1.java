import java.util.*;
class celsius
{
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	double f,c;
	System.out.println("enter the fahrenheit");
	f=sc.nextDouble();
	c=(f-32)*0.5;
	System.out.println("convert fahrenheit to celsius="+c);
	}
}