class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        PriorityQueue<int[]> h = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int t = 0; t < times.length; t++) {
            int[] arr = new int[3];
            arr[0] = times[t][0];
            arr[1] = times[t][1];
            arr[2] = t;
            h.add(arr);
        }

        PriorityQueue<int[]> s = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        PriorityQueue<Integer> a = new PriorityQueue<>();
        int nxtchair = 0;

        while (!h.isEmpty()) {
            int[] friend = h.poll();
            while (!s.isEmpty() && s.peek()[1] <= friend[0]) {
                a.add(s.poll()[2]);
            }

            int chair;
            if (!a.isEmpty()) {
                chair = a.poll();
            } else {
                chair = nxtchair++;
            }

            if (friend[2] == targetFriend) {
                return chair;
            }

            s.add(new int[]{friend[0], friend[1], chair});
        }
        return -1;
    }
}
