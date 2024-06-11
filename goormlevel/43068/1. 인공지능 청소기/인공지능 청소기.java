import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int t = Integer.parseInt(input);
		
		for(int i = 1; i<=t; i++){
			int x = 0;
			int y = 0;
			int n = 0;
			
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			
			x = Math.abs(Integer.parseInt(st.nextToken()));
			y = Math.abs(Integer.parseInt(st.nextToken()));
			n = Math.abs(Integer.parseInt(st.nextToken()));
		
			
			if(x+y<=n){
				if(x+y-n == 0 || (x+y-n)%2 == 0){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
			}
			else{
				System.out.println("NO");
			}
			
			
			
			
			
			
			
		}
		
	}
}