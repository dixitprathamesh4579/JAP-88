import java.util.*;
class FirstToLastAndLastToFirstInArray
{
public static void main(String [] args)
{
	int a[]={11,14,13,15,16,17,19};
	int temp=a[0];
	a[0]=a[a.length-1];
	a[a.length-1]=temp;
	System.out.println(Arrays.toString(a));
}
}