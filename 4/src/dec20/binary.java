package dec20;

import java.util.Scanner;

public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a =new Scanner(System.in);
		int num=a.nextInt();
		int k=a.nextInt();
		System.out.println(Integer.toBinaryString(num));
		checkthebit(num,k);
		turnthebiton(num,k);
		turnthebitoff(num,k);
		togglebit(num,k);
		findrightmostbit(num,k);
	}
	public static void checkthebit(int num,int k)
	{
		int bm=1<<k;
		if((num&bm)==bm)
		{
			System.out.println("bit is on");
			
		}
		else
		{
			System.out.println("bit is off");
		}
	}
	public static void turnthebiton(int num, int k)
	{
		int bm=1<<k;
		if((num&bm)==bm)
		{
			System.out.println("already on");
			
		}
		else
		{
			System.out.println("it is off");
			num=num | bm ;
			System.out.println(Integer.toBinaryString(num));
		}
	}
	public static void turnthebitoff(int num, int k)

	{
		int bm=1<<k;
		if((num&bm)==bm)
		{
			System.out.println("bit is off");
			num=num ^ bm ;
			System.out.println(Integer.toBinaryString(num));
			
		}
		else
		{
			System.out.println("already off");
			
		}
	}
	public static void togglebit(int num, int k)
	{
		int bm=1<<k;
		if((num&bm)==bm)
		{
			System.out.println("toggle bit");
			num=num ^ bm ;
			System.out.println(Integer.toBinaryString(num));
			
		}
		else
		{
			System.out.println("toggle bit");
			num=num | bm ;
			System.out.println(Integer.toBinaryString(num));
		// System.out.println(Integer.toBinaryString)num & (~bm));
		}
	}
	public static void findrightmostbit(int num, int k)
	{
		
	}

}

