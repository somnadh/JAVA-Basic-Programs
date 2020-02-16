import java.util.Scanner;

class Ternary
{
	public static void main(String[] args)
	{
		int a,b,c;
		System.out.println("Enter 2 numbers");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c = a>b ? a:b;
		System.out.println(c+" is big");
	}
}

