package Array;

public class LC_485_MostConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,0,1,1,1,0,0,1,1,0,1,1,1,1,1};
        int ans = findMaxConsecutiveOnes((arr));
        System.out.println(ans);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int j = 0;
        int max = 0;
        int c = 0;

        while(j < nums.length){
            if(nums[j] != 1){
                max = Math.max(c, max);
                c = 0;
                j++;
                continue;
            }
            c++;
            j++;
        }
        return Math.max(c, max);
    }
}
