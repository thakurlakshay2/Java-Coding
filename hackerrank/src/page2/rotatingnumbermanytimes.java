package page2;

import java.util.Scanner;

public class rotatingnumbermanytimes {

	public rotatingnumbermanytimes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
        long r1=scn.nextLong();
        int num=scn.nextInt();
        int dig=0;
        int num1=num;
        while(num1!=0)
        {
        	dig++;
        	num1=num1/10;
        	
        }
        int div=dig-1;
        int c=(int)Math.pow(10,div );
       System.out.println(dig+ " "+c);
       long r=r1%dig;
       while(r>0)
       {
    	   int rem=num%c;
    	    num=num/c;
    	    rem=rem*10+num;
    	    num=rem;
    	   
    	   r--;
       }
       while(r<0)
       {
    	   int rem=num%10;
   	    num=num/10;
   	    rem=rem*c+num;
   	    num=rem;
   	   
   	   r++;
       }
       System.out.println(num);
   }
}