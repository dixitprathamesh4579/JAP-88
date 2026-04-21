class nestedifelse1
{
    public static void main(String args[])
	{
		int a=30,b=20,c=10;
		if(a>b)
		      if(a>c)
				  System.out.print("a is bigger");
			  else
				  System.out.print("c is bigger");
	    else 
			if(b>c)
				System.out.print("b is bigger");
			else
				System.out.print("c is bigger");
	}
}