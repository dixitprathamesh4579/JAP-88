class average 
{
	int avarageOfNumber(int n)
	{
		int avg=0,count=0;
		while(n!=0)
		{
		avg+=n%10;
		n/=10;
		count++;
		
		}
		return avg/count;
	}
	public static void main(String[] args)
	{
		average v =new average();
		System.out.println(v.avarageOfNumber(567));
		
}
	}