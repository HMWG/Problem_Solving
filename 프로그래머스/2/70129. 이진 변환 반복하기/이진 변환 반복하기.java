import java.util.*;
class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int[2];
        int n = 0;
        int d = 0;
        
        while(!s.equals("1")){
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0'){
                    d++;
                }
            }
            s = s.replace("0","");
            
            System.out.println(s);
            
            s = Integer.toBinaryString(s.length());
            n++;
        }
        
        answer[0] = n;
        answer[1] = d;
        return answer;
    }
}