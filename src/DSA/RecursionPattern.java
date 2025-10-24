package DSA;

public class RecursionPattern {
    public static void main(String[] args) {
        Pattern1(4,0);
    }

   static void Pattern(int r,int c){
        if(r == 0){
            return;
        }
        if(r>c){
            System.out.print("* ");
            Pattern(r,c+1);
        }else{
            System.out.println();
            Pattern(r-1,0);
        }
    }

    static void Pattern1(int r,int c){
        if(r == 0){
            return;
        }
        if(r>c){
            Pattern1(r,c+1);
            System.out.print("* ");
        }else{
            Pattern1(r-1,0);
            System.out.println();
        }
    }
}
