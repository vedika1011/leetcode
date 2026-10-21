import java.util.*;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();

        if (nums1.length == 0 || nums2.length == 0 || k == 0) {
            return ans;
        }

        // Min-heap: [sum, i, j]
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        // Add the first pair from each row
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            pq.offer(new int[]{nums1[i] + nums2[0], i, 0});
        }

        while (k > 0 && !pq.isEmpty()) {
            int[] curr = pq.poll();

            int i = curr[1];
            int j = curr[2];

            // Add the pair to the answer
            ans.add(Arrays.asList(nums1[i], nums2[j]));

            // Add the next pair from the same row
            if (j + 1 < nums2.length) {
                pq.offer(new int[]{
                    nums1[i] + nums2[j + 1],
                    i,
                    j + 1
                });
            }

            k--;
        }

        return ans;
    }
}