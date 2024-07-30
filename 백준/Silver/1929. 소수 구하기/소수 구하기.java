import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] dp = new boolean[n + 1];

        dp[0] = dp[1] = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(dp[i]){
                continue;
            }

            for(int j = i * i; j < n+1; j = j+i) {
                dp[j] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = m; i < n+1; i++) {
            if (!dp[i]){
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
