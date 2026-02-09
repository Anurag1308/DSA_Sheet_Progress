package Array;

import java.util.Arrays;

public class LC_26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1};
        int ans = removeDuplicates(arr);
        System.out.println("No of unique elements : "+ ans);
    }
    public static int removeDuplicates(int[] arr){
        //return the number of unique elements and print.
        System.out.println("Original Array : "+ Arrays.toString(arr));
        int i = 0;
        int j = 1;
        while(j<arr.length){
            if(arr[i] == arr[j]){
                j++;
                continue;
            }
            arr[i+1] = arr[j];
            i++;
            j++;
        }
        System.out.println("Converted Array : "+Arrays.toString(arr));
        return i+1;
    }
}
