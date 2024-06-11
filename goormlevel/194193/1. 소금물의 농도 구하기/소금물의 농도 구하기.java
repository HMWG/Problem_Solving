import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		
		float n = 0;
		float m = 0;
		float a = 0;
		double answer = 0;
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		a = 7/((n+m)/n);
		
		answer = Math.floor(a*100)/100;
		
		
		System.out.printf("%.2f",answer);
	}
}