package DSA;

public class isPrime {
    public static void main(String[] args) {
        int n = 40;
        for(int i=1;i<=n;i++) {
            if(prime(i)){
                System.out.println(i);
            }
        }
    }
     public static boolean prime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }else{
                c++;
            }
        }
        return true;
     }
}
