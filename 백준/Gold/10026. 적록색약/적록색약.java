import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static String[][] arr;
    static boolean[][] visited;
    static int countA;
    static int countB;
    static int[] ax = {0,0,1,-1};
    static int[] ay = {1,-1,0,0};
    static Queue<int[]> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new String[n][n];
        visited = new boolean[n][n];
        countA = 0;
        countB = 0;
        q = new LinkedList<>();


        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                arr[i][j] = s[j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    countA++;
                    String s = arr[i][j];
                    dfs(i, j, s);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                visited[i][j] = false;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    countB++;
                    String s = arr[i][j];
                    dfsRG(i, j, s);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(countA).append(" ").append(countB);

        System.out.println(sb);
    }

    static void dfs(int x, int y, String s){
        visited[x][y] = true;
        int dx;
        int dy;
        for (int i = 0; i < 4; i++) {
            dx = x+ax[i];
            dy = y+ay[i];
            if (check(dx, dy, s)){
                dfs(dx, dy, s);
            }
        }
    }

    static void dfsRG(int x, int y, String s){
        visited[x][y] = true;
        int dx;
        int dy;
        for (int i = 0; i < 4; i++) {
            dx = x+ax[i];
            dy = y+ay[i];
            if (checkRG(dx, dy, s)){
                dfsRG(dx, dy, s);
            }
        }
    }

    static void bfs(int x, int y, String s){
        visited[x][y] = true;
        q.offer(new int[]{x, y});
        while (!q.isEmpty()){
            int[] cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int dx = cur[0]+ax[i];
                int dy = cur[1]+ay[i];
                if (check(dx, dy, s)){
                    q.offer(new int[]{dx, dy});
                    visited[dx][dy] = true;
                }
            }
        }
    }

    static void bfsRG(int x, int y, String s){
        visited[x][y] = true;
        q.offer(new int[]{x, y});
        while (!q.isEmpty()){
            int[] cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int dx = cur[0]+ax[i];
                int dy = cur[1]+ay[i];
                if (checkRG(dx, dy, s)){
                    q.offer(new int[]{dx, dy});
                    visited[dx][dy] = true;
                }
            }
        }
    }

    static boolean check(int x, int y, String s){
        return x >= 0 && y >= 0 && x < n && y < n && !visited[x][y] && arr[x][y].equals(s);
    }

    static boolean checkRG(int x, int y, String s){
        if (s.equals("R") || s.equals("G")){
            return x >= 0 && y >= 0 && x < n && y < n && !visited[x][y] && (arr[x][y].equals("R") || arr[x][y].equals("G"));
        }
        return x >= 0 && y >= 0 && x < n && y < n && !visited[x][y] && arr[x][y].equals(s);
    }

}