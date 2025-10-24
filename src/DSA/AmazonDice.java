package DSA;

import java.util.ArrayList;

public class AmazonDice {
    public static void main(String[] args) {
        System.out.println(die("",4));
    }
    static ArrayList<String> die(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> inner = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target ; i++) {
            inner.addAll(die(p+i,target-i));
        }
        return inner;
    }
}
