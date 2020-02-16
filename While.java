import java.util.*;
class While
{
	public static void main(String[] args)
	{
		int n,c=0,i=1;
		System.out.print("Enter how many Even numbers you want?:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(i>0)
		{
			if(i%2==0)
			{
				System.out.println(i);
				c++;
			}
			if(c==n)
				break;
			i++;
		}
	}
}
