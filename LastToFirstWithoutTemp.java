import java.util.*;
class LastToFirstWithoutTemp
{
    public static void main(String[] args)
	{
		int a[]={11,20,40,60,50,20};
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i]+a[i-1];
			a[i-1]=a[i]-a[i-1];
			a[i]=a[i]-a[i-1];
		}
		System.out.println(Arrays.toString(a));
	}
}