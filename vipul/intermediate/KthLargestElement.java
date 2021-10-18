package vipul.intermediate;

import java.util.PriorityQueue;

/**
 * Find the Kth Maximum number in a given array in linear time complexity.
 */
public class KthLargestElement {

    public static int getKthLargestElement(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k);
        for (int val : arr) {
            if (priorityQueue.size() == k) {
                if (priorityQueue.peek() < val) {
                    priorityQueue.poll();
                    priorityQueue.add(val);
                }
            } else {
                priorityQueue.add(val);
            }
        }
        return priorityQueue.peek();
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 4, 3, 5};
        System.out.println(getKthLargestElement(input1, 2));

        int[] input2 = {1, 2, 2, 4, 4, 6, 5, 5};
        System.out.println(getKthLargestElement(input2, 3));
    }
}