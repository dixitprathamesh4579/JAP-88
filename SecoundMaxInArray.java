class SecoundMaxInArray
{
	public static void main(String[] args)
	{
		int a[]={11,14,13,15,12,16,17,20};
		int max=a[0];
		int smax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else
			{
				if(a[i]>smax&&a[i]!=max)
				{
					smax=a[i];
					System.out.println("max="+max);
					System.out.println("Smax="+smax);
				}
			}
		}
	}
}