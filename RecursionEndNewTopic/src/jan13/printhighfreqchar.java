package jan13;

import java.util.Scanner;

public class printhighfreqchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print char which  is in greater number
		Scanner scn=new Scanner(System.in);	
		String str=scn.next();
			int[] arr =new int[26];
			printHighFreqChar(str);
			printHighFreqChar1(str,arr);
	}
	//this method is for n square time (double loop)
	public static void printHighFreqChar(String str)
	{
		int q;	 int z=0; int i;
		for(i=0;i<str.length();i++)
		{
		int ch=str.charAt(i);
		int p=0; 
		for(int j=0;j<str.length();j++)
		{
			int ch1=str.charAt(j);
			if(ch==ch1)
			{
				p++;
			}
			
		}
//		System.out.println(p);
			q=p;
			if(i>=1 && i<str.length() && z<q)
			{
			z=q;
			}
		}
		System.out.println(z);

	}
	// for n (single loop)
	public static void printHighFreqChar1(String str,int[] arr)
	{
		for(int i=0;i<str.length();i++)
		{
			int ch=str.charAt(i);
			ch=ch-'a';
			arr[ch]+=1;
		}
		int check=arr[0];
		int val=0;
		for(int i=1;i<str.length();i++)
		{
			if(check<arr[i])
			{
				check=arr[i];
				val=i+97;
			}
			
		}
		System.out.println(check+" "+(char)val);
	}
}