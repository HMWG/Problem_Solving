import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] arr;
    static int count;
    static List<Point> list;
    static int min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr= new int[n][m];
        count=0;
        min = Integer.MAX_VALUE;
        list= new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]!=0 && arr[i][j]!=6){
                    list.add(new Point(i,j));
                }
            }
        }

        dfs(arr, 0);

        System.out.println(min);
    }

    static void dfs(int[][] a, int index){
        if(index == list.size()){
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(a[i][j]==0){
                        count++;
                    }
                }
            }
            min = Math.min(min, count);
            return;
        }

        int x = list.get(index).x;
        int y = list.get(index).y;
        int[][] ar = new int[n][m];

        if(arr[x][y]==1){
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < ar.length; j++) {
                    System.arraycopy(a[j], 0, ar[j], 0, a[0].length);
                }
                go(x, y, i, ar);
                dfs(ar, index+1);
            }
        }
        else if(arr[x][y]==2){
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < ar.length; j++) {
                    System.arraycopy(a[j], 0, ar[j], 0, a[0].length);
                }
                go(x, y, (i*2), ar);
                go(x, y, (i*2)+1, ar);
                dfs(ar, index+1);
            }
        }
        else if(arr[x][y]==3){
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < ar.length; j++) {
                    System.arraycopy(a[j], 0, ar[j], 0, a[0].length);
                }
                go(x, y, i%2, ar);
                go(x, y, (i/2)+2, ar);
                dfs(ar, index+1);
            }
        }
        else if(arr[x][y]==4){
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < ar.length; j++) {
                    System.arraycopy(a[j], 0, ar[j], 0, a[0].length);
                }
                go(x, y, i/3, ar);
                go(x, y, (i/2)+1, ar);
                go(x, y, i==0?2:3, ar);
                dfs(ar, index+1);
            }
        }
        else if(arr[x][y]==5){
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < ar.length; j++) {
                    System.arraycopy(a[j], 0, ar[j], 0, a[0].length);
                }
                go(x, y, 0, ar);
                go(x, y, 1, ar);
                go(x, y, 2, ar);
                go(x, y, 3, ar);
                dfs(ar, index+1);
            }
        }
    }
    
    static void go(int x, int y, int a, int[][] b){
        if(a == 0){
            while (check(x, y)){
                if(b[x][y]==6){
                    break;
                }
                if(b[x][y]==0){
                    b[x][y]=-1;
                }
                x += 1;
            }
        }
        if(a == 1){
            while (check(x, y)){
                if(b[x][y]==6){
                    break;
                }
                if(b[x][y]==0){
                    b[x][y]=-1;
                }
                x -= 1;
            }
        }
        if(a == 2){
            while (check(x, y)){
                if(b[x][y]==6){
                    break;
                }
                if(b[x][y]==0){
                    b[x][y]=-1;
                }
                y += 1;
            }
        }
        if(a == 3){
            while (check(x, y)){
                if(b[x][y]==6){
                    break;
                }
                if(b[x][y]==0){
                    b[x][y]=-1;
                }
                y -= 1;
            }
        }
    }

    static boolean check(int x, int y){
        return (x>=0 && y>=0 && x<n && y<m);
    }

    static class Point{
        int x, y;

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        Point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
}