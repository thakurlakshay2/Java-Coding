package dec19;

public class octalsubraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dn = subractionoctal(1000,1);
		System.out.println(dn + " ");

	}

	public static int subractionoctal(int num1, int num2) {
		int p=1;
		int rem1;
		int rem2;
		int ans=0;
		int borrow=0;
		int sub = 0;
		while (num1!= 0 || num2!=0) {
			rem1= num1%10-borrow;
			rem2=num2%10;
			
			if(rem1>=rem2)
			{
			sub=rem1-rem2;
			
			}
			else
			{
				sub=8+rem1-rem2;
				borrow=1;
				
			}
			ans=ans+sub*p;
			p=p*10;
			num1=num1/10;
			num2=num2/10;
			
					}
		return ans;
	}

}
