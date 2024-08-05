import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        min = Integer.MAX_VALUE;

        int x = Integer.parseInt(br.readLine());

        dfs(x, -1);
        System.out.println(min);
    }

    static void dfs(int x, int count){
        int a=x, b=x, c=x;
        count ++;
        if (count > min){
            return;
        }
        if (x==1){
            min = Math.min(min, count);
            return;
        }
        if (x % 3 == 0) {
            a = a / 3;
            dfs(a, count);
        }
        if(x % 2 == 0){
            b = b / 2;
            dfs(b, count);
        }
        c--;
        dfs(c, count);

    }
}