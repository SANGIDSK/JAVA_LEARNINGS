package DSA.BackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
       // System.out.println(pathRet("",3,3));
        //pathCross("",3,3);
        boolean[][] maze = {
                {true,true,false},
                {false,true,false},
                {true,true,true}
        };
        pathRestriction("",maze,0,0);
    }
    static int count(int r,int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left+right;
    }

    static void pathCross(String p,int r,int c){
        if(r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if(r>1 && c>1){
            pathCross(p+"D",r-1,c-1);
        }
        if(r>1) {
            pathCross(p + "V", r - 1, c);
        }
        if(c>1){
            pathCross(p+"H",r,c-1);
        }
    }

    static void path(String p,int r,int c){
        if(r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+"D",r-1,c);
        }
        if(c>1){
            path(p+"R",r,c-1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c){
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        if(r>1){
           left = pathRet(p+"D",r-1,c);
        }
        if(c>1){
            right =pathRet(p+"R",r,c-1);
        }

        left.addAll(right);
        return left;

    }

    static void pathRestriction(String p,boolean[][] maze,int r,int c){
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length - 1){
            pathRestriction(p+"D",maze,r+1,c);
        }
        if(c < maze[0].length - 1){
            pathRestriction(p+"R",maze,r,c+1);
        }
    }

}
