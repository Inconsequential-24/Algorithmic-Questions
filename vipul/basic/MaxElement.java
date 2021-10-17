package vipul.basic;

/**
 * Given a string S, check if it is palindrome or not.
 */
public class MaxElement {

    public static int getMaxElement(int[] arr) {
        int max = -1;

        for (int num : arr) {
            if (num > max)
                max = num;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        System.out.println(getMaxElement(input));
    }
}
