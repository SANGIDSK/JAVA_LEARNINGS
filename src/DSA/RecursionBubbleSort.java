package DSA;

import java.util.Arrays;

public class RecursionBubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,1};
        Sort(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] arr,int l,int i){
        if(l == 0){
            return;
        }
        if(l>i){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            Sort(arr,l,i+1);
        }
        Sort(arr,l-1,0);
    }
}
