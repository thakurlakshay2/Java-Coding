package ArrayRotations;

public class arrayrotationbyn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[]{1, 2, 3, 4, 5, 6, 7};
		//size is n
		//number of rotation is d
		ArrayRotate(arr, 6);
	}
	
	public static void ArrayRotate(int[] arr,int d){
		int[] temp=new int[d];
		for(int i=0;i<d;i++){
			temp[i]=arr[i];
		}
		int k=0;
		for(int j=d;j<arr.length;j++){
			arr[k]=arr[j];
			k++;
		}
		for(int i=0;i<d;i++){
			arr[k]=temp[i];
			k++;
		}
	printarray(arr); 
	}
	
	public static void printarray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
