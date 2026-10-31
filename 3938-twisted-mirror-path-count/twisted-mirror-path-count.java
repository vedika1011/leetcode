class Solution {
    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int mod = 1_000_000_007;

        int[][][] dp = new int[m][n][2];

        // Initialize the first moves from (0,0)
        dp[0][1][0] = 1; // Move right
        dp[1][0][1] = 1; // Move down

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) {
                    continue;
                }

                // Process both incoming directions
                for (int d = 0; d < 2; d++) {

                    int ans = dp[i][j][d];

                    if (ans == 0) {
                        continue;
                    }

                    // Empty cell
                    if (grid[i][j] == 0) {

                        // Move down
                        if (i < m - 1) {
                            dp[i + 1][j][1] =
                                (dp[i + 1][j][1] + ans) % mod;
                        }

                        // Move right
                        if (j < n - 1) {
                            dp[i][j + 1][0] =
                                (dp[i][j + 1][0] + ans) % mod;
                        }
                    }

                    // Mirror cell: reflect based on incoming direction
                    else {

                        // moving down -> reflect right
                        if (d == 1 && j < n - 1) {
                            dp[i][j + 1][0] =
                                (dp[i][j + 1][0] + ans) % mod;
                        }

                        // moving right -> reflect down
                        else if (d == 0 && i < m - 1) {
                            dp[i + 1][j][1] =
                                (dp[i + 1][j][1] + ans) % mod;
                        }
                    }
                }
            }
        }

        // Add paths reaching destination from either direction
        return (dp[m - 1][n - 1][0]
              + dp[m - 1][n - 1][1]) % mod;
    }
}