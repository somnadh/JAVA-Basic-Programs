import java.util.*;
class DoWhile
{
	public static void main(String[] args)
	{
		int n,c=0,i=1;
		System.out.print("Enter how many Even numbers you want?:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		do
		{
			if(i%2==0)
			{
				System.out.println(i);
				c++;
			}
			if(c==n)
				break;
			i++;
		}while(i>0);
	}
}
