import java.util.*;
import java.io.*;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //StringTokenizer st = new StringTokenizer(br.readLine());

        int[][] map = new int[100][100];

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                map[i][j] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    map[100 - a - j][100 - b - k] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (map[i][j] == 1) {
                    count++;
                }
            }
        }

        sb.append(count);

        System.out.println(sb);
        br.close();
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}