package Array;

public class LC_268_MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 1, 6, 4};
        int ans = missingNumber((arr));
        System.out.println("the missing number is : "+ans);
    }

    public static int missingNumber(int[] nums){
        int n = nums.length;
        int totalSum = n * (n+1)/2;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + nums[i];
        }
        return totalSum - sum;
    }
}
