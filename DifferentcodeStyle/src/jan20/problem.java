package jan20;

public class problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Q 7 stairs, one can take one or two or three steps at a time ,find total ways in which he can come down
//	int[] box=new int[7];
	
		int c=ways(7);
		System.out.println(c);
		int cd=waysImproved(7,new int[8]);
		System.out.println(cd);
	}
	public static int ways(int n){
		int sn=0;
		if(n==0)
		{
			return 1;
		}
		else if(n<0)
		{
			return 0;
		}
		int s1=ways(n-1);
		int s2=ways(n-2);
		int s3=ways(n-3);
		sn=s1+s2+s3;
		
		return sn	;
		
	}
	public static int waysImproved(int n,int[] box){
		int sn=0;
		if(n==0)
		{
			return 1;
		}
		else if(n<0)
		{
			return 0;
		}
		if(box[n]!=0)
		{
			return box[n];
		}
		int s1=ways(n-1);
		int s2=ways(n-2);
		int s3=ways(n-3);
		sn=s1+s2+s3;
		box[n]=sn;
		return sn	;
		
	}

}
