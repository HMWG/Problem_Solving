import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        long i = (right-left+1);
        int[] answer = new int[(int)i];
        //ArrayList<Integer> ans = new ArrayList<>();
        
        int x = 0;
        
        while(left<=right){
            long a = left/n;
            long b = left%n;
            long k;
            if(a>=b){
                k=a+1;
            }
            else{
                k=b+1;
            }
            answer[x] = (int)k;
            x++;
            //ans.add((int)k);
            left++;
        }
        
        return answer;
    }
}