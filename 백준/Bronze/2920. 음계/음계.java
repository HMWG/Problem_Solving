import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = "";
        for (int i = 0; i < 8; i++) {
            s = s+st.nextToken();
        }
        if(s.equals("12345678"))
            System.out.println("ascending");
        else if (s.equals("87654321")) {
            System.out.println("descending");
        }
        else
            System.out.println("mixed");
    }
}
