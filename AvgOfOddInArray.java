class AvgOfOddInArray
{
	public static void main(String[] args)
	{
		int a[]={5,10,15,20,25,22,44,66,10,12};
					int sum=0,count=0;
					double avg;
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			if(temp%2!=0)
			{
			sum+=temp;
			count++;
			}
		}
		avg=sum/count;
		System.out.println(sum);
		System.out.print("Odd Average "+avg);
		
		
	}
}