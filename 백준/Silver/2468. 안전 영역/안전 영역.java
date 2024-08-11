import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int[][] arr;
    static boolean[][] visited;
    static int count;
    static int[] ax = {0,0,1,-1};
    static int[] ay = {1,-1,0,0};
    static Queue<int[]> q;
    static int maxCount;
    static int maxNum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        visited = new boolean[n][n];
        maxCount = 0;
        maxNum = 0;
        q = new LinkedList<>();


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int x = Integer.parseInt(st.nextToken());
                maxNum = Math.max(maxNum, x);
                arr[i][j] = x;
            }
        }

        for (int i = 0; i < maxNum; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    visited[j][k] = false;
                }
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (!visited[j][k] && arr[j][k] > i){
                        count++;
                        dfs(j, k, i);
                    }
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        System.out.println(maxCount);
    }

    static void dfs(int x, int y, int num){
        visited[x][y] = true;
        int dx;
        int dy;
        for (int i = 0; i < 4; i++) {
            dx = x+ax[i];
            dy = y+ay[i];
            if (check(dx, dy, num)){
                dfs(dx, dy, num);
            }
        }
    }

    static void bfs(int x, int y, int num){
        visited[x][y] = true;
        q.offer(new int[]{x, y});
        while (!q.isEmpty()){
            int[] cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int dx = cur[0]+ax[i];
                int dy = cur[1]+ay[i];
                if (check(dx, dy, num)){
                    q.offer(new int[]{dx, dy});
                    visited[dx][dy] = true;
                }
            }
        }
    }

    static boolean check(int x, int y, int num){
        return x >= 0 && y >= 0 && x < n && y < n && !visited[x][y] && arr[x][y] > num;
    }
}