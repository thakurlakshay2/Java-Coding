package page8;

import java.util.Scanner;

public class MoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		char ch=scn.next().charAt(0);   //new way learn
		int i=scn.nextInt();
		String str1=MoveChar(str, 0,ch);
		System.out.println(str1.charAt(i));
		System.out.println(str1);
	}
	public static String MoveChar(String str, int index,char ch){
		if(index==str.length()-1)
		{
			return str;
		}
		while(index<str.length()){
		if(str.charAt(index)==ch)
		{
			
			str=move(str,index,ch);
		
		}
		index++;
		}
		String str1=MoveChar(str, index+1, ch);
		return str1;
		
	}
	public static String move(String str,int index,char ch){
		String str1=str.substring(0,index);
		String str2=str.substring(index+1);
		str=str1+str2+ch;
		return str;
		
	}
}