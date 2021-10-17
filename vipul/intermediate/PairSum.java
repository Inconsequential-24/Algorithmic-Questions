package vipul.intermediate;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 */
public class PairSum {

    public static int[] findPair(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == sum - arr[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] input = {2, 7, 11, 15};
        int target = 9;
        int[] pair = findPair(input, target);
        if (pair.length == 0)
            System.out.println("Target not found");
        else
            System.out.println(Arrays.toString(pair));
    }

}