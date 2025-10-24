package DSA;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        System.out.println(subseqRet("","abc"));
    }

    public static void set(String p,String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

        set(p + ch , up.substring(1));
        set(p , up.substring(1));

    }

    static ArrayList<String> subseqRet(String p,String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch , up.substring(1));
        ArrayList<String> right = subseqRet(p , up.substring(1));

        left.addAll(right);
        return left;
    }
}
