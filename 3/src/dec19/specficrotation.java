package dec19;

import java.util.Scanner;

public class specficrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//rotating numbercfrom a specific place
		Scanner a=new Scanner(System.in);
		int num=123456;
		int rem;
		int ans;
		int pos=a.nextInt();
		int c=pos;
		int mul=1;
		while(pos!=0)
		{
			mul=mul*10;
			pos--;
		}
		int num1=num/mul;
		int num2=num-num1*mul;
		int b=0;
		while(num!=0)
		{
			
			num=num/10;
			b++;
			
		} int d=b-c; int mul1=1;
		while(d!=0)
		{
			mul1=mul1*10;
			d--;
		}
		ans=num2*mul1+num1;
		System.out.println(ans);
	}

}