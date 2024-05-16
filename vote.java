import java.util.*;
class vote
{
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	int age;
	System.out.println("enter the age");
	age=sc.nextInt();
	if(age>=18)
		System.out.println("eliglible");
	else
		System.out.println("not eliglible");
	System.out.println("you are eligible after="+(18-age));
	}
}