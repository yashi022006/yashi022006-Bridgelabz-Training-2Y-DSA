// File: SlidingWindowMaximum.java
import java.util.Deque;
import java.util.LinkedList;

class SlidingWindowMaximum {

    static void maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {

            // Remove elements out of window
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // Print max
            if (i >= k - 1) {
                System.out.print(nums[dq.peekFirst()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        maxSlidingWindow(nums, k);
    }
}
