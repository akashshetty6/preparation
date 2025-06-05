package com.backtrackin.maze;

public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	System.out.println(maze(3, 3));
//	maze("", 3, 3);
//	mazeDiagonal("", 3, 3);
	
	boolean[][] maze= {
			{true,true,true},
			{true,true,true},
			{true,true,true}
	};
	
//	mazeObstacle("", 0, 0, maze);
	mazeBackTracking("", 0, 0, maze);
	}

	
	static int maze(int r,int c) {
		if(r==1 || c==1) {
			return 1;
		}
		
		int left=maze(r-1, c);
		int right=maze(r,c-1);
		
		return left+right;
	}
	
	static void maze(String p,int r,int c) {
		if(r==1 && c==1) {
			System.out.println(p);
			return;
//			return p;
		}
		if (r>1) {
			maze(p+"d", r-1, c);
		}
		if (c>1) {
			maze(p+"r",r,c-1);
		}
		
		
//		return p;
	}
	
	static void mazeDiagonal(String p,int r,int c) {
		if(r==1 && c==1) {
			System.out.println(p);
			return;
		}
		if(r>1 && c>1) {
			mazeDiagonal(p+'c',r-1,c-1);
		}
		if (r>1) {
			mazeDiagonal(p+"d", r-1, c);
		}
		if (c>1) {
			mazeDiagonal(p+"r",r,c-1);
		}
	}
	
	static void mazeObstacle(String p,int r,int c,boolean[][] maze) {
		if(r==maze.length-1 && c==maze[0].length-1) {
			System.out.println(p);
			return;
		}
		if(!maze[r][c]) {
			return;
		}
//		if(r>1 && c>1) {
//			mazeDiagonal(p+'d',r-1,c-1);
//		}
		if (r <maze.length-1  ) {
			mazeObstacle(p+"d", r+1, c,maze);
		}
		if (c < maze[0].length-1) {
			mazeObstacle(p+"r",r,c+1,maze);
		}
	}
	
	static void mazeBackTracking(String p,int r,int c,boolean[][] maze) {
		if(r==maze.length-1 && c==maze[0].length-1) {
			System.out.println(p);
			return;
		}
		if(!maze[r][c]) {
			return;
		}
		maze[r][c]=false;
//		if(r>1 && c>1) {
//			mazeDiagonal(p+'d',r-1,c-1);
//		}
		if (r <maze.length-1  ) {
			mazeBackTracking(p+"d", r+1, c,maze);
		}
		if (c < maze[0].length-1) {
			mazeBackTracking(p+"r",r,c+1,maze);
		}
		if (r>0) {
			mazeBackTracking(p+"u",r-1,c,maze);
		}
		if (c>0) {
			mazeBackTracking(p+"l",r,c-1,maze);
		}
		maze[r][c]=true;
	}
}
