package dec21;

import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// sorted array needed
		System.out.println("input the number to find(1-10)");
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		int[] arr={10,20,30,40,50,60,70,80,90,100};
		int low=0;
		int high=9;
		while(low<=high)
		{ 
		int m=(high+low+1)/2;
			if(arr[m]>num)
			{
				high=m;
			}
			else if(arr[m]<num)
			{
				low=m+1;
			}
			else if (arr[m]==num)
			{  int p=m+1;
				System.out.println(arr[m]+ " position is " +p);
				break;
			}
			else if(low==high)
			{
				System.out.println("number not found");
				break;
			}
		}
	}

}