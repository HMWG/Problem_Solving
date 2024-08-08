class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;
        
        for(int i=1; i<=r2; i++){
            long x2 = (long)Math.sqrt(Math.pow(r2,2) - Math.pow(i,2));
            long x1 = (long)Math.ceil(Math.sqrt(Math.pow(r1,2) - Math.pow(i,2)));
                
                answer += x2-x1+1;
        }
        
        return answer*4;
    }
}