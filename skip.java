class skip
{
	public static void main(String arg[])
	{
	int m,n,skip;
	m=50;
	n=100;
	skip=8;
	while(m<=n)
	{
	if(m==skip)
	{
		m++;
		continue;
	}
	System.out.println(m);
	m++;
	}
	}
}