class Solution {
    public long maxPoints(int[][] points) {
        int row = points.length;
        int col = points[0].length;
        long[] curr_row = new long[col];
        for (int c = 0; c < col; c++) {
            curr_row[c] = points[0][c];
        }

        for (int r = 1; r < row; r++) {
            long[] next_row = new long[col];
            long[] left = new long[col];
            long[] right = new long[col];

            for (int c = 0; c < col; c++) {
                next_row[c] = points[r][c];
            }

            left[0] = curr_row[0];
            for (int c = 1; c < col; c++) {
                left[c] = Math.max(curr_row[c], left[c - 1] - 1);
            }

            right[col - 1] = curr_row[col - 1];
            for (int c = col - 2; c >= 0; c--) {
                right[c] = Math.max(curr_row[c], right[c + 1] - 1);
            }

            for (int c = 0; c < col; c++) {
                next_row[c] += Math.max(right[c], left[c]);
            }

            curr_row = next_row;
        }
        long max = Arrays.stream(curr_row).max().getAsLong();
        return max;
    }
}