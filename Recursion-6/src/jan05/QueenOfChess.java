package jan05;

public class QueenOfChess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlaceQueens(new boolean[4][4], 0, "", 0);

	}

	public static int count = 0;

	public static void PlaceQueens(boolean[][] chess, int queenNo, String path, int LastQueenPlaced) {

		if (queenNo == chess.length) {
			if (IsTheBoaradSafe(chess) == true) {
				System.out.println((++count) + " " + path);

			}
			return;

		}

		for (int i = LastQueenPlaced; i < chess.length * chess.length; i++) {
			int row = i / chess.length;
			int col = i % chess.length;

			if (chess[row][col] == false) {
				chess[row][col] = true;
				PlaceQueens(chess, queenNo + 1, path + "q" + (queenNo + 1) + "-b" + i+" ", i + 1);
				chess[row][col] = false;
			}
		}
	}

	public static boolean IsTheBoaradSafe(boolean[][] chess) {
		for (int r = 0; r < chess.length; r++) {
			for (int c = 0; c < chess.length; c++) {
				if (chess[r][c] == true && IsTheQueenSafe(chess, r, c) != true) {
					return false;
				}

			}
		}
		return true;
	}

	public static boolean IsTheQueenSafe(boolean[][] chess, int r, int c) {
		int[][] dim = { { 0, 1 }, 
						{ 1, 1 },
						{ 1, 0 },
						{ 0, -1 },
						{ -1, 0 },
						{ -1, -1 },
						{ -1, 1 }, 				
						{ 1, -1 } };

		for (int dis = 1; dis < chess.length; dis++) {
			for (int[] dimentions : dim) {
				int rowdelta = dimentions[0];
				int coldelta = dimentions[1];
				int newrow = r + dis * rowdelta;
				int newcol = c + dis * coldelta;
				if (newrow < chess.length && newrow >= 0 && newcol >= 0 && newcol < chess.length) {
					if (chess[newrow][newcol] == true)
						return false;
				}

			}
		}
		return true;
	}

	// public static boolean IsTheBoaradSafe(boolean[][] chess) {
	//
	// for (int r = 0; r < chess.length; r++) {
	// for (int c = 0; c < chess.length; c++) {
	// if (chess[r][c] == true) {
	// int d1 = r - 1;
	// int d2 = c - 1;
	// int d3 = r + 1;
	// int d4 = c + 1;
	// while (d1 >= 0 || d2 >= 0 || d3 < chess.length || d4 < chess.length) {
	// if (chess[r][d2] == true || chess[r][d4] == true || chess[d1][c] == true
	// || chess[d3][c] == true
	// || chess[d1][d2] == true || chess[d3][d2] == true || chess[d3][d4] ==
	// true
	// || chess[d1][d4] == true) {
	//
	// return false;
	// }
	// if (d1 > 0) {
	// d1--;
	// }
	// if (d2 > 0) {
	// d2--;
	// }
	// if (d3 < chess.length-1) {
	// d3++;
	// }
	// if (d4 < chess.length-1) {
	// d4++;
	// }
	//
	// }
	// }
	// }
	//
	// }
	// return true;
	// }
}