import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        int a;

        while (true) {
            a = q.poll();
            if (q.isEmpty()) {
                System.out.println(a);
                break;
            }
            q.offer(q.poll());
        }
    }
}