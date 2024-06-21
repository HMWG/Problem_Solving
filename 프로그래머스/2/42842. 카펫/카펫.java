class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int x = (brown+4)/2;
        
        for(int i=3; i<x; i++){
            int a = x-i;
            if((a*i)-brown==yellow){
                answer[1] = a;
                answer[0] = i;
            }
        }
        
        
        
        
        
        return answer;
    }
}