import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int max;
    static int n;
    static int m;
    static String[] s;
    static String[] r;
    static List<String> ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st1.nextToken());
        m = Integer.parseInt(st1.nextToken());
        s = new String[m];
        r = new String[n];
        max = 0;
        ans = new ArrayList<>();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            s[i] = st2.nextToken();
        }
        Arrays.sort(s, Comparator.naturalOrder());

        comb(m-1,n-1);
        ans.sort(Comparator.naturalOrder());

        for (String s : ans){
            System.out.println(s);
        }
    }

    static void comb(int idx, int cnt){
        if(cnt == -1){
            int x = 0, y = 0;
            for (String i : r){
                if(i.equals("a")||i.equals("e")||i.equals("i")||i.equals("o")||i.equals("u")){
                    x++;
                }
                else {
                    y++;
                }
            }
            if(x >= 1 && y >= 2){
                StringBuilder s  = new StringBuilder();
                for (String j : r){
                    s.append(j);
                }
                ans.add(s.toString());
            }
            return;
        }
        if(idx == -1){
            return;
        }
        comb(idx-1, cnt);
        r[cnt] = s[idx];
        comb(idx-1, cnt-1);
    }
}
