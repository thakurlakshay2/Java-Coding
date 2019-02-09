package page8;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();
		}
		SelectionSort(arr,arr.length,0);
		for(int j=0;j<n;j++)
		{
			System.out.print(arr[j]+" ");
		}
	}
	
	public static void SelectionSort(int[] arr,int n,int index){
		if(index==n){
			return;
		}
		int k=check(arr, index, arr.length-1);
		if(k!=index)
		{
			int temp=arr[k];
			arr[k]=arr[index];
			arr[index]=temp;
		}
		SelectionSort(arr, n, index+1);
		
		
	}
	public static int check(int[] arr,int i ,int j){
		if(i==j)
		{
			return i;
		}
		int k=check(arr, i+1, j);
		if(arr[i]>arr[k])
		{
			return k;
		}
		else 
		{
			return i;
		}
		
	}


}