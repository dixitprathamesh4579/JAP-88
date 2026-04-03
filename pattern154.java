class pattern154
{
public static void main(String [] args)
{
	int n=5;
	int count1=n*(n+1)/2;
	int count2=1;
	for(int i=n;i>=1;i--)
	{
		int c1=count1;
		int c2=count2;
		
		for(int j=i;j>1;j--)
		{
		    System.out.print("\t");
		}
		for(int j=i;j<=n;j++)	
		{
			System.out.print((char)(c1+64));
			System.out.print((char)(c2+64));
			c1+=j;
			c2--;
			System.out.print("\t");
		}
		count1-=i;
	    count2+=i;
		System.out.println();
	}
}	
}