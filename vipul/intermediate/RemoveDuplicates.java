package vipul.intermediate;

import java.util.Arrays;

/**
 * Remove duplicates from a sorted array of positive numbers and return the remaining array, with the unique elements put towards the starting of the array, it doesn't matter what you put after the unique elements in the array.
 */
public class RemoveDuplicates {

    private static int[] removeDuplicates(int[] nums) {
        int[] newNums = new int[nums.length];
        Arrays.fill(newNums, -1);

        int index = 0;

        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            if (prev != num) {
                newNums[index] = prev;
                index++;
            }
            prev = num;
        }

        if (prev != newNums[index - 1])
            newNums[index] = prev;

        return newNums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 3, 4};
        nums = removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
}