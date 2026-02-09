package Array;

import java.util.Arrays;

public class LC_88_MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 0, 0, 0, 0};
        int len1 = 3;
        int[] arr2 = {2,6,7, 10};
        int len2 = 4;
        mergeSortedArrays(arr1, len1, arr2, len2);
        System.out.println("Merged Array :"+ Arrays.toString(arr1));
    }
    public static void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>=0 && i>=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }

        }
        while(j>=0){
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
}
