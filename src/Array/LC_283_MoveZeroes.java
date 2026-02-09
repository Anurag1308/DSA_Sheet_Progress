package Array;

import java.util.Arrays;

public class LC_283_MoveZeroes {

    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 0, 9, 10, 0};
        System.out.println("Original Array : " + Arrays.toString(arr));

        moveZeroes(arr);
        System.out.println("Modified Array : " + Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;

        while(j<nums.length){
            if(nums[j] == 0){
                j++;
                continue;
            }
            if(i!=j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            i++;
            j++;
        }
    }
}
