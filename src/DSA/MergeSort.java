package DSA;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        SortInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] Sort(int[] arr) {
        if(arr.length == 1){
            return arr;
        }
        
        int mid = arr.length / 2;
        
        int[] arr1 = Sort(Arrays.copyOfRange(arr,0,mid));
        int[] arr2 = Sort(Arrays.copyOfRange(arr,mid,arr.length));
        
        return merge(arr1,arr2);
        
    }

    private static int[] merge(int[] first, int[] second) {
        int[] sortedArray = new int[first.length+ second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<first.length && j< second.length){
            if(first[i] < second[j]){
                sortedArray[k] = first[i];
                i++;
            }
            else{
                sortedArray[k] = second[j];
                j++;
            }
            k++;
        }

        while(i<first.length){
            sortedArray[k] = first[i];
            i++;
            k++;
        }

        while(j<second.length){
            sortedArray[k] = second[j];
            j++;
            k++;
        }

    return sortedArray;
    }

    private static void SortInPlace(int[] arr, int s, int e) {
        if(e-s == 1){
            return;
        }

        int mid = (s+e) / 2;

        SortInPlace(arr,s,mid);
        SortInPlace(arr,mid,e);

        mergeInPlace(arr,s,mid,e);

    }

    private static void mergeInPlace(int[] arr, int s,int m,int e) {
        int[] sortedArray = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while(i<m && j< e){
            if(arr[i] < arr[j]){
                sortedArray[k] = arr[i];
                i++;
            }
            else{
                sortedArray[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<m){
            sortedArray[k] = arr[i];
            i++;
            k++;
        }

        while(j<e){
            sortedArray[k] = arr[j];
            j++;
            k++;
        }

        for(int l = 0;l<sortedArray.length;l++){
            arr[s+l] = sortedArray[l];
        }
    }
}
