import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = 10001;
        boolean[] arr = new boolean[n];
        for (int i = 1; i < n; i++) {
            int a = i;
            String[] s = Integer.toString(i).split("");
            for (int j = 0; j < s.length; j++) {
                a += Integer.parseInt(s[j]);
            }
            if(a<n){
                arr[a] = true;
            }
        }
        for (int i = 1; i < n; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }
}