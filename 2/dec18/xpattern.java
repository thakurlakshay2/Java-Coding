package dec18;

import java.util.Scanner;

public class xpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		int b=n.nextInt();
		int space=b/2;
		int star=1;
		int i;
		int j;
		for(i=1;i<=b;i++)
		{
			for(j=1;j<=b;j++)
			{
				if(i==j){
			System.out.print("*");}
			else if(i+j==b+1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
				
				}System.out.println(" ");
				}
			
		}
			
//			System.out.print(space+" "+star);
			
			
		
	}
