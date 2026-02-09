package foundation;

import java.net.SocketOption;
import java.util.Arrays;

public class LC_928_SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 4, 2, 7};
        int[] ans = mergeSort(arr);
        System.out.println("Original Array : "+ Arrays.toString(arr));
        System.out.println("Sorted Array : "+ Arrays.toString(ans));
    }
    public static int[] mergeSort(int[] arr){
        //base condition
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second){

        int[] merged = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                merged[k] = first[i];
                i++;
            }else{
                merged[k] = second[j];
                j++;
            }
            k++;
        }

        //assume one of the array elements is still not completed
        while(i<first.length){
            merged[k] = first[i];
            i++;
            k++;
        }

        while(j<second.length){
            merged[k] = second[j];
            j++;
            k++;
        }
        return merged;
    }
}
