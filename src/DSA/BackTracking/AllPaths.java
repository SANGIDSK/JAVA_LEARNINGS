package DSA.BackTracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        allPathPrint("",maze,0,0,path,1);
    }
    //this one makes visited cell false so we cant find another path because we making changes in the array itself and not changing
    static void allPath(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length - 1){
            maze[r][c] = false;
            allPath(p+"D",maze,r+1,c);
        }
        if(c < maze[0].length - 1){
            maze[r][c] = false;
            allPath(p+"R",maze,r,c+1);
        }
        if(r > 0){
            maze[r][c] = false;
            allPath(p+"U",maze,r-1,c);
        }
        if(c > 0){
            maze[r][c] = false;
            allPath(p+"L",maze,r,c-1);
        }
    }
    //while coming out of the recursion call make that cell back to its previous value this is backtracking.
    static void allPaths(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if(r < maze.length - 1){
            allPaths(p+"D",maze,r+1,c);
        }
        if(c < maze[0].length - 1){
            allPaths(p+"R",maze,r,c+1);
        }
        if(r > 0){
            allPaths(p+"U",maze,r-1,c);
        }
        if(c > 0){
            allPaths(p+"L",maze,r,c-1);
        }
        maze[r][c] = true;
    }
//print matrix as well as path
    static void allPathPrint(String p, boolean[][] maze, int r, int c,int[][] path,int step){
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c]=step;
            for(int[] arr: path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if(r < maze.length - 1){
            allPathPrint(p+"D",maze,r+1,c,path,step+1);
        }
        if(c < maze[0].length - 1){
            allPathPrint(p+"R",maze,r,c+1,path,step+1);
        }
        if(r > 0){
            allPathPrint(p+"U",maze,r-1,c,path,step+1);
        }
        if(c > 0){
            allPathPrint(p+"L",maze,r,c-1,path,step+1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
