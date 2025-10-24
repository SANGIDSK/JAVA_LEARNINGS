package DSA;

public class findNumber {
        public static void main(String[] args) {
            int[] arr = {2,2,3,2,7,7,8,7,8,8};
            System.out.println(findNumberNotRepeated(arr));
        }

        public static int findNumberNotRepeated(int[] arr) {
            int num = arr[0];
            for(int i=1;i< arr.length;i++){
                num+=arr[i];
            }
            return num%3;
        }

    }


