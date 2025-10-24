package DSA;

import java.util.Scanner;

public class DestructionOfDandelions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases>0){
            int numberOfFields = sc.nextInt();
            long[] numberOfDandelionsInTheField = new long[numberOfFields];
            for (int i = 0; i < numberOfFields; i++) {
                numberOfDandelionsInTheField[i] = sc.nextLong();
            }

            System.out.println(destructionOfDandelions(numberOfFields,numberOfDandelionsInTheField));
            testCases--;
        }
    }
    public static long destructionOfDandelions(int n,long[] dandelions){
        for (int i = 0; i < n; i++) {
            if(dandelions[i]%2 != 0){
               return sum(dandelions,n);
            }
        }
        return 0;
    }

    private static long sum(long[] dandelions, int n) {
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += dandelions[i];
        }
        return ans;
    }
}
