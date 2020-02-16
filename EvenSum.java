import java.util.*;
class EvenSum
{
	public static void main(String[] args)
	{
		int n,c=0,sum=0;
		System.out.println("Enter the ending number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				c++;
			}
			if(c==n)
				break;
		}
	System.out.println("sum of "+n+" numbers is "+sum);
	}
}
