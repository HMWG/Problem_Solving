import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n = Integer.parseInt(input);
		
		for(int t = 1; t <= n; t++){
			
			StringTokenizer sta = new StringTokenizer(br.readLine());
			StringTokenizer stb = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(sta.nextToken());
			int b = Integer.parseInt(stb.nextToken());
			
			int[] aa = {0,0,0,0};
			int[] ab = {0,0,0,0};
			
			for(int i = 0; i<a; i++){
				int x = Integer.parseInt(sta.nextToken());
				if(x==4){
					aa[0]++;
				}
				if(x==3){
					aa[1]++;
				}
				if(x==2){
					aa[2]++;
				}
				if(x==1){
					aa[3]++;
				}
				
			}
			for(int i = 0; i<b; i++){
				int x = Integer.parseInt(stb.nextToken());
				if(x==4){
					ab[0]++;
				}
				if(x==3){
					ab[1]++;
				}
				if(x==2){
					ab[2]++;
				}
				if(x==1){
					ab[3]++;
				}
				
			}
			
			if(aa[0]==ab[0]){
				if(aa[1]==ab[1]){
					if(aa[2]==ab[2]){
						if(aa[3]==ab[3]){
							System.out.printf("D\n");
						}
						else
							System.out.printf("%s\n",aa[3]>ab[3]?"A":"B");
					}
					else
						System.out.printf("%s\n",aa[2]>ab[2]?"A":"B");
				}
				else
					System.out.printf("%s\n",aa[1]>ab[1]?"A":"B");
			}
			else
				System.out.printf("%s\n",aa[0]>ab[0]?"A":"B");
			
			
		}
		System.out.println();
	}
	
}