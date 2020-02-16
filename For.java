import java.util.*;
class For
{
	public static void main(String[] args)
	{
		int n,c=0;
		System.out.print("Enter how many Even numbers you want?:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				c++;
			}
			if(c==n)
				break;
		}
	}
}
