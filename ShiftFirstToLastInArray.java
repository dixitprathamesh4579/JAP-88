import java.util.Arrays;
class ShiftFirstToLastInArray
{
  public static void main(String[] args)
  {
	  int a[]={11,20,33,55,15,17,18};
	 
		  int temp=a[0];
		  for(int i=1;i<a.length;i++)
		  {      
	          a[i-1]=a[i];
		  }
		  a[a.length-1]=temp;
System.out.println(Arrays.toString(a));
		  }
	  
  
}