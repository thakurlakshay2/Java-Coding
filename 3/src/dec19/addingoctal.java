package dec19;

public class addingoctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dn = addingoctal(374,536);
		System.out.println(dn + " ");

	}

	public static int addingoctal(int num1, int num2) {
		int p=1;
		int rem1;
		int rem2;
		int ans=0;
		int sum = 0; int c=0;
		while (num1!= 0 || num2!=0 || c!=0 ) {
			rem1= num1%10;
			rem2=num2%10;
			sum=rem1+rem2+c;
					int r=sum%8;
			c=sum/8;
			ans=ans+r*p;
			p=p*10;
			num1=num1/10;
			num2=num2/10;
					}
		return ans;
	}

}