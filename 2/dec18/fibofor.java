package dec18;

import java.util.Scanner;

public class fibofor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		int b=n.nextInt();
		int val=1;
		int i;
		int j;
		int a=-1;
		int c=1;
		int e;
		
		for(i=1;i<=b;i++)
		{
			for(j=1;j<=i;j++)
			{
				e=a+c;
				a=c;
				c=e;
				System.out.print(e+" ");
				

				}			
			System.out.println(" "); }
		}
	}
