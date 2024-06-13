import java.io.*;
import java.util.*;
class Main {
	static int n;
	static int[][] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		n = Integer.parseInt(input);
		
		int count = -1;
		
		map = new int[n+2][n+2];
		
		for(int i = 1; i < n+1; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j < n+1; j++){
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<n+2; i++){
			map[0][i] = 1;
			map[i][0] = 1;
			map[n+1][i] = 1;
			map[i][n+1] = 1;
		}
		
		boolean check = true;
		int[] dx = {0,0,1,-1};
		int[] dy = {1,-1,0,0};
		
		while(check){
			check = false;
			
			int[][] copy = new int[n+2][n+2];
			
			for(int i=0; i<n+2; i++){
				copy[i] = map[i].clone();
			}
			
			
			
			for(int i = 1; i < n+1; i++){
				for(int j = 1; j < n+1; j++){
					int q = 0;
					if(copy[i][j]!=0){
						check = true;
						for(int k=0; k<4; k++){
							int x = i+dx[k];
							int y = j+dy[k];
							if(copy[x][y]==0){
								q++;
							}
						}
						map[i][j] -= q;
						if(map[i][j]<0){
							map[i][j] = 0;
						}
					}
				}
			}
			count++;
		}
		
		
		
		System.out.println(count);
	}
}