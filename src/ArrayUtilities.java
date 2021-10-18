public class ArrayUtilities {

    public static int sum(int[] nums){
        int tot=0;
        for (int j : nums) {
            tot += j;
        }

        return tot;
    }

    public static int median(int[] nums){
        return nums[nums.length/2];
    }

    public static double mean(int[] nums){
        return (float)sum(nums)/nums.length;
    }


}
