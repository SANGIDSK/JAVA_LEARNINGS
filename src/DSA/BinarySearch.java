package DSA;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,22,55,73};
        System.out.println(search(arr,0,arr.length-1,55));
    }

    static int search(int[] arr,int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]<target){
            return search(arr,mid+1,end,target);
        }
        return search(arr,start,mid-1,target);
    }
}
