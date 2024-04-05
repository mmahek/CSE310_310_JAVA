package Dynamic Programming;

public class dp1 {
    
import java.util.*;

public class Main {

    public static int fibrec(int n, int dp[]) {
        if (n <= 1)
            return n;
        int first, second;
        first = fibrec(n - 1, dp);
        second = fibrec(n - 2, dp);
        return first + second;
    }

    public static int fibmemo(int n, int dp[]) {
        if (n <= 1)
            return n;
        int first, second;
        if (dp[n - 1] != -1)
            first = dp[n - 1];
        else
            first = fibmemo(n - 1, dp);
        if (dp[n - 2] != -1)
            second = dp[n - 2];
        else
            second = fibmemo(n - 2, dp);

        return first + second;
    }

    public static int fibtab(int n, int dp[]) {
        if (n <= 1)
            return n;
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 8;
        int[] dp = new int[n + 1];
        // Arrays.fill(dp,-1);
        System.out.println(fibtab(n, dp));
    }
}
}

