public class ArrayUtilities {

    public static int sum(int[] nums){
        return 0;
    }

    public static int median(int[] nums){return 0;}

    public static double mean(int[] nums){
        double mean = 0;
        for(int i : nums){
            mean+=i;
        }
        mean /= nums.length;
        return mean;
    }

}
