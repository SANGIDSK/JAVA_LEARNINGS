package DSA;

import java.util.ArrayList;
import java.util.List;

public class FactorOfANumber {
    public static void main(String[] args) {
        int n = 20;
        factor2(n);
    }

    //time complexity O(n)
    private static void factor(int n) {
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
    }

    //time complexity O(sqrt(n))
    private static void factor1(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " " + n/i + " ");
                }

            }
        }
    }

    //time complexity O(sqrt(n)) -> in sorted o/p
    private static void factor2(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " ");
                    list.add(n/i);
                }

            }
        }
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
