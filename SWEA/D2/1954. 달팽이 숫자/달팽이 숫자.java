import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            n = sc.nextInt();
            arr = new int[n][n];
            visited = new boolean[n][n];

            temp = 1;

            dfs(0,0);

            StringBuilder sb = new StringBuilder();
            sb.append("#").append(test_case).append("\n");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.print(sb);
        }
    }
    static int n;
    static int[][] arr;
    static boolean[][] visited;
    static int temp;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

    static void dfs(int x,int y){
        visited[x][y] = true;
        arr[x][y] = temp;
        temp ++;
        int nx;
        int ny;

        nx = x + dx[3];
        ny = y + dy[3];
        if (check(nx,ny)) {
            if (x-1<0 || visited[x-1][y]){
                dfs(nx,ny);
            }
        }
        for (int i = 0; i < 3; i++) {
            nx = x + dx[i];
            ny = y + dy[i];
            if (check(nx,ny)) {
                dfs(nx,ny);
            }
        }

    }

    static boolean check(int x,int y){
        return x >= 0 && y >= 0 && x < n && y < n && !visited[x][y];
    }
}
