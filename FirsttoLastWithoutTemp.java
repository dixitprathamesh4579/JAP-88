import java.util.*;
class FirsttoLastWithoutTemp
{
   public static void main(String[] args)
   {
      int a[]={10,20,30,50,20,11};
      for(int i=0;i<a.length-1;i++)
	  {
	    a[i]=a[i]+a[i+1];
		a[i+1]=a[i]-a[i+1];
		a[i]-=a[i+1];
	  }
	  System.out.println(Arrays.toString(a));
	  
   }
}