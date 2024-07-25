import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int min;
    static int n;
    static int[] s;
    static int[] b;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        min = Integer.MAX_VALUE;
        
        s = new int[n];
        b = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            s[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }
        comb(0,0,0, 0);

        System.out.println(min);
    }

    static void comb(int idx, int sMul, int bSum, int cnt){
        if(idx == n){
            if (cnt != 0){
                min = Math.min(min, Math.abs((sMul)-(bSum)));
            }
            return;
        }
        comb(idx+1, sMul, bSum, cnt);
        if(cnt != 0){
            comb(idx+1, sMul*s[idx], bSum+b[idx], cnt+1);
            min = Math.min(min, Math.abs((sMul)-(bSum)));
            return;
        }
        comb(idx+1, s[idx], b[idx], cnt+1);
    }
}
