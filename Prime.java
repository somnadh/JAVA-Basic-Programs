import java.util.*;
class Prime
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=2;i<=10;i++)
		{	
			int flag=0;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
					flag=1;
			}
			if(flag==0)
				System.out.println(i);			
		}
	}
}
