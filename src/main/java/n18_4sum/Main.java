package n18_4sum;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
        System.out.println(solution.fourSum4(new int[]{1, 0, -1, 0, -2, 2}, 0));
        System.out.println(solution.fourSum(new int[]{2, 2, 2, 2, 2}, 8));
        System.out.println(solution.fourSum4(new int[]{2, 2, 2, 2, 2}, 8));
        System.out.println(solution.fourSum(new int[]{-3, -2, -1, 0, 0, 1, 2, 3}, 0));
        System.out.println(solution.fourSum4(new int[]{-3, -2, -1, 0, 0, 1, 2, 3}, 0));
        System.out.println(solution.fourSum(new int[]{1, -2, -5, -4, -3, 3, 3, 5}, -11));
        System.out.println(solution.fourSum4(new int[]{1, -2, -5, -4, -3, 3, 3, 5}, -11));
        System.out.println(solution.fourSum(new int[]{-4, -3, -2, -1, 0, 0, 1, 2, 3, 4}, 0));
        System.out.println(solution.fourSum4(new int[]{-4, -3, -2, -1, 0, 0, 1, 2, 3, 4}, 0));
        System.out.println(solution.fourSum(new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296));
        System.out.println(solution.fourSum4(new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296));
        System.out.println(solution.fourSum(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90}, 200));
        System.out.println(solution.fourSum4(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90}, 200));

    }
}
