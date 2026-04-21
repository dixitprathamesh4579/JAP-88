class AvgOfOddEvenInArray
{
public static void main(String[] args)
{
	int a[]={12,11,13,14,15,16,17,18,19,20};
	int oddsum=0,evensum=0,count1=0,count2=0;
	double oddavg,evenavg;
	for(int i=0;i<a.length;i++)
	{
		int temp;
		temp=a[i];
		if(temp%2!=0)
		{
			oddsum+=temp;
			count1++;
		}
		else
		{
			evensum+=temp;
			count2++;
		}
	}
	oddavg=oddsum/count1;
	evenavg=evensum/count2;
	
	System.out.println("OddSum "+oddsum+" odd count "+count1+" Odd Average "+oddavg);
	System.out.println("EvenSum "+evensum+" even count "+count2+" Even Average "+evenavg);
	
}
}