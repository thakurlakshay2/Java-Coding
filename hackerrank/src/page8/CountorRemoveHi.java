package page8;

import java.util.Scanner;

public class CountorRemoveHi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		int i=scn.nextInt();
		Count(str,0);
		System.out.println(count);
		String str1=Remove(str,0);
		System.out.println(str1.charAt(i));
		System.out.println(str1);
	}
	public static int count=0;
	public static void Count(String str,int cnt){
		if(cnt==str.length())
		{
			return ;
		}
		if(str.charAt(cnt)=='h' && cnt<str.length()-1)
		{
			if(str.charAt(cnt+1)=='i' )
			{
				count++;
			}
		}
		Count(str, cnt+1);
		return;
	}
	public static String Remove(String str,int cnt){
		if(cnt>=str.length()-1)
		{
			return str;
		}
		if(str.charAt(cnt)=='h')
		{
			if(str.charAt(cnt+1)=='i')
			{
				str=str.substring(0, cnt)+str.substring(cnt+2);

				str=Remove(str, cnt);
				
			}
			else
			{
				 str=Remove(str, cnt+1);
			}
		}
		else
		{
			 str=Remove(str, cnt+1);
		}
		
		return str;
		
	}

}
