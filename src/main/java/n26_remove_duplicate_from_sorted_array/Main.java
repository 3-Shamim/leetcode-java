package n26_remove_duplicate_from_sorted_array;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = new int[]{1, 1, 2};
        int k = solution.removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{1, 2, 3, 3, 3, 4};
        k = solution.removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{1, 2, 3};
        k = solution.removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));


        nums = new int[]{1, 1, 1};
        k = solution.removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{1, 2, 2, 2, 3, 3, 3, 4};
        k = solution.removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4};
        k = solution.removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{1, 1, 2, 2, 3, 3, 4};
        k = solution.removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

    }

}
