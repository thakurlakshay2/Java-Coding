package AddQues;

public class arbitraryarraySum {
//Q:: 2 sorted array given  and we need to find sum for path with highest sum where path changers if 
	//if there is a common number given that sum ahead is greater than if it didnt change path
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={1,2,5,7,8,10,21,22,23};
		int arr2[]={3,4,5,9,10,11,12,13};
		int r1=0;
		int r2=0;
		int sum=0;
		int sum1=0;
		int sum2=0;
	while(r1<arr1.length && r2<arr2.length){
		if(arr1[r1]<arr2[r2]){
			sum1+=arr1[r1];
			r1++;
		}
		else if(arr1[r1]>arr2[r2]){
			sum2+=arr2[r2];
			r2++;
		}
		else{
			if(sum1>sum2 && sum1>sum){
				sum=sum1;
			}
			else if(sum2>sum1 && sum2>sum){
				sum=sum2;
			}
			System.out.println(sum+" ");
			sum=arr1[r1];       r1++; r2++;
			int s1=0;
			int s2=0;
			
			while(r1<arr1.length  && r2<arr2.length && arr1[r1]!=arr2[r2]){
				if(arr1[r1]<arr2[r2] && r1<arr1.length){
					s1+=arr1[r1];
					r1++;
				}
				else if(arr1[r1]>arr2[r2] && r2<arr2.length){
					s2+=arr2[r2];
					r2++;
				}
			}
			if(r1==arr1.length){
				while(r2!=arr2.length){
					s2+=arr2[r2];
					r2++;
				}
				
			}
			else if(r2==arr2.length){
				while(r1!=arr1.length){
					s1+=arr1[r1];
					r1++;
				}
			}
			
			if(s1>s2){
				sum+=s1;
			}
			else{
				sum+=s2;
			}
			
			
		}
			
	}
	
	System.out.println(sum+"");
	}
	
	

}
