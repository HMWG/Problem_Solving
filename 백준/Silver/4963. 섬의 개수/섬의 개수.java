import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int w, h;
    static int[] dx = {-1, 0, 1, 0, 1, 1, -1, -1};
    static int[] dy = {0, -1, 0, 1, -1, 1, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w == 0 && h == 0){
                break;
            }
            map = new int[w][h];
            visited = new boolean[w][h];
            int count = 0;

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[j][i] = Integer.parseInt(st.nextToken());
                }
            }
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    if(map[i][j] == 1 && !visited[i][j]){
                        count++;
                        dfs(i, j);
                    }
                }
            }
            System.out.println(count);
        }
    }
    public static void dfs(int x, int y){
        if(visited[x][y]){
            return;
        }
        visited[x][y] = true;
        for(int k = 0; k < 8; k++){
            int nx = x + dx[k];
            int ny = y + dy[k];
            if(check(nx, ny)){
                dfs(nx, ny);
            }
        }
    }

    public static boolean check(int i, int j){
        if(i>=0 && j>=0 && i<w && j<h){
            if(!visited[i][j] && map[i][j]==1){
                return true;
            }
        }
        return false;
    }
}