class pattern16
{
  public static void main(String []args)
  {
     int i,j;
	 
	 for(i=1;i<=5;i++)
	 {
	   for(j=1;j<i;j++)
	   {
	      System.out.print((char)(i+63));
	   }
	   System.out.println(" ");
	 }
  }
  
}
