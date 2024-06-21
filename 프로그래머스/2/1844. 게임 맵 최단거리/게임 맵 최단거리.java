import java.util.*;
class Solution {
    static int n;
    static int m;
    static boolean check;
    static int min;
    static int count;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    
    public int solution(int[][] maps) {
        int answer = 0;
        n = maps.length;
        m = maps[0].length;
        check = false;
        count = 0;
        min = Integer.MAX_VALUE;
                
        bfs(0,0,maps);
        
        if(check==true){
            return min;
        }
        else{
            return -1;
        }
        
    }
    static void bfs(int x, int y, int[][]maps){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y,1});
        maps[x][y]=0;
        
        while(!q.isEmpty()){
            int[] arr = q.poll();
            int a = arr[0];
            int b = arr[1];
            int c = arr[2];
            
            if(a==n-1&&b==m-1){
                check = true;
                min = c;
                return;
            }
            
            for(int i=0; i<4; i++){
                int nx = a+dx[i];
                int ny = b+dy[i];
                if(nx>=0&&nx<n&&ny>=0&&ny<m&&maps[nx][ny]==1){
                    q.add(new int[]{nx,ny,c+1});
                    maps[nx][ny]=0;
                }        
            }
        }
        
    }
    
//     static void dfs(int x, int y, int[][]maps){
//         count++;
//         if(x==n-1&&y==m-1){
//             check = true;
//             min = Math.min(min,count);
//         }
//         else{
//             for(int i=0; i<4; i++){
//                 int p = x+dx[i];
//                 int q = y+dy[i];
//                 if(p>=0&&p<n&&q>=0&&q<m&&maps[p][q]==1){
//                     maps[x][y]=0;
//                     dfs(p,q,maps);
//                     maps[x][y]=1;
//                 }        
//             }
                
//         }
//         count--;  
//     }
}