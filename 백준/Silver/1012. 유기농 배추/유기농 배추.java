import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m, k;
    static int[][] arr;
    static boolean[][] visited;
    static int count;
    static int[] ax = {0,0,1,-1};
    static int[] ay = {1,-1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            arr = new int[m][n];
            count = 0;
            visited = new boolean[m][n];

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            for (int j = 0; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    if(arr[j][l] == 1 && !visited[j][l]){
                        dfs(j,l);
                        count ++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    static void dfs(int x, int y){
        visited[x][y] = true;
        int dx;
        int dy;
        for (int i = 0; i < 4; i++) {
            dx = x+ax[i];
            dy = y+ay[i];
            if (check(dx, dy)){
                dfs(dx, dy);
            }
        }
    }

    static boolean check(int x, int y){
        return x >= 0 && y >= 0 && x < m && y < n && !visited[x][y] && arr[x][y] == 1;
    }
}