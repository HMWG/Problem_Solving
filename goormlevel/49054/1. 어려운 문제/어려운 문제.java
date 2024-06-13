import java.io.*;
import java.util.*;
class Main {
	static int n;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		n = Integer.parseInt(input);
		long x = 0;
		x = factorial(n);
		
		if(n<6){
			while(x>10){
			String z = Long.toString(x);
			x=0;
			for(int i=0; i<z.length(); i++){
				x+=Integer.parseInt(Character.toString(z.charAt(i)));
			}
		}
			System.out.println(x);
		}
		else
		System.out.println(9);
		
		
		
		
	}
	
	static long factorial(int n){
		if(n!=0){
			return n*factorial(n-1);
		}
		else
			return 1;
	}
}