package DSA;

public class BitManipulation {
    public static void main(String[] args) {
        int n = 6;
        int base = 3;
        System.out.println(powerOfNumber(n,base));
    }

    private static int magicNumber(int n) {
        int sum = 0;
        int base = 5;
        while(n>0)
        {
            int last = n & 1;
            sum += base*last;
            base*=5;
            n = n>>1;
        }
        return sum;
    }

    private static int powerOfNumber(int n,int base) {
        int ans = 1;
        int val = base;
        while(n>0)
        {
            int last = n & 1;
            if(last!=0) {
                ans *= base;
                base *= val;
                n = n >> 1;
            }
            else{
                n = n>>1;
            }
        }
        return ans;
    }

}
