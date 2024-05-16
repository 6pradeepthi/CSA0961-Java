import java.util.*;
class biggest
{
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	int a,b;
	System.out.println("enter the a value");
	a=sc.nextInt();
	System.out.println("enter the b value");
	b=sc.nextInt();

	if(a>b)
		System.out.println("a is biggest number="+a);
	else
		System.out.println("b is biggest number="+b);
	}
}