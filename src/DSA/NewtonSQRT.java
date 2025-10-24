package DSA;

public class NewtonSQRT {
    public static void main(String[] args) {
        System.out.printf("%.3f",root(40));
    }
    static double root(double n){
        double x = n;
        double root = 0.0;
        while(true){
            root = 0.5 * (x + (n/x));

            if(Math.abs(root - x) < 0.1){
                break;
            }
            x = root;
        }
        return root;
    }
}
