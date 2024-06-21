class Solution {
    public long solution(int n) {
        long answer = 0;
        
        int[] dt = new int[2001];
        
        for(int i=0; i<2001; i++){
            dt[i] = 0;
        }
        dt[0] = 1;
        dt[1] = 2;
        
        for(int i=2; i<n; i++){
            dt[i] = (dt[i-1]+dt[i-2])%1234567;
        }
        
        return dt[n-1];
    }
}