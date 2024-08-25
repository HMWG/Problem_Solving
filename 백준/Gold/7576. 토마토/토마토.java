import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] arr;
    static int count;
    static Queue<Point> q;
    static boolean[][] visited;
    static int[] ax = {0,0,1,-1};
    static int[] ay = {1,-1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr= new int[n][m];
        count=0;
        q = new LinkedList<>();
        visited = new boolean[n][m];


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1){
                    q.offer(new Point(i,j,count));
                }
            }
        }
        while (!q.isEmpty()){
            Point p = q.poll();
            if(p.c!=count){
                count++;
            }
            for (int k = 0; k < 4; k++) {
                int dx = p.x + ax[k];
                int dy = p.y + ay[k];
                if (check(dx, dy)){
                    q.offer(new Point(dx,dy,count+1));
                    arr[dx][dy] = 1;
                    visited[dx][dy] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0){
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(count);
    }

    static boolean check(int x, int y){
        return (x>=0 && y>=0 && x<n && y<m && !visited[x][y] && arr[x][y]==0);
    }

    static class Point{
        int x, y, c;
        Point(int x, int y, int c){
            this.x=x;
            this.y=y;
            this.c=c;
        }
    }
}