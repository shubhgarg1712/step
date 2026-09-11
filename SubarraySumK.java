import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumK {

    static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {

            currentSum = currentSum + num;

            int requiredSum = currentSum - k;

            if (map.containsKey(requiredSum)) {
                count = count + map.get(requiredSum);
            }

            if (map.containsKey(currentSum)) {
                map.put(currentSum, map.get(currentSum) + 1);
            } else {
                map.put(currentSum, 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println(
            "Number of subarrays: " + subarraySum(nums, k)
        );
    }
}