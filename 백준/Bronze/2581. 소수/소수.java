import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        if (m == 1)
            m++;


        for (int i = m; i <= n; i++) {
            boolean c = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    c = false;
                    break;
                }
            }
            if (c) {
                arr.add(i);
            }
        }

        if (arr.isEmpty()) {
            System.out.println(-1);
        } else {
            arr.sort(Comparator.naturalOrder());

            for (Integer integer : arr) {
                sum += integer;
            }


            System.out.println(sum);
            System.out.println(arr.get(0));
        }


        br.close();
    }
}