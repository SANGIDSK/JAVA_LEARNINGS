package DSA;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(phNum("","23"));
    }

    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            permutation(f + ch + s,up.substring(1));
        }
    }

    static ArrayList<String> permutationList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            ans.addAll(permutationList(f + ch + s,up.substring(1)));
        }
        return  ans;
    }
    public static List<String> phNum(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> inner = new ArrayList<>();

        int digit = up.charAt(0) + '0';

        if(digit <= 6){
            for(int i = ((digit - 2)*3);i < ((digit-1)*3);i++){
                char ch = (char) ('a'+i);
                inner.addAll(phNum(p+ch,up.substring(1)));
            }
        }
        if(digit == 7){
            for(int i = ((digit - 2)*3);i < ((digit-1)*3)+1;i++){
                char ch = (char) ('a'+i);
                inner.addAll(phNum(p+ch,up.substring(1)));
            }
        }
        if(digit >= 8){
            for(int i = ((digit - 2)*3)+1;i < ((digit-1)*3)+1;i++){
                char ch = (char) ('a'+i);
                inner.addAll(phNum(p+ch,up.substring(1)));
            }
        }
        return inner;
    }
}
