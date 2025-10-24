package DSA;

public class xor {
    public static void main(String[] args) {
        int[] arr = {2,3,2,4,5,6,3,6,5};
        System.out.println(findNumberNotRepeated(arr));
    }

    private static int findNumberNotRepeated(int[] arr) {
        int num = 0;
        for(int i:arr){
            num^=i;
        }
        return num;
    }

}
