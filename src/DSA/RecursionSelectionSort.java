package DSA;

import java.util.Arrays;

public class RecursionSelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,6,4};
        Sort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void Sort(int[] arr, int r, int c, int max_value) {
        if(r == 0){
            return;
        }
        if(r > c){
            if(arr[c] > arr[max_value]){
                Sort(arr, r, c+1, c);
            }else {
                Sort(arr, r, c+1, max_value);
            }
        }

        else{
            int temp = arr[max_value];
            arr[max_value] = arr[r];
            arr[r] = temp;

            Sort(arr, r-1, 0,0);
        }
    }
}
