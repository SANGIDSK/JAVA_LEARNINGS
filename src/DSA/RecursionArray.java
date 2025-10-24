package DSA;

import java.util.ArrayList;

public class RecursionArray {
    //linear search
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,4 , 4, 5};
        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(LinearSearch(arr,target,0,list));
    }
    static ArrayList LinearSearch(int[] arr,int target, int index,ArrayList list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return LinearSearch(arr,target,index+=1,list);
    }
}
