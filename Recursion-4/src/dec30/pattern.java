package dec30;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printstar(1,1,5);
	}
	public static void printstar(int i,int j,int max)
	{
		if(i>max)
		{
			return;
		}
		if(j>i)
		{
			return;
		}
		System.out.println("*");
		printstar(i,j+1,max);
		System.out.print("*");
		printstar(i+1,j,max);
	}
}