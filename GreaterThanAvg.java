class GreaterThanAvg
{
public static void main(String[] args)
{
	int a[]={2,4,6,8,10,12,14,16,18,20};
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum+=a[i];	
	}
	double avg=sum/(double)a.length;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>avg)
		{
			System.out.print(a[i]+" ");
		}
	}
}
 }