import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, count;
    static int[][] arr;
    static boolean[][] visited;
    static int[] ax = {0,0,1,-1};
    static int[] ay = {1,-1,0,0};
    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];
        list = new ArrayList<>();
        count = 0;

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && arr[i][j] == 1){
                    count++;
                    list.add(0);
                    dfs(i, j);
                }
            }
        }

        list.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        sb.append(count).append('\n');
        for(int i : list){
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(int x, int y){
        if(visited[x][y] || arr[x][y] == 0){
            return;
        }
        visited[x][y] = true;
        list.set(count-1, list.get(count-1) + 1);

        for (int i = 0; i < 4; i++) {
            int dx = x + ax[i];
            int dy = y + ay[i];
            if(check(dx, dy)) {
                dfs(dx, dy);
            }
        }
    }

    static boolean check(int x, int y){
        return x >= 0 && y >= 0 && x < n && y < n && !visited[x][y] && arr[x][y] == 1;
    }
}