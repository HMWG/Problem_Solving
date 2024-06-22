class Solution {
    static int count;
    public int solution(int[] numbers, int target) {
        count = 0;
        int answer = 0;
        dfs(0,true,numbers,target,0);
        dfs(0,false,numbers,target,0);
        
        
        return count;
    }
    static void dfs(int x,boolean p, int[] numbers, int target, int sum){
        if(p){
            sum += numbers[x];
        }
        else{
            sum -= numbers[x];
        }
        
        if(x==numbers.length-1){
            if(sum==target){
                count++;
            }
        }else{
            dfs(x+1,true,numbers,target,sum);
            dfs(x+1,false,numbers,target,sum);
        }
    }
}