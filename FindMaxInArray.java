class FindMaxInArray
{
	public static void main(String[] args)
	{
		int a[]={10,11,20,30,49,50,40,37,12};
        int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum Number Of given Array is:"+max);
	}
}