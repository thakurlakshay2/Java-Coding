package page5;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int[] arr1 = new int[N];
		int[] arr2 = new int[N];
		int[] arr3 = new int[N];
		for (int i = 0; i < N; i++) {
			arr1[i] = scn.nextInt();
		}
		for (int i = 0; i < N; i++) {
			arr2[i] = scn.nextInt();
		}
		for (int i = 0; i < N; i++) {
			arr3[i] = scn.nextInt();
		}
		bubblesort(arr1);
		incersionsort(arr2);
		selectionsort(arr3);
	}
	public static void bubblesort(int[] arr)
	{
		int c;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				
			
			if(arr[i]>arr[j+1])
			{
				c=arr[j+1];
				arr[j+1]=arr[i];
				arr[i]=c;
			}}
		}
	}

}
