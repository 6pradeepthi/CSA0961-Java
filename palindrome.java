import java.util.*;
class palindrome
{
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
 	int n,rev=0,data,rem;
	System.out.println("enter the n");
	n=sc.nextInt();
	data=n;
	while(n!=0)
	{
	rem=n%10;
	rev=rev*10+rem;
	n=n/10;
	}
	if(data==rev)
	{
	System.out.println("palindrome");
	}
	else
	{
	System.out.println("not a palindrome");
	}
	}
}