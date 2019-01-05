package jan02;

import java.util.Scanner;

public class CoinPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins={2,3,5,6};
		CoinPermutation(coins,10,"",0 );
		CoinCombination(coins,10,"",0,0);
		
	}
	
	public static void CoinPermutation(int[] coin,int AmtToPay,String WaysToPay,int count)
	{
		if(count==AmtToPay)
		{
			System.out.print(WaysToPay+" ::");
			count=0;
			return;
		}
		if(count>AmtToPay)
		{
			return;
		}
		for(int i=0;i<coin.length;i++)
		{
			int c=coin[i];  
			CoinPermutation(coin,AmtToPay,WaysToPay+(coin[i]),count+c);
		}
		
		
	}
	public static void CoinCombination(int[] coin,int AmtToPay,String WaysToPay,int count,int cnt)
	{
		if(count==AmtToPay)
		{ 
			System.out.println(WaysToPay);
			count=0;
			return;
		}
		if(count>AmtToPay)
		{
			return;
		}
		for(int i=cnt;i<coin.length;i++)
		{
			int c=coin[i];  
			CoinCombination(coin,AmtToPay,WaysToPay+(coin[i]),count+c,i);
		}
		
	}


}