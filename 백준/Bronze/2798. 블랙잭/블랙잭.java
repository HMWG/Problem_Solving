import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int max;
    static int n;
    static int m;
    static int[] s;
    static int[] r;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st1.nextToken());
        m = Integer.parseInt(st1.nextToken());
        s = new int[n];
        r = new int[3];
        max = 0;
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(st2.nextToken());
        }

        comb(0,0);

        System.out.println(max);
    }

    static void comb(int idx, int cnt){
        if(cnt == 3){
            int sum = 0;
            for (int i:r){
                sum += i;
            }
            if(sum<=m){
                max = Math.max(max, sum);
            }
            return;
        }
        if(idx == n){
            return;
        }
        comb(idx+1, cnt);
        r[cnt] = s[idx];
        comb(idx+1, cnt+1);
    }
}
