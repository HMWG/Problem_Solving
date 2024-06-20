class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for(int i=1; i<=n/2; i++){
            int a = 0;
            for(int j=i; j<=n; j++){
                a+=j;
                if(a==n){
                    answer++;
                    break;
                }
                else if(a>n){
                    break;
                }
            }
        }
        
        
        return answer;
    }
}