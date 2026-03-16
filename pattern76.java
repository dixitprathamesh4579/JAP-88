class pattern76
{
	public static void main(String [] args)
	{
		int n =5;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			int c=count;
			
			for(int j=i;j<n;j++)
			{
			  System.out.print("\t");	
		    }
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+"\t");
				c+=n-j;
			}
			System.out.println();
			count++;
	}
}
}