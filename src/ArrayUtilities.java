import java.util.stream.IntStream;

public class ArrayUtilities {

    public static int sum(int[] nums){
        return IntStream.of(nums).sum();
    }

    public static int median(int[] nums){
        return nums[nums.length / 2];
    }

    public static double mean(int[] nums){
        return IntStream.of(nums).sum() / (double) nums.length;
    }

}
