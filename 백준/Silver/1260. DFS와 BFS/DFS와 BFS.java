import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int v;
    static boolean[] visited;
    static int[][] graph;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken())-1;
        visited = new boolean[n];
        graph = new int[n][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        dfs(v);
        System.out.println();
        for (int i = 0; i < n; i++) {
            visited[i] = false;
        }
        bfs(v);
        br.close();
    }

    static void dfs(int x){
        visited[x] = true;
        System.out.print((x+1) +" ");
        for (int i = 0; i < n; i++) {
            if(graph[x][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }

    static void bfs(int x){
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        visited[x] = true;

        while (!q.isEmpty()){
            int a = q.poll();
            System.out.print((a+1) + " ");
            for (int i = 0; i < n; i++) {
                if(graph[a][i] == 1 && !visited[i]){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
