package feb09;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCS("abcd","aecd");
	}
	public static void LCS(String str1,String str2){
		int[][] strg=new int[str1.length()+1][str2.length()+1];
		strg[0][0]=0;
		for(int i=1;i<strg.length;i++){
			for(int j=1;j<strg[0].length;j++){
				if(str1.charAt(i-1)==str2.charAt(j-1)){
					strg[i][j]=strg[i-1][j-1]+1;
				}
				else
				{
					strg[i][j]=Math.max(strg[i-1][j], strg[i][j-1]);
				}
			}
		}
		for(int i=0;i<strg.length;i++){
			for(int j=0;j<strg[0].length;j++){
			System.out.print(strg[i][j]+"  ");
			}
			System.out.println(" ");
		}
	
	}
	
	
}