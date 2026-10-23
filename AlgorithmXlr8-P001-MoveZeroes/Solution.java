import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextLong();

        // Write your solution here.
        // Print nums after moving all zeroes to the end, preserving the
        // relative order of the non-zero elements, space-separated.

        for (int zeroPointer = 0, nonZeroPointer = 0; nonZeroPointer < nums.length; nonZeroPointer++) {
            if(nums[nonZeroPointer] != 0) {
            	long temp = nums[nonZeroPointer];
            	nums[nonZeroPointer] = nums[zeroPointer];
            	nums[zeroPointer] = temp;
            	zeroPointer++;
            }
        }
        System.out.print(Arrays.toString(nums).replace(" ", ""));
    }
}
