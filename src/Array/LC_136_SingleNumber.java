package Array;

public class LC_136_SingleNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 4};
        int ans = singleNumber(arr);
        System.out.println("Single number is : " +ans);
    }
    public static int singleNumber(int[] nums){
        //here we can use XOR to cancel the elements which are in pair as we knw
        //a XOR a = 0 and a XOR 0 = a, so in the end our result will contain the missing pair i.e.
        //single number

        int result = 0;
        for(int i = 0; i < nums.length; i++){
            result ^= nums[i];
        }
        return result;

    }
}
