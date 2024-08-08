import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        boolean[] dp = new boolean[arr[n-1]+1];
        dp[0] = true;
        dp[1] = true;

        for(int i = 2; i <= Math.sqrt(arr[n-1]); i++) {

            if (dp[i] == true) {
                continue;
            }

            for (int j = i * i; j < dp.length; j = j + i) {
                dp[j] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            if(!dp[arr[i]]) {
                count++;
            }
        }

        System.out.println(count);
    }
}