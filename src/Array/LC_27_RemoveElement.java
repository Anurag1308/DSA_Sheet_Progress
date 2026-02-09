package Array;

import java.util.Arrays;

public class LC_27_RemoveElement {
    public static void main(String[] args) {

        int[] arr = {0,1,1,2,2,3,2,4,2,5};
        int value = 2;

        System.out.println("Original Array : "+ Arrays.toString(arr));
        int ans = removeElement(arr, value);
        System.out.println(ans);
        System.out.println("Modified Array : "+ Arrays.toString(arr));


    }
    public static int removeElement(int[] nums, int val){
        int i = 0;
        int j = 0;

        while(j < nums.length){
            if(nums[j] == val){
                j++;
                continue;
            }
            if(i == j){
                i++;
                j++;
                continue;

            }
            nums[i] = nums[j];
            i++;
            j++;
        }
        return i;
    }
}
