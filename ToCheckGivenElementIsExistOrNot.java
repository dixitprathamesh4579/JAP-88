class ToCheckGivenElementIsExistOrNot
{
public static void main(String[] args)
{
	int a[]={10,20,30,40,50,60,70};
	int target=40;
	int index=search(a,target);
	System.out.println(index);
	
}
public static int search(int a[],int target)
{
	for(int i=0;i<a.length-1;i++)
	{
		
		if(a[i]==target)
		{
			int index=i;
			return index;
		}
	}
	return -1;
}
}