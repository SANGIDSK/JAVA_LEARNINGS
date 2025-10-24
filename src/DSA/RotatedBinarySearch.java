package DSA;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5 ,6 ,7 ,8 ,1 ,2 ,3 ,4};
        System.out.println(BinarySearch(arr,4,0,arr.length-1));
    }

    static int BinarySearch(int[] arr , int target , int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[s] <= arr[m]){
            if(target >= arr[s] && target <= arr[m]){
                return BinarySearch(arr ,target ,s ,m-1);
            }
            else{
                return BinarySearch(arr ,target ,m+1 ,e);
            }
        }
        if(target >= arr[m] && target <= arr[e]){
            return BinarySearch(arr ,target ,m+1 ,e);
        }
        else{
            return BinarySearch(arr ,target ,e ,m-1);
        }

    }
}
