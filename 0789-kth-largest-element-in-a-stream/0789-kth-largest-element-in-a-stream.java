import java.util.PriorityQueue;

public class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>(k);

        // Add all elements in nums to the heap
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        // Add the new value to the heap
        if (minHeap.size() < k) {
            minHeap.offer(val); // Add element if the heap is not full
        } else if (val > minHeap.peek()) {
            minHeap.poll(); // Remove the smallest element
            minHeap.offer(val); // Add the new element
        }

        // The top of the heap is the kth largest element
        return minHeap.peek();
    }

    
}