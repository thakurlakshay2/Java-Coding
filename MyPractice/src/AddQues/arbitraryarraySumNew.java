package AddQues;

public class arbitraryarraySumNew {
	
	public static void ArraySum(int a1[],int a2[]){
		int r1=0;
		int r2=0;
		int sum1=0;
		int sum2=0;
		int sum=0;
		while(r1<a1.length && r2<a2.length){
			if(a1[r1]<a2[r2]){
				sum1+=a1[r1];
				r1++;
			}
			else if(a1[r1]>a2[r2]){
				sum2+=a2[r2];
				r2++;
			}
			else{
				if(sum1>sum2){
					sum+=sum1+a1[r1];
				}
				else{
					sum+=sum2+a1[r1];
				}
				sum1=0;
				sum2=0;
				r1++;
				r2++;
			}
		}
		if(r1==a1.length){
			while(r2!=a2.length){
				sum2+=a2[r2];
				r2++;
			}
			
		}
		else if(r2==a2.length){
			while(r1!=a1.length){
				sum1+=a1[r1];
				r1++;
			}
		}
		if(sum1>sum2){
			sum+=sum1;
		}
		else{
			sum+=sum2;
		}
		System.out.println(sum+"  ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={1,2,5,7,13,19,22,28};
		int arr2[]={3,4,7,8,10,12,15,19,26};
		ArraySum(arr1, arr2);
	}
	
	

}
