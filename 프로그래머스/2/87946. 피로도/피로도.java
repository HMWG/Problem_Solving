import java.util.*;

class Solution {
    static int max;
    
    static boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        
        max = 0;
        
        visited = new boolean[dungeons.length];
        
        dfs(k, 0, 0, dungeons);
        
        return max;
    }
    
    static void dfs(int k, int index, int c, int[][] d){
        if(index == d.length){
            max = Math.max(max, c);
            
            return;
        }
        
        if(k<=0) return;
        
        for(int i = 0; i < d.length; i++){
            if(visited[i]) continue;
            
            visited[i] = true;
            
            if(k >= d[i][0]) {
                dfs(k-d[i][1], index+1, c+1, d);
            }
            else {
                dfs (k, index+1, c, d);
            }
            
            visited[i] = false;
        }
        
        
    }
}