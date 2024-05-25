import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(br.readLine());

        int n = 2;
        int a = 2;
        int b = 2;

        int count = 0;
        int num = 0;

        while (count != x) {
            count++;
            num++;
            if (num == n) {
                num = 1;
                n++;
                if (n % 2 == 1) {
                    b = n;
                    a = 0;
                } else {
                    a = n;
                    b = 0;
                }
            }
            if (n % 2 == 1) {
                b--;
                a = n - b;
            } else {
                a--;
                b = n - a;
            }
        }

        sb.append(a).append("/").append(b);


        System.out.println(sb);
        br.close();
    }
}