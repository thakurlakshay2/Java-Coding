package jan12;

public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { 
				{ 1, 0, 0, 1, 1 },
				{ 1, 1, 1, 1, 1 },
				{ 1, 0, 1, 0, 1 },
				{ 1, 1, 1, 0, 1 },
				{ 1, 0, 0, 1, 1 } };
		String str="";
		boolean[][] br={
				{true,false,false}
				
				
				
				
		}
		printpath(maze,br,0,0,str);
	}
	public static void printpath(int[][] maze,boolean[][] visit,int sr,int sc, String path)
	{
		if(sr==maze.length-1 && sc==maze[0].length)
		{
			System.out.println(path);
			return;
		}
		visit[sr][sc]=true;
		//top
		if(sr-1>0 && maze[sr-1][sc]!=0 && visit[sr-1][sc]==false)
			printpath(maze,visit,sr-1,sc,path+'T');
		//left
		if(sr-1>0 && maze[sr][sc-1]!=0 && visit[sr-1][sc]==false)
			printpath(maze,visit,sr,sc-1,path+'L');
		//down
		if(sr-1>0 && maze[sr+1][sc]!=0 && visit[sr-1][sc]==false)
			printpath(maze,visit,sr+1,sc,path+'D');
		//right
		if(sr-1>0 && maze[sr][sc+1]!=0 && visit[sr-1][sc]==false)
			printpath(maze,visit,sr,sc+1,path+'R');
	}

}