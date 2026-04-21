class AvgOfArray
{
public static void main(String[] args)
{
int a[]={5,3,8,10,12,15};
	int sum=0;
	for(int i=0;i<a.length;i++)
		sum+=a[i];
	double avg=sum/a.length;
	System.out.println("Average of array "+avg);
}
}