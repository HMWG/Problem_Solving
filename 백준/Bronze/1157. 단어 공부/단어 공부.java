import java.util.*;
import java.io.*;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String st = br.readLine();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<String> s = new ArrayList<>();
        int max = 0;
        String maxS = "";
        boolean check = false;
        boolean c = false;

        for (int i = 0; i < st.length(); i++) {
            String x = Character.toString(st.charAt(i)).toUpperCase();
            if (!s.contains(x)) {
                s.add(x);
                a.add(0);
            } else {
                int z = s.indexOf(x);
                a.set(z, a.get(z) + 1);
                max = Math.max(max, a.get(z));
            }
        }

        for (int i = 0; i < s.size(); i++) {
            if (a.get(i) == max) {
                if (!check) {
                    maxS = s.get(i);
                    check = true;
                } else
                    c = true;

            }
        }

        sb.append(c ? "?" : maxS);


        System.out.println(sb);
        br.close();
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}