package jan13;

import java.util.Scanner;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		// int n=scn.nextInt();
		// int[] arr=new int[n];
		// for(int i=0;i<n;i++)
		{
			// arr[i]=scn.nextInt();
		}
		// findoneuniquenumber(arr);
		int[] arr1 = { 1, 1, 5, 5, 9,9,7,7,2,4 };
		findtwouniquenumber(arr1);
	}

	public static void findoneuniquenumber(int[] arr) {
		int res = 0;
		for (int i : arr) {
			res ^= i; // ^ converts number into bit and gives out a new number
		}
		System.out.println(res);
	}

	public static void findtwouniquenumber(int[] arr1) {
		int xy = 0;
		int x = 0;
		int y = 0;
		for (int i : arr1) {
			xy ^= i; // ^ converts number into bit and gives out a new number
		}
		int rsb = xy & -xy;
		for (int j : arr1) {
			if ((rsb & j) == rsb) {
				x = x ^ j;
			} else {
				y = y ^ j;
			}
		}
		System.out.println(x + "  " + y);
	}
}