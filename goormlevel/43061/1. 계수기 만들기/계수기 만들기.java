import java.io.*;
import java.util.*;
class Main {
	static int[] a;
	static int[] b;
	static int n;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		
		a = new int[n];
		b = new int[n];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			a[i] = Integer.parseInt(st1.nextToken());
			b[i] = Integer.parseInt(st2.nextToken());
		}
		
		for(int i = 0; i < k; i++){
			b[n-1]++;
			checkUp();
			
		}
		
		for(int i = 0; i < n; i++){
			sb.append(b[i]);
		}
		
		System.out.println(sb);
	}
	
	static void checkUp(){
		for(int j = 0; j < n-1; j++){
				if(b[n-1-j]>a[n-1-j]){
				b[n-1-j]=0;
				b[n-2-j]++;
				checkUp();
				}
			}
			if(b[0]>a[0]){
				b[0]=0;
				}	
	}
}