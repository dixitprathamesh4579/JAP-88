class pattern156
{
	public static void main(String[] args)
	{
		int n=5;
		int count1=n;
		int count2=n;
		for(int i=1;i<=n;i++)
		{
			int c1=count1;
			int c2=count2;
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+64));
				System.out.print("\t");
				c1--;
				c2+=j-1;
			}
			count1+=n-i;
			count2--;
			System.out.println();
		}
	}
}