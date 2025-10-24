package DSA;

public class Nto1 {
    public static void main(String[] args) {
        int n = 12345;

        ReverseMethod1(n);
        System.out.println(sum);
    }

    private static void fun(int n, int i) {
        if(i>n){
            return;
        }
        System.out.println(i);
        fun(n,i+1);
    }
    public static int fact(int n){

        if(n<=1){
            return 1;
        }
        return n * fact(n-1);

    }

    public static int SumOfDigit(int n){

        if(n<10){
            return n;
        }
        int lastDisit = n%10;
        return lastDisit + SumOfDigit(n/10);

    }

    public static int ProductOfDigit(int n){

        if(n<10){
            return n;
        }

        return (n%10) * ProductOfDigit(n/10);

    }
    public static int sum = 0;
    public static void ReverseMethod1(int n){

        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum * 10 +rem;
        ReverseMethod1(n/10);
    }
}
