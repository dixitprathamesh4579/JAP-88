class pattern153
{
	public static void main(String[] args)
	{
		int n=5;
		int count1=n;
		int count2=n*(n+1)/2;
		for(int i=n;i>=1;i--)
		{
			int c1=count1;
			int c2=count2;
			for(int j=i;j>1;j--)
			{
				System.out.print("\t");
			}
			for(int j1=i,j2=i;j1<=n||j2<n;j1++,j2++)
			{
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+64));
				System.out.print("\t");	
				c1-=j1+1;
				c2+=j2;
			}
			count1+=i-1;
			count2-=i;
			System.out.println();
			
		}
	}
}