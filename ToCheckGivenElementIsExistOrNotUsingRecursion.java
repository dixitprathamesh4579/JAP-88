class ToCheckGivenElementIsExistOrNotUsingRecursion
{
    public static int search(int a[],int start,int end,int target)
	{
		if(start>end)
			return-1;
int mid = (start + end) / 2;
		if(target>a[mid])
			return search(a,mid+1,end,target);
		else if(target<a[mid])
			return search(a,start,mid-1,target);
		else
			return mid;
	}

public static void main(String[] args)
{
	 int a[]={10,20,30,40,50,60,70};
	 int target=50;
     
	 int result=search(a,0,a.length-1,target);
	 System.out.println(result);
}
}